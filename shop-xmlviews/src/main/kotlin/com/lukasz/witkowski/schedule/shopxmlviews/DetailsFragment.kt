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

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.lukasz.witkowski.schedule.shopxmlviews.databinding.DetailsFragmentBinding
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product
import kotlinx.coroutines.launch

class DetailsFragment: Fragment() {

    private val viewModel by activityViewModels<MainViewModel>()
    private var _binding: DetailsFragmentBinding? = null
    private val binding: DetailsFragmentBinding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible?"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DetailsFragmentBinding.inflate(inflater, container, false)
        observeCurrentProduct()
        return binding.root
    }

    private fun observeCurrentProduct() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.selectedProduct.collect {
                    populateUi(product = it)
                }
            }
        }
    }

    private fun populateUi(product: Product) {
        (activity as MainActivity).setToolbarTitle(product.name)
        with(binding) {
            priceTv.text = getString(R.string.price_template, product.price)
            stockTv.text = getString(R.string.stock_template, product.availableAmount)
            descriptionTv.text = product.description
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}