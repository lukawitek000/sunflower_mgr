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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FilterScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
    navigateBack: () -> Unit,
) {
    val sorting by viewModel.sorting.collectAsState()
    val priceFilter by viewModel.priceFilter.collectAsState()
    val radioOptions = listOf(
        MainViewModel.SortType.PriceHighToLow,
        MainViewModel.SortType.PriceLowToHigh,
        MainViewModel.SortType.NewestFirst,
        MainViewModel.SortType.OldestFirst
    )
    Column(modifier.fillMaxSize().padding(8.dp)) {
        PriceSlider(
            initialFiltering = viewModel.initialPriceFilter,
            priceFilter,
            onValueChange = viewModel::onPriceFilterChanged
        )
        Sorting(
            modifier = Modifier.padding(top = 24.dp),
            radioOptions = radioOptions,
            selectedOption = sorting,
            onOptionSelected = viewModel::onSortingChanged
        )
        ControlButtons(
            modifier = Modifier.padding(top = 16.dp),
            onApplyClicked = {
                viewModel.applyFiltering()
                navigateBack()
            },
            onClearClicked = viewModel::clearFiltering
        )
    }

}

@Composable
fun PriceSlider(
    initialFiltering: ClosedFloatingPointRange<Float>,
    priceFilter: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier
) {
    val priceFrom = String.format("%.2f", priceFilter.start)
    val priceTo = String.format("%.2f", priceFilter.endInclusive)
    Column(modifier = modifier) {
        Text(text = "Price", fontSize = 24.sp)
        RangeSlider(
            modifier = Modifier.padding(top = 8.dp),
            valueRange = initialFiltering,
            value = priceFilter,
            onValueChange = onValueChange
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("From: $priceFrom")
            Text("To: $priceTo")
        }
    }
}

@Composable
fun Sorting(
    radioOptions: List<MainViewModel.SortType>,
    selectedOption: MainViewModel.SortType,
    onOptionSelected: (MainViewModel.SortType) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(modifier = Modifier.padding(bottom = 8.dp), text = "Sort by", fontSize = 24.sp)
        radioOptions.forEach {
            SortingOption(
                sortType = it,
                selected = it == selectedOption,
                onClick = { onOptionSelected(it) }
            )
        }
    }
}

@Composable
fun SortingOption(
    sortType: MainViewModel.SortType,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = selected, onClick = onClick)
        Text(text = sortType.toText())
    }
}

private fun MainViewModel.SortType.toText(): String {
    return when (this) {
        MainViewModel.SortType.PriceHighToLow -> "Price: High to Low"
        MainViewModel.SortType.PriceLowToHigh -> "Price: Low to High"
        MainViewModel.SortType.NewestFirst -> "Newest first"
        MainViewModel.SortType.OldestFirst -> "Oldest first"
        MainViewModel.SortType.None -> "None"
    }
}

@Composable
fun ControlButtons(
    modifier: Modifier = Modifier,
    onClearClicked: () -> Unit,
    onApplyClicked: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Button(onClick = onClearClicked) {
            Text(text = "Clear")
        }
        Button(onClick = onApplyClicked) {
            Text(text = "Apply")
        }
    }
}