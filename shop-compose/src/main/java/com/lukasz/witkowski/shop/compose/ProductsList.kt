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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.bumptech.glide.integration.compose.Placeholder
import com.bumptech.glide.integration.compose.placeholder
import com.lukasz.witkowski.schedule.shopxmlviews.model.Product

@Composable
fun ProductsListScreen(
    viewModel: MainViewModel,
    onNavigateToFiltering: () -> Unit,
    onNavigateToDetails: () -> Unit,
    modifier: Modifier = Modifier
) {
    val products by viewModel.displayedProducts.collectAsState()
    val query by viewModel.searchQuery.collectAsState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        SearchAndFiltering(
            modifier = Modifier.padding(bottom = 8.dp),
            query = query,
            onQueryChanged = viewModel::updateSearchQuery,
            onFilterClicked = onNavigateToFiltering
        )
        ProductsList(
            products,
            onProductClicked = {
                viewModel.selectProduct(it)
                onNavigateToDetails()
            }
        )
    }
}

@Composable
fun SearchAndFiltering(
    query: String,
    onQueryChanged: (String) -> Unit,
    onFilterClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            modifier = Modifier.weight(1f),
            value = query,
            onValueChange = onQueryChanged,
            label = { Text("Search") },
        )
        IconButton(
            onClick = onFilterClicked
        ) {
            Icon(
                painterResource(R.drawable.filter),
                contentDescription = "Filter",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }

}

@Composable
fun ProductsList(
    products: List<Product>,
    onProductClicked: (Product) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(products) {
            ProductCard(product = it, onProductClicked = onProductClicked)
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ProductCard(
    product: Product,
    onProductClicked: (Product) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GlideImage(
                model = product.imageUrl,
                contentDescription = "${product.name} image",
                modifier = Modifier.size(64.dp),
                failure = placeholder(R.drawable.placeholder_car),
            )
            Column(Modifier
                .padding(horizontal = 8.dp)
                .weight(1f)) {
                Text(product.name, fontSize = 24.sp)
                Text(
                    product.shortDescription,
                    modifier = Modifier.padding(top = 4.dp),
                    fontSize = 16.sp,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }
            IconButton(
                modifier = Modifier.size(32.dp),
                onClick = { onProductClicked(product) }
            ) {
                Icon(
                    Icons.Filled.PlayArrow,
                    contentDescription = "More details button",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}