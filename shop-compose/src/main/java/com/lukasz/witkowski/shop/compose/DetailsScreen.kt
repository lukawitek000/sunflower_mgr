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

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.input.KeyboardType
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
    val carPrice = String.format("%.2f", selectedCar.price)
    val amount by viewModel.amount.collectAsState()
    val additionalInformation by viewModel.additionalInformation.collectAsState()
    val buyingStatus by viewModel.buyingStatus.collectAsState()
    if (buyingStatus == MainViewModel.BuyingStatus.SUCCESS) {
        closeBottomSheet()
        viewModel.cancelBuyingStatus()
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
                    "Buying options",
                    fontSize = 32.sp,
                )
                Text(
                    "Price: $carPrice €",
                    modifier = Modifier.padding(top = 16.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    label = { Text("Amount") },
                    value = amount,
                    onValueChange = updateAmount,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    label = { Text("Additional information") },
                    value = additionalInformation,
                    onValueChange = updateAdditionalInformation,
                    minLines = 3,
                    )
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    AnimatingButton(
                        onButtonClick = onButtonClick,
                        text = "Buy"
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
    var isAnimating by remember { mutableStateOf(false) }
    val infiniteTransition = rememberInfiniteTransition(label = "infinite button animation")

    val offsetY by animateFloatAsState(
        targetValue = if (isAnimating) -300f else 0f,
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
            onButtonClick()
        },
        modifier = modifier.graphicsLayer {
            translationY = offsetY
            rotationZ = rotation
        }
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 64.dp),
            text = text
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
            contentDescription = "${selectedCar.name} image",
            modifier = Modifier.fillMaxWidth(),
            failure = placeholder(R.drawable.placeholder_car),
        )
        Column(
            Modifier.padding(8.dp)
        ) {
            Text(text = "Price: $carPrice €", fontSize = 24.sp)
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = "Available in stock: ${selectedCar.availableAmount}",
                fontSize = 24.sp
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = selectedCar.description
            )
        }
    }
}