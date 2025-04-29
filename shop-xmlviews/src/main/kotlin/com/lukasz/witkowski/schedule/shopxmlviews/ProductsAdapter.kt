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

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.lukasz.witkowski.schedule.shopxmlviews.databinding.ProductCardBinding
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product

class ProductsAdapter(private val onProductClicked: (Product) -> Unit) :
    ListAdapter<Product, ProductsAdapter.ProductViewHolder>(ProductDiffCallback) {

    class ProductViewHolder(private val binding: ProductCardBinding, private val onClickListener: (Product) -> Unit) :
        ViewHolder(binding.root) {

        fun bind(product: Product) {
            with(binding) {
                nameTv.text = product.name
                shortDescrptionTv.text = product.shortDescription
                imageButton.setOnClickListener { onClickListener(product) }
                Glide.with(root)
                    .load(product.imageUrl)
                    .into(productIv)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ProductCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ProductViewHolder(binding, onProductClicked)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    object ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }

    }
}