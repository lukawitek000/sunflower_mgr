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

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun ShopApp(viewModel: MainViewModel = viewModel()) {
    val navController = rememberNavController()
    ShopNavHost(
        navController,
        viewModel,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopNavHost(
    navController: NavHostController,
    viewModel: MainViewModel,
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route
    var openBottomSheet by rememberSaveable { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Products") },
                navigationIcon = {
                    if (currentRoute != Screen.ProductsList.route) {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.secondary
                )
            )
        },
        floatingActionButton = {
            if (currentRoute == Screen.ProductDetails.route) {
                FloatingActionButton(
                    modifier = Modifier.size(56.dp),
                    onClick = { openBottomSheet = true },
                    containerColor = MaterialTheme.colorScheme.secondary
                ) {
                    Icon(
                        painterResource(R.drawable.shop_icon),
                        contentDescription = "Buy",
                        modifier = Modifier.size(32.dp),
                        tint = Color.Unspecified,
                    )
                }
            }
        },
        containerColor = MaterialTheme.colorScheme.background
    ) { contentPadding ->
        NavHost(
            modifier = Modifier.padding(contentPadding),
            navController = navController,
            startDestination = Screen.ProductsList.route
        ) {
            composable(route = Screen.ProductsList.route) {
                ProductsListScreen(
                    viewModel = viewModel,
                    onNavigateToFiltering = {
                        navController.navigate(Screen.Filtering.route)
                    },
                    onNavigateToDetails = {
                        navController.navigate(Screen.ProductDetails.route)
                    }
                )
            }
            composable(route = Screen.ProductDetails.route) {
                DetailsScreen(
                    viewModel = viewModel,
                    openBottomSheet = openBottomSheet,
                    closeBottomSheet = { openBottomSheet = false }
                )
            }
            composable(route = Screen.Filtering.route) {
                FilterScreen(
                    viewModel = viewModel,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }

        }
    }

}