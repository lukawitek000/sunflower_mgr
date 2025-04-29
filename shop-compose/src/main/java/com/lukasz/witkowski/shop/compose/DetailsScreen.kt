/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lukasz.witkowski.shop.compose

import android.widget.Toast
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.bumptech.glide.integration.compose.placeholder
import com.lukasz.witkowski.shop.compose.model.Product

@Composable
fun DetailsScreen(
    viewModel: MainViewModel,
    openBottomSheet: Boolean,
    closeBottomSheet: () -> Unit,
    modifier: Modifier = Modifier
) {
    val selectedCar by viewModel.selectedProduct.collectAsState()
    val carPrice = stringResource(R.string.price_template, selectedCar.price)
    val amount by viewModel.amount.collectAsState()
    val additionalInformation by viewModel.additionalInformation.collectAsState()
    val buyingStatus by viewModel.buyingStatus.collectAsState()
    if (buyingStatus == MainViewModel.BuyingStatus.SUCCESS) {
        closeBottomSheet()
        viewModel.cancelBuyingStatus()
        Toast.makeText(
            LocalContext.current,
            "Bought successfully",
            Toast.LENGTH_SHORT
        ).show()
    }

    BottomSheet(
        openBottomSheet = openBottomSheet,
        closeBottomSheet = closeBottomSheet,
        cleanBottomSheetValues = viewModel::cleanBottomSheetValues,
        carPrice = carPrice,
        amount = amount,
        updateAmount = viewModel::updateAmount,
        additionalInformation = additionalInformation,
        updateAdditionalInformation = viewModel::updateAdditionalInformation,
        onButtonClick = viewModel::buyProduct
    )
    ProductDetails(modifier, carPrice, selectedCar)
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun BottomSheet(
    openBottomSheet: Boolean,
    closeBottomSheet: () -> Unit,
    cleanBottomSheetValues: () -> Unit,
    onButtonClick: () -> Unit,
    carPrice: String,
    amount: String,
    updateAmount: (String) -> Unit,
    additionalInformation: String,
    updateAdditionalInformation: (String) -> Unit
) {
    var areTextFieldsEnabled by remember { mutableStateOf(true) }
    if (openBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = {
                closeBottomSheet()
                cleanBottomSheetValues()
            },
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    stringResource(R.string.buying_options),
                    fontSize = 32.sp,
                )
                Text(
                    carPrice,
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = 20.sp
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    label = { Text(stringResource(R.string.amount)) },
                    value = amount,
                    onValueChange = updateAmount,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    enabled = areTextFieldsEnabled,
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    label = { Text(stringResource(R.string.additional_information)) },
                    value = additionalInformation,
                    onValueChange = updateAdditionalInformation,
                    minLines = 3,
                    enabled = areTextFieldsEnabled
                )
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    AnimatingButton(
                        onButtonClick = {
                            areTextFieldsEnabled = false
                            onButtonClick()
                        },
                        text = stringResource(R.string.buy)
                    )
                }
            }
        }
    }
}

@Composable
private fun AnimatingButton(
    onButtonClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    var isButtonEnabled by remember { mutableStateOf(true) }
    var isAnimating by remember { mutableStateOf(false) }
    val infiniteTransition = rememberInfiniteTransition(label = "infinite button animation")
    val buttonWidthDp = 150.dp
    val density = LocalDensity.current
    val buttonWidthPx = remember(density, buttonWidthDp) {
        with(density) { buttonWidthDp.toPx() }
    }

    val offsetY by animateFloatAsState(
        targetValue = if (isAnimating) -buttonWidthPx else 0f,
        animationSpec = tween(durationMillis = 500, easing = LinearEasing),
        label = "button vertical movement",
    )

    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (isAnimating) 360f else 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "button rotation",
    )

    Button(
        onClick = {
            isAnimating = true
            isButtonEnabled = false
            onButtonClick()
        },
        modifier = modifier
            .width(buttonWidthDp)
            .graphicsLayer {
                translationY = offsetY
                rotationZ = rotation
            },
        enabled = isButtonEnabled
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = text,
            textAlign = TextAlign.Center
        )
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
private fun ProductDetails(
    modifier: Modifier,
    carPrice: String,
    selectedCar: Product
) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
    ) {
        GlideImage(
            model = selectedCar.imageUrl,
            contentDescription = stringResource(R.string.car_image),
            modifier = Modifier.fillMaxWidth(),
            failure = placeholder(R.drawable.placeholder_car),
        )
        Column(
            Modifier.padding(8.dp)
        ) {
            Text(text = carPrice, fontSize = 24.sp)
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = stringResource(R.string.stock_template, selectedCar.availableAmount),
                fontSize = 24.sp
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = selectedCar.description,
                fontSize = 16.sp
            )
        }
    }
}