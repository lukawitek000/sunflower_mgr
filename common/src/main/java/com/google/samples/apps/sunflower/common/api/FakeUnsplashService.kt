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

package com.google.samples.apps.sunflower.common.api

import com.google.samples.apps.sunflower.common.data.UnsplashPhoto
import com.google.samples.apps.sunflower.common.data.UnsplashPhotoUrls
import com.google.samples.apps.sunflower.common.data.UnsplashUser

object FakeUnsplashService {

    private val applePhotos = unsplashPhotos1 + unsplashPhotos2 + unsplashPhotos3 + unsplashPhotos4 + unsplashPhotos5

    val totalPages = (applePhotos.size / 25) + 1

    fun queryApplePhotos(page: Int, perPage: Int): List<UnsplashPhoto> {
        return applePhotos.subList((page - 1) * perPage, page * perPage)
    }
}

private val unsplashPhotos1 = listOf(
    UnsplashPhoto(
        id = "CoqJGsFVJtM",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1570913149827-d2ac84ab3f9a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxfHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Priscilla Du Preez 🇨🇦", username = "priscilladupreez")
    ),
    UnsplashPhoto(
        id = "gDPaDDy6_WE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1568702846914-96b305d2aaeb?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwyfHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "an_vision", username = "anvision")
    ),
    UnsplashPhoto(
        id = "MardkT836BU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1579613832125-5d34a13ffe2a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzfHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Louis Hansel", username = "louishansel")
    ),
    UnsplashPhoto(
        id = "H6VxhE_x-kE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1589217157232-464b505b197f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0fHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Robson Melo", username = "bobmelo")
    ),
    UnsplashPhoto(
        id = "oo3kSFZ7uHk",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1590005354167-6da97870c757?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1fHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Estúdio Bloom", username = "estudiobloom")
    ),
    UnsplashPhoto(
        id = "wXuzS9xR49M",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1560806887-1e4cd0b6cbd6?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2fHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Matheus Cenali", username = "cenali")
    ),
    UnsplashPhoto(
        id = "3D6yReT06p0",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1576179635662-9d1983e97e1e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3fHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Marek Studzinski", username = "jccards")
    ),
    UnsplashPhoto(
        id = "zLCR7RsxYGs",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1630563451961-ac2ff27616ab?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4fHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Tobi", username = "waiheng_tobi")
    ),
    UnsplashPhoto(
        id = "oJGca8Ch828",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1584306670957-acf935f5033c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5fHxBcHBsZXxlbnwwfHx8fDE3NDM0Mjk0OTB8MA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Sara Cervera", username = "saracervera")
    ),
    UnsplashPhoto(
        id = "hFBsF-CX5eQ",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1552255349-450c59a5ec8e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Nikolai Chernichenko", username = "perfectcoding")
    )
)

val unsplashPhotos2 = listOf(
    UnsplashPhoto(
        id = "P2X7NDx_GP0",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1610397962076-02407a169a5b?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwyNnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "James Yarema", username = "jamesyarema")
    ),
    UnsplashPhoto(
        id = "71JHj_t-kS0",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1612800694220-35a0a24e7f98?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwyN3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Tuqa Nabi", username = "tuqa")
    ),
    UnsplashPhoto(
        id = "53Ut6qrRrtU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1587092658848-828238691286?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwyOHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Karla Hernandez", username = "karlahrnndz")
    ),
    UnsplashPhoto(
        id = "7DOU5NlNIcE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1579693409321-1be2df1ab130?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwyOXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Zhiyue", username = "zhiyue")
    ),
    UnsplashPhoto(
        id = "6cdIdu8KkLg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1580974928064-f0aeef70895a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzMHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Hugo Agut tugal", username = "hugoagut")
    ),
    UnsplashPhoto(
        id = "p-wzirREFBk",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1597271131568-654a4a827f89?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzMXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Olga Subach", username = "create4eyes")
    ),
    UnsplashPhoto(
        id = "MjeQdrPWEfc",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1600752085601-1ec2646cd736?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzMnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Sokmean Nou", username = "missxnou")
    ),
    UnsplashPhoto(
        id = "vm6hIANqWLY",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1635633177137-66d009ce62b6?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzM3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Matze Weiss", username = "matzeweiss")
    ),
    UnsplashPhoto(
        id = "bIgpii04UIg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1621768216002-5ac171876625?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzNHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Sumudu Mohottige", username = "stm_2790")
    ),
    UnsplashPhoto(
        id = "2ip11Nhylts",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1636958926605-2016302f4e35?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzNXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Julia Kicova", username = "justjullietta")
    ),
    UnsplashPhoto(
        id = "M0YK2yAZI5M",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1563902840807-bcacd7672b89?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzNnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Alireza Khoddam", username = "alixrezax")
    ),
    UnsplashPhoto(
        id = "xJneeemyLcA",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1603926295083-850ecd5fa6ad?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzN3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Adam Nir", username = "adamnir")
    ),
    UnsplashPhoto(
        id = "BqOTmSUQHvg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1512578659172-63a4634c05ec?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzOHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Kotagauni Srinivas", username = "kotagauni_srinivas")
    ),
    UnsplashPhoto(
        id = "DpfXrAjlIro",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1611892283476-f7ed5de3359f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwzOXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Daniela Crucez", username = "danielacrucez")
    ),
    UnsplashPhoto(
        id = "QZub8Ni3x_c",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1485527172732-c00ba1bf8929?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0MHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Jony Ariadi", username = "joniastin")
    ),
    UnsplashPhoto(
        id = "CNpYALGZhMo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1506277548624-5d9498cde122?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0MXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Aarón Blanco Tejedor", username = "the_meaning_of_love")
    ),
    UnsplashPhoto(
        id = "hRbt11o8cEU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1598170845055-806a9e9f3f72?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0Mnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "K8", username = "_k8_")
    ),
    UnsplashPhoto(
        id = "hJDSH3BEBI4",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1594854094685-24273329bb91?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0M3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "JESUS ECA", username = "jesus_eca")
    ),
    UnsplashPhoto(
        id = "bPy13xFS1D8",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1568462698116-7bdbdb668656?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0NHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Olesia Bahrii", username = "olesia_bahrii")
    ),
    UnsplashPhoto(
        id = "lwaw_DL09S4",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1516163173352-d1c4d006f9ac?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0NXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Xiong Yan", username = "slothxbear")
    ),
    UnsplashPhoto(
        id = "FZU6emgWeaQ",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1508116916455-2857e44c161e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0Nnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Kari Shea", username = "karishea")
    ),
    UnsplashPhoto(
        id = "LCDYCLEJlEo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1617235178117-a1f5fecb72bd?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0N3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Terra Slaybaugh", username = "terras")
    ),
    UnsplashPhoto(
        id = "CL79xFmRzdU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1605693681435-118b1347d08f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0OHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "mohamed hassouna", username = "mhassouna931")
    ),
    UnsplashPhoto(
        id = "EOkSmKTnzuU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1601291888371-bcf5759bae4e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw0OXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Umesh Soni", username = "umeshsonii")
    ),
    UnsplashPhoto(
        id = "1uVH7qA7CfM",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1585233056061-18fe3007435c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1MHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NDkwfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Sincerely Media", username = "sincerelymedia")
    )
)

val unsplashPhotos3 = listOf(
    UnsplashPhoto(
        id = "v7oWAumWyiA",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1572166365087-96ac83103260?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1MXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Fumiaki Hayashi", username = "fumirin")
    ),
    UnsplashPhoto(
        id = "WSHCZC-caJs",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/flagged/photo-1565241758499-3bf9d63d9094?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1Mnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Lians Jadan", username = "lians")
    ),
    UnsplashPhoto(
        id = "4Bj27zMqNSE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1613061527119-56ad37b8a581?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1M3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Vera De", username = "veruschkade")
    ),
    UnsplashPhoto(
        id = "LQTdG9SJpyA",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1630313877297-8773445184b9?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1NHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "SIMON LEE", username = "simonppt")
    ),
    UnsplashPhoto(
        id = "fDUj3kXilHQ",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1477830530828-c849c4b9bf2d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1NXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Roberta Sorge", username = "robertina")
    ),
    UnsplashPhoto(
        id = "WchSwFIrzKs",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1633073287133-681bdce6a9df?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1Nnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Jona Novak", username = "jonanovak")
    ),
    UnsplashPhoto(
        id = "t2ZIt-WNXrk",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1600423115367-87ea7661688f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1N3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Chris Dez", username = "c2z")
    ),
    UnsplashPhoto(
        id = "XiWQbLEhFyo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1615485925600-97237c4fc1ec?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1OHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Mockup Graphics", username = "mockupgraphics")
    ),
    UnsplashPhoto(
        id = "f-3mUXFLY2o",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1503852460961-aa7ffdd3d64d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw1OXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Medhat Dawoud", username = "medhatdawoud")
    ),
    UnsplashPhoto(
        id = "qSXBBSFfxaM",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1581812991409-eda9348482be?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2MHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Phillip Larking", username = "phillip_larking")
    ),
    UnsplashPhoto(
        id = "5X5dCf4Pp44",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1494173853739-c21f58b16055?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2MXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Gabriel Beaudry", username = "gbeaudry")
    ),
    UnsplashPhoto(
        id = "boRUigPjYDE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1601236007883-e8c3079bebe0?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2Mnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Adam Bouse", username = "adambouse")
    ),
    UnsplashPhoto(
        id = "qe6o7JJ0-js",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1631542206925-d4f518cad9cf?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2M3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Ekaterina Grosheva", username = "kitkat93")
    ),
    UnsplashPhoto(
        id = "ug7KMsMxn74",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1607243065293-ce5e3cb3f227?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2NHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Eduardo Gonzalez", username = "edugraphy")
    ),
    UnsplashPhoto(
        id = "DBFQJI5HO3c",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1518518886629-0b9000299b8b?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2NXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Andra Ion", username = "amiion")
    ),
    UnsplashPhoto(
        id = "HY3l4IeOc3E",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1494698853255-d0fa521abc6c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2Nnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Julian O'hayon", username = "anckor")
    ),
    UnsplashPhoto(
        id = "-uPDkAK6f8A",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1457803097035-3ace37af34a7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2N3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Holly Mindrup", username = "hollymindrup")
    ),
    UnsplashPhoto(
        id = "MSm8lDGGOBg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1601069700398-7b0f07f2a6fc?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2OHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "vivek sharma", username = "vkysharma")
    ),
    UnsplashPhoto(
        id = "vWIlcfaf7t8",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1621800656676-37d9e21e4f62?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw2OXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Allen Rad", username = "allenrad")
    ),
    UnsplashPhoto(
        id = "w390PTk7fZU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1635486685991-4e58e7190fb2?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3MHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "GKVP", username = "gkvp")
    ),
    UnsplashPhoto(
        id = "DapP9j2DJMQ",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1507260385058-676ee3f043e3?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3MXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Natalie Grainger", username = "missnjc")
    ),
    UnsplashPhoto(
        id = "dNJr8_AtRBw",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1608133854170-b7d269914b4c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3Mnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Franco Antonio Giovanella", username = "francogio")
    ),
    UnsplashPhoto(
        id = "WsaK0m5cvoU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1550719888-ffef4f5b476e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3M3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Mae Mu", username = "picoftasty")
    ),
    UnsplashPhoto(
        id = "RlAJf1o9z3E",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1568820780293-f33ebe8c49ed?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3NHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Julia Peretiatko", username = "julie_peretiatko")
    ),
    UnsplashPhoto(
        id = "hiDnpd-p-eE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1603189864361-0cc65b5ecd3a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3NXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTExfDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Annie Spratt", username = "anniespratt")
    )
)

val unsplashPhotos4 = listOf(
    UnsplashPhoto(
        id = "iY8ixFTGQKo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1613432374366-9283e36f7394?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3Nnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Filipe Cantador", username = "filipe_cantador")
    ),
    UnsplashPhoto(
        id = "jNi2SefV6bc",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1611574474484-ced6cb70a2cf?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3N3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Javier Balseiro", username = "javier_balseiro")
    ),
    UnsplashPhoto(
        id = "96IviUX6qvc",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1579247289287-eada3c1e697b?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3OHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Louis Hansel", username = "louishansel")
    ),
    UnsplashPhoto(
        id = "uMjXPQRMm8A",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1535622380377-1e347c44a12d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw3OXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Elena Koycheva", username = "lenneek")
    ),
    UnsplashPhoto(
        id = "y0_vFxOHayg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1468436139062-f60a71c5c892?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4MHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Wesson Wang", username = "wesson")
    ),
    UnsplashPhoto(
        id = "a1gD_OkPcRk",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1546841293-4e170128b101?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4MXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Deleece Cook", username = "deleece")
    ),
    UnsplashPhoto(
        id = "faMPQuSe4Wo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1625490939776-17cef70ec079?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4Mnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Peter bo", username = "peterbo")
    ),
    UnsplashPhoto(
        id = "qDqGK7NoASs",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1585233056125-b0c8e4cd8872?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4M3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Sincerely Media", username = "sincerelymedia")
    ),
    UnsplashPhoto(
        id = "TnG2q8FtXsg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1510674485131-dc88d96369b4?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4NHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Hugo Barbosa", username = "hugobarbosa")
    ),
    UnsplashPhoto(
        id = "B38CaCySh74",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1580062760649-1250019c0623?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4NXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Louis Hansel", username = "louishansel")
    ),
    UnsplashPhoto(
        id = "iHIvXD0P1GE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1577436428360-cf1d8c01dffe?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4Nnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Markus Spiske", username = "markusspiske")
    ),
    UnsplashPhoto(
        id = "Nod1nQ0i5a0",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1497377825569-02ad2f9edb81?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4N3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Igor Son", username = "igorson")
    ),
    UnsplashPhoto(
        id = "CVcG8WEm3iU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1594523024633-9cce0195ac35?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4OHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Bao Nguyen", username = "koobee615")
    ),
    UnsplashPhoto(
        id = "xaltQdCIIPc",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1575549592564-4d50aa43b3af?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw4OXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Tijana Drndarski", username = "izgubljenausvemiru")
    ),
    UnsplashPhoto(
        id = "g-HKnSDjUTg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1576673442511-7e39b6545c87?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5MHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Marek Studzinski", username = "jccards")
    ),
    UnsplashPhoto(
        id = "gSZCLsE7ysc",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1603351154351-5e2d0600bb77?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5MXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "omid armin", username = "itsomidarmin")
    ),
    UnsplashPhoto(
        id = "MgQnQZA4ByM",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1522040883829-9104eee3488a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5Mnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Ibrahim Abazid", username = "iabzd")
    ),
    UnsplashPhoto(
        id = "d-2nGZwEL2M",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1621800656500-eb792f64c5be?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5M3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Allen Rad", username = "allenrad")
    ),
    UnsplashPhoto(
        id = "NXP7wGyUDeY",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1524046909351-84f69445d990?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5NHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Carles Rabada", username = "carlesrgm")
    ),
    UnsplashPhoto(
        id = "t5a2H-WuVfI",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1530018352490-c6eef07fd7e0?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5NXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "ASE", username = "ourrealase")
    ),
    UnsplashPhoto(
        id = "lU_UuQ-6OVI",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1603831906299-db440570c203?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5Nnx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Kateryna Hliznitsova", username = "kate_gliz")
    ),
    UnsplashPhoto(
        id = "R7g4aUowyTo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1609301684649-9dac503dc519?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5N3x8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "David Orlando Us De Paz", username = "davidus016")
    ),
    UnsplashPhoto(
        id = "_9Tqku2QeqI",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1575509062605-c63b3e27d45d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5OHx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Chandra Oh", username = "ceveoh")
    ),
    UnsplashPhoto(
        id = "scsXux0vykw",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1616353270262-10dc0de0fd4d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHw5OXx8QXBwbGV8ZW58MHx8fHwxNzQzNDI5NTE2fDA&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Brandon Romanchuk", username = "currentspaces")
    ),
    UnsplashPhoto(
        id = "0ySmdv7Eek0",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1583431791517-92c079837787?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDB8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUxNnww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "an_vision", username = "anvision")
    )
)

val unsplashPhotos5 = listOf(
    UnsplashPhoto(
        id = "WKxjbY9rQaw",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1516163109866-e9d98630a0a6?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDF8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Xiong Yan", username = "slothxbear")
    ),
    UnsplashPhoto(
        id = "JnRgmNRNoME",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1533893662125-43c54ffa3b41?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDJ8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Andriyko Podilnyk", username = "andriyko")
    ),
    UnsplashPhoto(
        id = "3JVnhF5kSKk",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1564233121986-38b08fc4c462?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDN8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Andrew Johnson", username = "johnsonandrew290")
    ),
    UnsplashPhoto(
        id = "n1lMvtCCrDQ",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1601999532525-d4d616b5f104?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDR8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Helio Dilolwa", username = "abzortu")
    ),
    UnsplashPhoto(
        id = "_MPx2RmagKQ",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1542820191-bdc08051351b?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDV8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Joanna Stołowicz", username = "joanna_stolowicz")
    ),
    UnsplashPhoto(
        id = "2t4Ji-nARqA",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1506545966410-23c64c8f88d4?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDZ8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Liana Mikah", username = "lianamikah")
    ),
    UnsplashPhoto(
        id = "HONJP8DyiSM",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1504610926078-a1611febcad3?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDd8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Oliver Pecker", username = "ollipexxer")
    ),
    UnsplashPhoto(
        id = "WlgJBf_jMpM",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1572539127612-ad8aa8eaff1d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDh8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Alejandro Duarte", username = "mindistrict")
    ),
    UnsplashPhoto(
        id = "uArve8jwGlY",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1604691171288-24f1397cd989?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMDl8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Parastoo Maleki", username = "blueswallow")
    ),
    UnsplashPhoto(
        id = "NuOGFo4PudE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1504274066651-8d31a536b11a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTB8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Kuiye Chen", username = "kuiye")
    ),
    UnsplashPhoto(
        id = "zFOm6KzA-7g",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1517059224940-d4af9eec41b7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTF8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Jessy Smith", username = "jessysmith")
    ),
    UnsplashPhoto(
        id = "WxgVt4kPgE4",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1614367928405-4e4d086e5d75?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTJ8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Yaya The Creator", username = "uyaiabasi")
    ),
    UnsplashPhoto(
        id = "BQiLpUK_Ueg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1570913182974-40e1158b780a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTN8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Priscilla Du Preez 🇨🇦", username = "priscilladupreez")
    ),
    UnsplashPhoto(
        id = "6M7Keu2Kv2Y",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1606604830754-00a51e7b7910?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTR8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "IamCristian", username = "iamcristian")
    ),
    UnsplashPhoto(
        id = "xQ0WWUyqAmo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1522507806580-0be3530796be?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTV8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Dan Gold", username = "danielcgold")
    ),
    UnsplashPhoto(
        id = "Po1luGu2fmc",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1560951016-1242fd973c7f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTZ8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Diane Helentjaris", username = "dhelentjaris")
    ),
    UnsplashPhoto(
        id = "g9d8AZjpH7A",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1569089358904-9b3826dbfc1f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTd8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Mackenzie Marco", username = "kenziem")
    ),
    UnsplashPhoto(
        id = "qneR3xMul_M",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1581523611779-a69b86b701bc?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTh8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Ben Ashby", username = "folk")
    ),
    UnsplashPhoto(
        id = "5zgUU6eX50Y",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1522230857694-30b493b1e14a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMTl8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Amanda Yum", username = "amandayum")
    ),
    UnsplashPhoto(
        id = "DvaMuzQ4HVg",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1595739820243-918e61e72229?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMjB8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Алекс Арцибашев", username = "lxrcbsv")
    ),
    UnsplashPhoto(
        id = "BhZuCnDp7nU",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1541600321016-ac52d598f563?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMjF8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Anna Kaminova", username = "annakaminova")
    ),
    UnsplashPhoto(
        id = "K1MxhTd6SKo",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1509741102003-ca64bfe5f069?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMjJ8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Drew Coffman", username = "drewcoffman")
    ),
    UnsplashPhoto(
        id = "v8m-HXC0I3E",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1596701008477-309aeefa29ad?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMjN8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Garvit", username = "photophilic_spook")
    ),
    UnsplashPhoto(
        id = "anDn8fX-gzE",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1596209176007-23e064ea9b97?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMjR8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Nataliya Melnychuk", username = "natinati")
    ),
    UnsplashPhoto(
        id = "qVywyNo9_-E",
        urls = UnsplashPhotoUrls(small = "https://images.unsplash.com/photo-1513677785800-9df79ae4b10b?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w3Mjg5MzV8MHwxfHNlYXJjaHwxMjV8fEFwcGxlfGVufDB8fHx8MTc0MzQyOTUyMHww&ixlib=rb-4.0.3&q=80&w=400"),
        user = UnsplashUser(name = "Benjamin Wong", username = "ben_wong_31")
    )
)