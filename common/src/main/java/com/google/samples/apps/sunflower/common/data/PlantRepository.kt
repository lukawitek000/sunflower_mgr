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

package com.google.samples.apps.sunflower.common.data

import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository module for handling data operations.
 *
 * Collecting from the Flows in [PlantDao] is main-safe.  Room supports Coroutines and moves the
 * query execution off of the main thread.
 */
@Singleton
class PlantRepository @Inject constructor() {

    fun getPlants() = flow<List<Plant>> {
        emit(FakeDatabase.plantList)
    }

    fun getPlant(plantId: String) = flow<Plant?> {
        FakeDatabase.plantList.firstOrNull { it.plantId == plantId }?.let {
            emit(it)
        }
    }

    fun getPlantsWithGrowZoneNumber(growZoneNumber: Int) = flow<List<Plant>> {
        FakeDatabase.plantList.filter { it.growZoneNumber == growZoneNumber }.let {
            emit(it)
        }
    }
}
