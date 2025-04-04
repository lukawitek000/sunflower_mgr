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

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

object FakeDatabase {
    val plantList = PLANTS + additionalPlants

    private val _gardenPlantings = MutableStateFlow<List<GardenPlanting>>(emptyList())
    val gardenPlantings = _gardenPlantings.asStateFlow()

    fun addGardenPlanting(gardenPlanting: GardenPlanting) {
        _gardenPlantings.value += gardenPlanting
    }
}

private val PLANTS = listOf(
    Plant(
        plantId = "malus-pumila",
        name = "Apple",
        description = "An apple is a sweet, edible fruit produced by an apple tree (Malus pumila). Apple trees are cultivated worldwide, and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today. Apples have been grown for thousands of years in Asia and Europe, and were brought to North America by European colonists. Apples have religious and mythological significance in many cultures, including Norse, Greek and European Christian traditions.<br><br>Apple trees are large if grown from seed. Generally apple cultivars are propagated by grafting onto rootstocks, which control the size of the resulting tree. There are more than 7,500 known cultivars of apples, resulting in a range of desired characteristics. Different cultivars are bred for various tastes and uses, including cooking, eating raw and cider production. Trees and fruit are prone to a number of fungal, bacterial and pest problems, which can be controlled by a number of organic and non-organic means. In 2010, the fruit's genome was sequenced as part of research on disease control and selective breeding in apple production.<br><br>Worldwide production of apples in 2014 was 84.6 million tonnes, with China accounting for 48% of the total.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Apple\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 30,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/5/55/Apple_orchard_in_Tasmania.jpg"
    ),
    Plant(
        plantId = "beta-vulgaris",
        name = "Beet",
        description = "The beetroot is the taproot portion of the beet plant, usually known in North America as the beet and also known as the table beet, garden beet, red beet, or golden beet. It is one of several of the cultivated varieties of Beta vulgaris grown for their edible taproots and their leaves (called beet greens). These varieties have been classified as B. vulgaris subsp. vulgaris Conditiva Group.<br><br>Other than as a food, beets have use as a food colouring and as a medicinal plant. Many beet products are made from other Beta vulgaris varieties, particularly sugar beet.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Beetroot\">Wikipedia</a>)",
        growZoneNumber = 2,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/2/29/Beetroot_jm26647.jpg"
    ),
    Plant(
        plantId = "coriandrum-sativum",
        name = "Cilantro",
        description = "Coriander, also known as cilantro or Chinese parsley, is an annual herb in the family Apiaceae. All parts of the plant are edible, but the fresh leaves and the dried seeds are the parts most traditionally used in cooking.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Coriander\">Wikipedia</a>)",
        growZoneNumber = 2,
        wateringInterval = 2,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/5/51/A_scene_of_Coriander_leaves.JPG"
    ),
    Plant(
        plantId = "solanum-lycopersicum",
        name = "Tomato",
        description = "The tomato is the edible, often red, berry of the nightshade Solanum lycopersicum, commonly known as a tomato plant. The species originated in western South America. The Nahuatl (Aztec language) word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived. Its use as a cultivated food may have originated with the indigenous peoples of Mexico. The Spanish encountered the tomato from their contact with the Aztec during the Spanish colonization of the Americas and brought it to Europe. From there, the tomato was introduced to other parts of the European-colonized world during the 16th century.<br><br>The tomato is consumed in diverse ways, raw or cooked, in many dishes, sauces, salads, and drinks. While tomatoes are fruits – botanically classified as berries – they are commonly used as a vegetable ingredient or side dish.<br><br>Numerous varieties of the tomato plant are widely grown in temperate climates across the world, with greenhouses allowing for the production of tomatoes throughout all seasons of the year. Tomato plants typically grow to 1–3 meters (3–10 ft) in height. They are vines that have a weak stem that sprawls and typically needs support. Indeterminate tomato plants are perennials in their native habitat, but are cultivated as annuals. Determinate, or bush, plants are annuals that stop growing at a certain height and produce a crop all at once. The size of the tomato varies according to the cultivar, with a range of 0.5–4 inches (1.3–10.2 cm) in width.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Tomato\">Wikipedia</a>)",
        growZoneNumber = 9,
        wateringInterval = 4,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/17/Cherry_tomatoes_red_and_green_2009_16x9.jpg"
    ),
    Plant(
        plantId = "persea-americana",
        name = "Avocado",
        description = "The avocado (Persea americana) is a tree, long thought to have originated in South Central Mexico, classified as a member of the flowering plant family Lauraceae. The fruit of the plant, also called an avocado (or avocado pear or alligator pear), is botanically a large berry containing a single large seed.<br><br>Avocados are commercially valuable and are cultivated in tropical and Mediterranean climates throughout the world. They have a green-skinned, fleshy body that may be pear-shaped, egg-shaped, or spherical. Commercially, they ripen after harvesting. Avocado trees are partially self-pollinating and are often propagated through grafting to maintain a predictable quality and quantity of the fruit.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Avocado\">Wikipedia</a>)",
        growZoneNumber = 9,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e4/Branch_and_fruit_of_the_Maluma_avocado_cultivar.jpg"
    ),
    Plant(
        plantId = "pyrus-communis",
        name = "Pear",
        description = "The pear tree and shrub are a species of genus Pyrus, in the family Rosaceae, bearing the pomaceous fruit of the same name. Several species of pear are valued for their edible fruit and juices while others are cultivated as trees.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Pear\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 30,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/13/More_pears.jpg"
    ),
    Plant(
        plantId = "solanum-melongena",
        name = "Eggplant",
        description = "Eggplant (US), aubergine (UK), or brinjal (South Asia and South Africa) is a plant species in the nightshade family Solanaceae, Solanum melongena, grown for its often purple edible fruit.<br><br>The spongy, absorbent fruit of the plant is widely used in cooking in many different cuisines, and is often considered a vegetable, even though it is a berry by botanical definition. As a member of the genus Solanum, it is related to the tomato and the potato. Like the tomato, its skin and seeds can be eaten, but, like the potato, it is not advisable to eat it raw. Eggplant supplies low contents of macronutrients and micronutrients. The capability of the fruit to absorb oils and flavors into its flesh through cooking is well known in the culinary arts.<br><br>It was originally domesticated from the wild nightshade species thorn or bitter apple, S. incanum, probably with two independent domestications: one in South Asia, and one in East Asia.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Eggplant\">Wikipedia</a>)",
        growZoneNumber = 4,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e5/Eggplant_display.JPG"
    ),
    Plant(
        plantId = "vitis-vinifera",
        name = "Grape",
        description = "A grape is a fruit, botanically a berry, of the deciduous woody vines of the flowering plant genus Vitis.<br><br>Grapes can be eaten fresh as table grapes or they can be used for making wine, jam, juice, jelly, grape seed extract, raisins, vinegar, and grape seed oil. Grapes are a non-climacteric type of fruit, generally occurring in clusters.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Grape\">Wikipedia</a>)",
        growZoneNumber = 9,
        wateringInterval = 9,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/03/Grape_Plant_and_grapes9.jpg"
    ),
    Plant(
        plantId = "mangifera-indica",
        name = "Mango",
        description = "Mangoes are juicy stone fruit (drupe) from numerous species of tropical trees belonging to the flowering plant genus Mangifera, cultivated mostly for their edible fruit.<br><br>The majority of these species are found in nature as wild mangoes. The genus belongs to the cashew family Anacardiaceae. Mangoes are native to South Asia, from where the 'common mango' or 'Indian mango', Mangifera indica, has been distributed worldwide to become one of the most widely cultivated fruits in the tropics. Other Mangifera species (e.g. horse mango, Mangifera foetida) are grown on a more localized basis.<br><br>It is the national fruit of India, Pakistan, and the Philippines, and the national tree of Bangladesh.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Mango\">Wikipedia</a>)",
        growZoneNumber = 11,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/6/67/Mangos_criollos_y_pera.JPG"
    ),
    Plant(
        plantId = "citrus-x-sinensis",
        name = "Orange",
        description = "The orange is the fruit of the citrus species Citrus × sinensis in the family Rutaceae. It is also called sweet orange, to distinguish it from the related Citrus × aurantium, referred to as bitter orange. The sweet orange reproduces asexually (apomixis through nucellar embryony); varieties of sweet orange arise through mutations.<br><br>The orange is a hybrid between pomelo (Citrus maxima) and mandarin (Citrus reticulata). The chloroplast genome, and therefore the maternal line, is that of pomelo. The sweet orange has had its full genome sequenced.<br><br>Sweet oranges were mentioned in Chinese literature in 314 BC. As of 1987, orange trees were found to be the most cultivated fruit tree in the world. Orange trees are widely grown in tropical and subtropical climates for their sweet fruit. The fruit of the orange tree can be eaten fresh, or processed for its juice or fragrant peel. As of 2012, sweet oranges accounted for approximately 70% of citrus production.<br><br>In 2014, 70.9 million tonnes of oranges were grown worldwide, with Brazil producing 24% of the world total followed by China and India.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Orange_(fruit)\">Wikipedia</a>)",
        growZoneNumber = 9,
        wateringInterval = 30,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/2/22/Apfelsinenbaum--Orange_tree.jpg"
    ),
    Plant(
        plantId = "helianthus-annuus",
        name = "Sunflower",
        description = "Roses are red<br>Violets are blue<br>Sunflowers have seeds<br>That folks love to chew<br><br>- M.G., 2018<br><br>Helianthus annuus, the common sunflower, is a large annual forb of the genus Helianthus grown as a crop for its edible oil and edible fruits. This sunflower species is also used as wild bird food, as livestock forage (as a meal or a silage plant), in some industrial applications, and as an ornamental in domestic gardens. The plant was first domesticated in the Americas. Wild Helianthus annuus is a widely branched annual plant with many flower heads. The domestic sunflower, however, often possesses only a single large inflorescence (flower head) atop an unbranched stem. The name sunflower may derive from the flower's head's shape, which resembles the sun, or from the impression that the blooming plant appears to slowly turn its flower towards the sun as the latter moves across the sky on a daily basis.<br><br>Sunflower seeds were brought to Europe from the Americas in the 16th century, where, along with sunflower oil, they became a widespread cooking ingredient.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Helianthus_annuus\">Wikipedia</a>)",
        growZoneNumber = 8,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/a/aa/Sunflowers_in_field_flower.jpg"
    ),
    Plant(
        plantId = "citrullus-lanatus",
        name = "Watermelon",
        description = "Citrullus lanatus is a plant species in the family Cucurbitaceae, a vine-like (scrambler and trailer) flowering plant originating in West Africa. It is cultivated for its fruit. The subdivision of this species into two varieties, watermelons (Citrullus lanatus (Thunb.) var. lanatus) and citron melons (Citrullus lanatus var. citroides (L. H. Bailey) Mansf.), originated with the erroneous synonymization of Citrullus lanatus (Thunb.) Matsum. & Nakai and Citrullus vulgaris Schrad. by L.H. Bailey in 1930. Molecular data including sequences from the original collection of Thunberg and other relevant type material, show that the sweet watermelon (Citrullus vulgaris Schrad.) and the bitter wooly melon Citrullus lanatus (Thunb.) Matsum. & Nakai are not closely related to each other. Since 1930, thousands of papers have misapplied the name Citrullus lanatus (Thunb.) Matsum. & Nakai for the watermelon, and a proposal to conserve the name with this meaning was accepted by the relevant nomenclatural committee and confirmed at the International Botanical Congress in Shenzhen.<br><br>The bitter South African melon first collected by Thunberg has become naturalized in semiarid regions of several continents, and is designated as a 'pest plant' in parts of Western Australia where they are called pig melon.<br><br>Watermelon (Citrullus lanatus) is a scrambling and trailing vine in the flowering plant family Cucurbitaceae. The species was long thought to have originated in southern Africa, but this was based on the erroneous synonymization by L. H. Bailey (1930) of a South African species with the cultivated watermelon. The error became apparent with DNA comparison of material of the cultivated watermelon seen and named by Linnaeus and the holotype of the South African species. There is evidence from seeds in Pharao tombs of watermelon cultivation in Ancient Egypt. Watermelon is grown in tropical and subtropical areas worldwide for its large edible fruit, also known as a watermelon, which is a special kind of berry with a hard rind and no internal division, botanically called a pepo. The sweet, juicy flesh is usually deep red to pink, with many black seeds, although seedless varieties have been cultivated. The fruit can be eaten raw or pickled and the rind is edible after cooking.<br><br>Considerable breeding effort has been put into disease-resistant varieties. Many cultivars are available that produce mature fruit within 100 days of planting the crop.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Watermelon\">Wikipedia</a>)",
        growZoneNumber = 7,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/f/fc/01266jfWatermelons_Philippines_textures_Apolonio_Samson_Market_Quezon_Cityfvf_02.jpg"
    ),
    Plant(
        plantId = "hibiscus-rosa-sinensis",
        name = "Hibiscus",
        description = "Hibiscus is a genus of flowering plants in the mallow family, Malvaceae. The genus is quite large, comprising several hundred species that are native to warm temperate, subtropical and tropical regions throughout the world. Member species are renowned for their large, showy flowers and those species are commonly known simply as 'hibiscus', or less widely known as rose mallow. There are also names for hibiscus such as hardy hibiscus, rose of sharon, and tropical hibiscus.<br><br>The genus includes both annual and perennial herbaceous plants, as well as woody shrubs and small trees. The generic name is derived from the Greek name ἰβίσκος (hibiskos) which Pedanius Dioscorides gave to Althaea officinalis (c. 40–90 AD).<br><br>Several species are widely cultivated as ornamental plants, notably Hibiscus syriacus and Hibiscus rosa-sinensis.<br><br>A tea made from hibiscus flowers is known by many names around the world and is served both hot and cold. The beverage is known for its red colour, tart flavour, and vitamin C content.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Hibiscus\">Wikipedia</a>)",
        growZoneNumber = 10,
        wateringInterval = 1,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/82/Hibiscus_rosa-sinensis_flower_2.JPG"
    ),
    Plant(
        plantId = "cypripedium-reginae",
        name = "Pink & White Lady's Slipper",
        description = "Cypripedium reginae, known as the showy lady's slipper, pink-and-white lady's-slipper, or the queen's lady's-slipper, is a rare terrestrial lady's-slipper orchid native to northern North America.<br><br>It is the state flower of Minnesota, United States, and the provincial flower of Prince Edward Island, Canada.<br><br>Despite producing a large amount of seeds per seed pod, it reproduces largely by vegetative reproduction, and remains restricted to the North East region of the United States and south east regions of Canada. Although never common, this rare plant has vanished from much of its historical range due to habitat loss. It has been a subject of horticultural interest for many years with Charles Darwin who, like many, was unsuccessful in cultivating the plant.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Cypripedium_reginae\">Wikipedia</a>)",
        growZoneNumber = 4,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/a/ab/Cypripedium_reginae_Orchi_004.jpg"
    ),
    Plant(
        plantId = "aquilegia-coerulea",
        name = "Rocky Mountain Columbine",
        description = "Aquilegia coerulea, the state flower of Colorado, is a species of flowering plant in the buttercup family Ranunculaceae, native to the Rocky Mountains from Montana south to New Mexico and west to Idaho and Arizona. Its common name is Colorado blue columbine; sometimes it is called \"Rocky Mountain columbine,\" but this also refers to Aquilegia saximontana.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Aquilegia_coerulea\">Wikipedia</a>)",
        growZoneNumber = 5,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/94/Aquilegia_caerulea.jpg"
    ),
    Plant(
        plantId = "magnolia-denudata",
        name = "Yulan Magnolia",
        description = "Magnolia denudata, known as the lilytree or Yulan magnolia (simplified Chinese: 玉兰花; traditional Chinese: 玉蘭花), is native to central and eastern China. It has been cultivated in Chinese Buddhist temple gardens since 600 AD. Its flowers were regarded as a symbol of purity in the Tang Dynasty and it was planted in the grounds of the Emperor's palace.<br><br>It is the official city flower of Shanghai.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Magnolia_denudata\">Wikipedia</a>)",
        growZoneNumber = 8,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/13/Yulan_magnolia_%28Magnolia_denudata%29_%2816953983745%29.jpg"
    ),
    Plant(
        plantId = "bougainvillea-glabra",
        name = "Bougainvillea",
        description = "Bougainvillea is a genus of thorny ornamental vines, bushes, or trees. The inflorescence consists of large colourful sepallike bracts which surround three simple waxy flowers. The vine species grow anywhere from 1 to 12 m (3 to 40 ft.) tall, scrambling over other plants with their spiky thorns, which are tipped with a black, waxy substance. They are evergreen where rainfall occurs all year, or deciduous if there is a dry season.<br><br>Bougainvillea glabra (simplified Chinese: 簕杜鹃; traditional Chinese: 簕杜鵑) is the official city flower of Shenzhen and many other cities around the world.<br><br><br>(From <a href=\\\"https://en.wikipedia.org/wiki/Bougainvillea\\\">Wikipedia</a>)",
        growZoneNumber = 10,
        wateringInterval = 21,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/6/6d/Paperflower_--_Bougainvillea_glabra.jpg"
    )
)

val additionalPlants = listOf(
    Plant(
        plantId = "mentha-piperita",
        name = "Peppermint",
        description = "Peppermint is a hybrid mint, a cross between watermint and spearmint. Indigenous to Europe and the Middle East, the plant is now widespread in cultivation in many regions of the world. It is occasionally found in the wild with its parent species.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Peppermint\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 2,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/7/72/Pfefferminze_natur_peppermint.jpg"
    ),
    Plant(
        plantId = "lavandula-angustifolia",
        name = "Lavender",
        description = "Lavandula angustifolia, formerly L. officinalis, is a flowering plant in the family Lamiaceae, native to the Mediterranean. Its common names include lavender, true lavender or English lavender.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Lavandula_angustifolia\">Wikipedia</a>)",
        growZoneNumber = 5,
        wateringInterval = 14,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Single_lavender_flower02.jpg/1200px-Single_lavender_flower02.jpg"
    ),
    Plant(
        plantId = "aloe-vera",
        name = "Aloe Vera",
        description = "Aloe vera is a succulent plant species of the genus Aloe. It is widely distributed, and is considered an invasive species in many world regions. An evergreen perennial, it originates from the Arabian Peninsula, but grows wild in tropical, semi-tropical, and arid climates around the world.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Aloe_vera\">Wikipedia</a>)",
        growZoneNumber = 9,
        wateringInterval = 21,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Cut_Aloe_Vera_Leaf.jpg/280px-Cut_Aloe_Vera_Leaf.jpg"
    ),
    Plant(
        plantId = "ocimum-basilicum",
        name = "Basil",
        description = "Basil, also called great basil, is a culinary herb of the family Lamiaceae. Basil is native to tropical regions from central Africa to Southeast Asia. It is a tender plant, and is used in cuisines worldwide.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Basil\">Wikipedia</a>)",
        growZoneNumber = 10,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/90/Basil-Basilico-Ocimum_basilicum-albahaca.jpg"
    ),
    Plant(
        plantId = "zea-mays",
        name = "Corn",
        description = "Maize, also known as corn, is a cereal grain first domesticated by indigenous peoples in southern Mexico about 10,000 years ago. The leafy stalk of the plant produces pollen inflorescences and separate ovuliferous inflorescences called ears that yield kernels or seeds, which are fruits.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Maize\">Wikipedia</a>)",
        growZoneNumber = 4,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/ZeaMays.jpg/250px-ZeaMays.jpg"
    ),
    Plant(
        plantId = "cucumis-sativus",
        name = "Cucumber",
        description = "Cucumber is a widely-cultivated creeping vine plant in the Cucurbitaceae gourd family that bears cucumiform fruits, which are used as vegetables. There are three main varieties of cucumber—slicing, pickling, and seedless—within which several cultivars have been created.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Cucumber\">Wikipedia</a>)",
        growZoneNumber = 4,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/96/ARS_cucumber.jpg"
    ),
    Plant(
        plantId = "fragaria-vesca",
        name = "Strawberry",
        description = "The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries. It is cultivated worldwide for its fruit. The fruit is widely appreciated for its characteristic aroma, bright red color, juicy texture, and sweetness.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Strawberry\">Wikipedia</a>)",
        growZoneNumber = 5,
        wateringInterval = 4,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Garden_strawberry_%28Fragaria_%C3%97_ananassa%29_single2.jpg/1200px-Garden_strawberry_%28Fragaria_%C3%97_ananassa%29_single2.jpg"
    ),
    Plant(
        plantId = "carica-papaya",
        name = "Papaya",
        description = "The papaya is the plant Carica papaya, one of the 22 accepted species in the genus Carica of the family Caricaceae. Its origin is in the tropics of the Americas, perhaps from southern Mexico and neighboring Central America.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Papaya\">Wikipedia</a>)",
        growZoneNumber = 10,
        wateringInterval = 5,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Carica_papaya_-_papaya_-_var-tropical_dwarf_papaya_-_desc-fruit.jpg/220px-Carica_papaya_-_papaya_-_var-tropical_dwarf_papaya_-_desc-fruit.jpg"
    ),
    Plant(
        plantId = "allium-cepa",
        name = "Onion",
        description = "The onion, also known as the bulb onion or common onion, is a vegetable that is the most widely cultivated species of the genus Allium. Its close relatives include the garlic, shallot, leek, chive, and Chinese onion.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Onion\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 5,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG"
    ),
    Plant(
        plantId = "capsicum-annuum",
        name = "Bell Pepper",
        description = "Capsicum annuum is a species of the plant genus Capsicum native to southern North America and northern South America. This species is the most common and extensively cultivated of the five domesticated capsicums.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Capsicum_annuum\">Wikipedia</a>)",
        growZoneNumber = 9,
        wateringInterval = 4,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Green-Yellow-Red-Pepper-2009.jpg/1200px-Green-Yellow-Red-Pepper-2009.jpg"
    ),
    Plant(
        plantId = "daucus-carota",
        name = "Carrot",
        description = "The carrot is a root vegetable, usually orange in color, though purple, black, red, white, and yellow cultivars exist. They are a domesticated form of the wild carrot, Daucus carota, native to Europe and Southwestern Asia.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Carrot\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 5,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/401px-Carrots_at_Ljubljana_Central_Market.JPG"
    ),
    Plant(
        plantId = "phaseolus-vulgaris",
        name = "Green Bean",
        description = "Phaseolus vulgaris, the common bean, is a herbaceous annual plant grown worldwide for its edible dry seeds or unripe fruit. The main categories of common beans, on the basis of use, are dry beans, snap beans and shell beans.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Phaseolus_vulgaris\">Wikipedia</a>)",
        growZoneNumber = 2,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Heaps_of_beans.jpg/1200px-Heaps_of_beans.jpg"
    ),
    Plant(
        plantId = "spinacia-oleracea",
        name = "Spinach",
        description = "Spinach is a leafy green flowering plant native to central and western Asia. It is of the order Caryophyllales, family Amaranthaceae, subfamily Chenopodioideae. Its leaves are a common edible vegetable consumed either fresh, or after storage using preservation techniques by canning, freezing, or dehydration.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Spinach\">Wikipedia</a>)",
        growZoneNumber = 2,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/3/37/Spinacia_oleracea_Spinazie_bloeiend.jpg"
    ),
    Plant(
        plantId = "brassica-oleracea",
        name = "Broccoli",
        description = "Broccoli is an edible green plant in the cabbage family whose large flowering head, stalk and small associated leaves are eaten as a vegetable. Broccoli is classified in the Italica cultivar group of the species Brassica oleracea.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Broccoli\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 5,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/03/Broccoli_and_cross_section_edit.jpg"
    ),
    Plant(
        plantId = "cucurbita-pepo",
        name = "Pumpkin",
        description = "Cucurbita pepo is a cultivated plant of the genus Cucurbita. It yields varieties of winter squash and pumpkin, but the most widespread varieties belong to the subspecies Cucurbita pepo subsp. pepo, called summer squash.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Cucurbita_pepo\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/99/Pumpkins.jpg"
    ),
    Plant(
        plantId = "allium-sativum",
        name = "Garlic",
        description = "Garlic is a species in the onion genus, Allium. Its close relatives include the onion, shallot, leek, chive, and Chinese onion. It is native to Central Asia and northeastern Iran, and has long been a common seasoning worldwide, with a history of several thousand years of human consumption and use.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Garlic\">Wikipedia</a>)",
        growZoneNumber = 4,
        wateringInterval = 7,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Garlic_whole.jpg/220px-Garlic_whole.jpg"
    ),
    Plant(
        plantId = "mentha-spicata",
        name = "Spearmint",
        description = "Spearmint, also known as garden mint, common mint, lamb mint and mackerel mint, is a species of mint, Mentha spicata, native to Europe and southern temperate Asia, extending from Ireland in the west to southern China in the east.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Spearmint\">Wikipedia</a>)",
        growZoneNumber = 3,
        wateringInterval = 2,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/05/Minze.jpg"
    ),
    Plant(
        plantId = "petroselinum-crispum",
        name = "Parsley",
        description = "Parsley or garden parsley is a species of flowering plant in the family Apiaceae that is native to the central and eastern Mediterranean region, but has been naturalized elsewhere in Europe, and is widely cultivated as a herb, and a vegetable.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Parsley\">Wikipedia</a>)",
        growZoneNumber = 2,
        wateringInterval = 3,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Petroselinum.jpg/1200px-Petroselinum.jpg"
    ),
    Plant(
        plantId = "prunus-persica",
        name = "Peach",
        description = "The peach is a deciduous tree native to the region of Northwest China between the Tarim Basin and the north slopes of the Kunlun Mountains, where it was first domesticated and cultivated. It bears an edible juicy fruit called a peach or a nectarine.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Peach\">Wikipedia</a>)",
        growZoneNumber = 5,
        wateringInterval = 10,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/9e/Autumn_Red_peaches.jpg"
    ),
    Plant(
        plantId = "rubus-idaeus",
        name = "Raspberry",
        description = "The raspberry is the edible fruit of a multitude of plant species in the genus Rubus of the rose family, most of which are in the subgenus Idaeobatus. The name also applies to these plants themselves. Raspberries are perennial with woody stems.<br><br>(From <a href=\"https://en.wikipedia.org/wiki/Raspberry\">Wikipedia</a>)",
        growZoneNumber = 4,
        wateringInterval = 5,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Fert%C5%91di_k%C3%A1rmin_m%C3%A1lna.JPG/220px-Fert%C5%91di_k%C3%A1rmin_m%C3%A1lna.JPG"
    )
)