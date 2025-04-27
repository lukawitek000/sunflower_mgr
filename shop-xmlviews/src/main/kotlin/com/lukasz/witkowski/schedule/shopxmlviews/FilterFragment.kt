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
import androidx.navigation.fragment.findNavController
import com.lukasz.witkowski.schedule.shopxmlviews.databinding.FilterFragmentBinding
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product
import kotlinx.coroutines.launch

class FilterFragment : Fragment() {

    private var _binding: FilterFragmentBinding? = null
    private val binding: FilterFragmentBinding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible?"
        }
    private val viewModel by activityViewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FilterFragmentBinding.inflate(inflater, container, false)
        (activity as MainActivity).setToolbarTitle("Filters")
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.products.collect {
                    setUpUi(it)
                }
            }
        }
        return binding.root
    }

    private fun setUpUi(products: List<Product>) {
        setUpRangeSelector(products)
        setUpClearButton()
        setUpApplyButton()
    }

    private fun setUpRangeSelector(products: List<Product>) {
        binding.apply {
            val minValue = products.minOf { it.price.toFloat() }
            val maxValue = products.maxOf { it.price.toFloat() }
            rangeSlider.valueFrom = minValue
            rangeSlider.valueTo = maxValue
            rangeSlider.values = listOf(minValue, maxValue)
        }
    }

    private fun setUpClearButton() {
        binding.apply {
            cleanBtn.setOnClickListener {
                rangeSlider.values = listOf(rangeSlider.valueFrom, rangeSlider.valueTo)
                radioGroup.clearCheck()
                viewModel.clearFiltering()
            }
        }
    }

    private fun setUpApplyButton() {
        binding.apply {
            applyBtn.setOnClickListener {
                val minPrice = rangeSlider.values[0]
                val maxPrice = rangeSlider.values[1]
                val sortType = when (radioGroup.checkedRadioButtonId) {
                    R.id.radioButton1 -> MainViewModel.SortType.PRICE_LOW_TO_HIGH
                    R.id.radioButton2 -> MainViewModel.SortType.PRICE_HIGH_TO_LOW
                    R.id.radioButton3 -> MainViewModel.SortType.NEWEST_FIRST
                    R.id.radioButton4 -> MainViewModel.SortType.OLDEST_FIRST
                    else -> MainViewModel.SortType.NONE
                }
                viewModel.applyFiltering(minPrice, maxPrice, sortType)
                findNavController().navigateUp()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}