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

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lukasz.witkowski.shop.compose.model.ALL_PRODUCTS
import com.lukasz.witkowski.shop.compose.model.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class MainViewModel : ViewModel() {

    private val _products = MutableStateFlow(ALL_PRODUCTS)
    private val initialFiltering = Filtering(
        minPrice = _products.value.minOf { it.price.toFloat() },
        maxPrice = _products.value.maxOf { it.price.toFloat() },
        sortType = SortType.None
    )
    val initialPriceFilter = initialFiltering.minPrice..initialFiltering.maxPrice
    private val _priceFilter = MutableStateFlow(initialPriceFilter)
    val priceFilter: StateFlow<ClosedFloatingPointRange<Float>>
        get() = _priceFilter
    private val _sorting = MutableStateFlow(initialFiltering.sortType)
    val sorting: StateFlow<SortType>
        get() = _sorting
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String>
        get() = _searchQuery
    private val _filterSettings = MutableStateFlow(initialFiltering)

    val displayedProducts: StateFlow<List<Product>> =
        combine(_products, _searchQuery, _filterSettings) { wholeList, query, filter ->
            filter.filter(wholeList).filter {
                it.name.contains(query, ignoreCase = true)
            }
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = _products.value
        )

    private var _selectedProduct = MutableStateFlow(ALL_PRODUCTS.first())
    val selectedProduct: StateFlow<Product>
        get() = _selectedProduct

    private val _buyingStatus = MutableStateFlow(BuyingStatus.IDLE)
    val buyingStatus: StateFlow<BuyingStatus>
        get() = _buyingStatus

    private val _amount = MutableStateFlow("")
    val amount: StateFlow<String>
        get() = _amount
    private val _additionalInformation = MutableStateFlow("")
    val additionalInformation: StateFlow<String>
        get() = _additionalInformation

    fun updateAmount(amount: String) {
        _amount.value = amount
    }

    fun updateAdditionalInformation(additionalInformation: String) {
        _additionalInformation.value = additionalInformation
    }

    fun cleanBottomSheetValues() {
        _amount.value = ""
        _additionalInformation.value = ""
    }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

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

    fun cancelBuyingStatus() {
        _buyingStatus.value = BuyingStatus.IDLE
    }

    fun clearFiltering() {
        _filterSettings.value = initialFiltering
        _priceFilter.value = initialPriceFilter
        _sorting.value = initialFiltering.sortType
    }

    fun applyFiltering() {
        _filterSettings.value =
            Filtering(_priceFilter.value.start, _priceFilter.value.endInclusive, _sorting.value)
    }

    fun onSortingChanged(sortType: SortType) {
        _sorting.value = sortType
    }

    fun onPriceFilterChanged(priceFilter: ClosedFloatingPointRange<Float>) {
        _priceFilter.value = priceFilter
    }


    enum class BuyingStatus {
        IDLE, LOADING, SUCCESS
    }

    class Filtering(
        val minPrice: Float,
        val maxPrice: Float,
        val sortType: SortType
    ) {
        fun filter(products: List<Product>): List<Product> {
            return products
                .filter { it.price in minPrice..maxPrice }
                .sortedWith { p1, p2 ->
                    sortType.compareProducts(p1, p2)
                }
        }
    }

    sealed interface SortType {
        fun compareProducts(product1: Product, product2: Product): Int

        object PriceLowToHigh : SortType {
            override fun compareProducts(product1: Product, product2: Product): Int {
                return product1.price.compareTo(product2.price)
            }
        }

        object PriceHighToLow : SortType {
            override fun compareProducts(product1: Product, product2: Product): Int {
                return product2.price.compareTo(product1.price)
            }
        }

        object NewestFirst : SortType {
            override fun compareProducts(product1: Product, product2: Product): Int {
                return product2.productionYear.compareTo(product1.productionYear)
            }
        }

        object OldestFirst : SortType {
            override fun compareProducts(product1: Product, product2: Product): Int {
                return product1.productionYear.compareTo(product2.productionYear)
            }
        }

        object None : SortType {
            override fun compareProducts(product1: Product, product2: Product): Int {
                return 0
            }
        }
    }
}