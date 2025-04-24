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
import com.lukasz.witkowski.schedule.shopxmlviews.model.ALL_PRODUCTS
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _products = MutableStateFlow(ALL_PRODUCTS)
    val products: StateFlow<List<Product>>
        get() = _products

    private var _selectedProduct = MutableStateFlow<Product?>(null)
    val selectedProduct: StateFlow<Product>
        get() = _selectedProduct as StateFlow<Product>
    // TODO how to do it above

    fun selectProduct(product: Product) {
        _selectedProduct.value = product
    }

}