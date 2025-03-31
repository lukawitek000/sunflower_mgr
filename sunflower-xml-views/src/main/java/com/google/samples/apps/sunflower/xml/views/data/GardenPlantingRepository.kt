/*
 * Copyright 2018 Google LLC
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

package com.google.samples.apps.sunflower.xml.views.data

import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GardenPlantingRepository @Inject constructor(
) {

    fun createGardenPlanting(plantId: String) {
        val gardenPlanting = GardenPlanting(plantId)
        FakeDatabase.addGardenPlanting(gardenPlanting)
    }

    fun isPlanted(plantId: String) = FakeDatabase.gardenPlantings.map { gardenPlantings ->
        gardenPlantings.any { it.plantId == plantId }
    }

    fun getPlantedGardens() = FakeDatabase.gardenPlantings.map { gardenPlantings ->
        val plants = FakeDatabase.plantList.filter {
            plant -> gardenPlantings.any { plant.plantId == it.plantId }
        }
        val plantAndGardenPlantings = plants.map { plant ->
            PlantAndGardenPlantings(plant, gardenPlantings.filter { it.plantId == plant.plantId })
        }
        plantAndGardenPlantings
    }
}
