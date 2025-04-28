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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product

@OptIn(ExperimentalMaterial3Api::class)
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

    BottomSheet(
        openBottomSheet = openBottomSheet,
        closeBottomSheet = closeBottomSheet,
        cleanBottomSheetValues = viewModel::cleanBottomSheetValues,
        carPrice = carPrice,
        amount = amount,
        updateAmount = viewModel::updateAmount,
        additionalInformation = additionalInformation,
        updateAdditionalInformation = viewModel::updateAdditionalInformation
    )
    ProductDetails(modifier, carPrice, selectedCar)
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun BottomSheet(
    openBottomSheet: Boolean,
    closeBottomSheet: () -> Unit,
    cleanBottomSheetValues: () -> Unit,
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
                    Button(
                        onClick = {
                            closeBottomSheet()
                            cleanBottomSheetValues()
                        },
                    ) {
                        Text(
                            modifier = Modifier.padding(horizontal = 64.dp),
                            text = "Buy"
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ProductDetails(
    modifier: Modifier,
    carPrice: String,
    selectedCar: Product
) {
    Column(modifier = modifier.fillMaxSize()) {
        Image(
            painterResource(R.drawable.placeholder_car),
            modifier = Modifier.fillMaxWidth(),
            contentDescription = "Car image"
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