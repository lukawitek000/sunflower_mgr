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

import android.graphics.Rect
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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lukasz.witkowski.schedule.shopxmlviews.databinding.ProductListFragmentBinding
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product
import kotlinx.coroutines.launch

class ProductListFragment : Fragment() {

    private var _binding: ProductListFragmentBinding? = null
    private val binding: ProductListFragmentBinding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible?"
        }
    private lateinit var productsAdapter: ProductsAdapter
    private val viewModel by activityViewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ProductListFragmentBinding.inflate(inflater, container, false)
        (activity as MainActivity).setToolbarTitle("Products")
        setUpSearchView()
        setUpRecyclerView()
        setUpFilterSort()
        observeData()
        return binding.root
    }

    private fun setUpFilterSort() {
        binding.apply {
            filterIcon.setOnClickListener {
                findNavController().navigate(R.id.action_productListFragment_to_filterFragment)
            }
        }
    }

    private fun observeData() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.products.collect {
                    productsAdapter.submitList(it)
                }
            }
        }
    }

    private fun setUpRecyclerView() {
        productsAdapter = ProductsAdapter(
            onProductClicked = ::navigateToDetailsScreen
        )
        val pixels = resources.getDimensionPixelSize(R.dimen.recycler_view_spacing)
        val spacing = ItemSpacingDecoration(pixels)
        binding.productsRv.apply {
            adapter = productsAdapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(spacing)
        }
    }

    private fun navigateToDetailsScreen(product: Product) {
        viewModel.selectProduct(product)
        findNavController().navigate(R.id.action_productListFragment_to_detailsFragment)
    }

    private fun setUpSearchView() {
        binding.searchView.apply {
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    class ItemSpacingDecoration(
        private val space: Int,
    ) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(
            outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
        ) {
            outRect.top = space
            if (parent.getChildAdapterPosition(view) == parent.adapter?.itemCount?.minus(1)) {
                outRect.bottom = space // optional: space after last item
            }
        }
    }
}