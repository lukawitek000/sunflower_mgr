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

package com.lukasz.witkowski.schedule.shopxmlviews

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lukasz.witkowski.schedule.shopxmlviews.model.ALL_PRODUCTS
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class MainViewModel : ViewModel() {

    private val _products = MutableStateFlow(ALL_PRODUCTS)
    val products: StateFlow<List<Product>>
        get() = _products

    private var _selectedProduct = MutableStateFlow(ALL_PRODUCTS.first())
    val selectedProduct: StateFlow<Product>
        get() = _selectedProduct

    private val _buyingStatus = MutableStateFlow(BuyingStatus.IDLE)
    val buyingStatus: StateFlow<BuyingStatus>
        get() = _buyingStatus

    fun selectProduct(product: Product) {
        _selectedProduct.value = product
    }

    fun buyProduct() {
        viewModelScope.launch {
            _buyingStatus.value = BuyingStatus.LOADING
            delay(5.seconds)
            _buyingStatus.value = BuyingStatus.SUCCESS
        }
    }

    fun clearFiltering() {

    }

    fun applyFiltering(minPrice: Float, maxPrice: Float, sortType: SortType) {

    }

    enum class BuyingStatus {
        IDLE, LOADING, SUCCESS
    }

    enum class SortType {
        PRICE_LOW_TO_HIGH,
        PRICE_HIGH_TO_LOW,
        NEWEST_FIRST,
        OLDEST_FIRST,
        NONE,
    }

}