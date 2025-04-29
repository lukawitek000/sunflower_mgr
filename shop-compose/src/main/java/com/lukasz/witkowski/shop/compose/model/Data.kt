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

package com.lukasz.witkowski.schedule.shopxmlviews.model

val ALL_PRODUCTS = listOf(
    Product(
        "VW-GOLF-8-2023",
        "Volkswagen Golf 8",
        "Efficient and modern compact hatchback.",
        "The Volkswagen Golf 8 represents the latest evolution of this iconic hatchback. Built in 2023, it offers a blend of fuel efficiency, modern technology, and a comfortable driving experience. Its compact size makes it perfect for city commuting, while its spacious interior and versatile cargo area provide practicality for longer journeys. Equipped with advanced safety features and a refined infotainment system, the Golf 8 continues its legacy as a benchmark in its class.",
        3,
        23000.00,
        "https://images.unsplash.com/photo-1594501975187-d2dc80ad3fe3?q=80&w=3164&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        2023,
        BodyStyle.HATCHBACK
    ),
    Product(
        "BMW-3-SEDAN-2024",
        "BMW 3 Series Sedan",
        "Luxury sedan with renowned sporty handling.",
        "The 2024 BMW 3 Series Sedan upholds its reputation as a premium sports sedan. Known for its engaging driving dynamics, sophisticated design, and high-quality interior, this sedan offers a thrilling yet comfortable ride. Featuring the latest BMW technology, including advanced driver-assistance systems and a state-of-the-art infotainment system, the 3 Series is a compelling choice for those who appreciate both performance and luxury. Available in various engine options and trim levels.",
        2,
        45000.00,
        "https://images.unsplash.com/photo-1523983388277-336a66bf9bcd?q=80&w=2940&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        2024,
        BodyStyle.SEDAN
    ),
    Product(
        "TOYOTA-RAV4-HYBRID-2023",
        "Toyota RAV4 Hybrid",
        "Spacious, fuel-efficient, and reliable hybrid SUV.",
        "The 2023 Toyota RAV4 Hybrid is a popular choice for families and adventurers alike. Combining a fuel-efficient hybrid powertrain with a spacious and comfortable interior, it offers excellent versatility. Its reputation for reliability and strong resale value makes it a practical and dependable SUV. Equipped with Toyota Safety Sense and a user-friendly infotainment system, the RAV4 Hybrid is ready for both daily commutes and weekend getaways.",
        5,
        35000.00,
        "https://unsplash.com/s/photos/toyota-rav4",
        2023,
        BodyStyle.SUV
    ),
    Product(
        "MAZDA-MX5-2022",
        "Mazda MX-5 Miata",
        "Iconic lightweight and fun convertible roadster.",
        "The Mazda MX-5 Miata, produced in 2022, remains a beloved two-seater convertible celebrated for its pure driving experience. Its lightweight design, responsive handling, and engaging manual transmission (in many trims) provide an unmatched connection to the road. Perfect for open-air enthusiasts, the Miata offers a timeless design and an affordable entry into the world of sports cars. Its nimble nature and balanced chassis make every drive an enjoyable one.",
        1,
        32000.00,
        "https://unsplash.com/s/photos/mazda-mx-5",
        2022,
        BodyStyle.CONVERTIBLE
    ),
    Product(
        "HONDA-ODYSSEY-2021",
        "Honda Odyssey",
        "Versatile and spacious family-friendly minivan.",
        "The 2021 Honda Odyssey is designed with families in mind, offering comfortable seating for up to eight passengers and a multitude of convenience features. Its spacious interior, innovative Magic Slide second-row seats, and available rear entertainment system make long journeys enjoyable for everyone. With a focus on safety and practicality, the Odyssey provides ample cargo space and a smooth, comfortable ride, making it an ideal choice for growing families.",
        4,
        38000.00,
        "https://unsplash.com/s/photos/honda-odyssey",
        2021,
        BodyStyle.MINIVAN
    ),
    Product(
        "AUDI-A4-SEDAN-2023",
        "Audi A4 Sedan",
        "Refined sedan with premium features and technology.",
        "The 2023 Audi A4 Sedan exemplifies sophisticated German engineering. Offering a blend of elegant design, a comfortable and well-appointed interior, and advanced technology, the A4 provides a premium driving experience. Its refined engine options deliver a balance of performance and efficiency, while the intuitive MMI infotainment system and available Audi Virtual Cockpit keep you connected and informed. The A4 is a strong contender in the luxury sedan segment.",
        3,
        42000.00,
        "https://unsplash.com/s/photos/audi-a4",
        2023,
        BodyStyle.SEDAN
    ),
    Product(
        "SKODA-OCTAVIA-2022",
        "Skoda Octavia Combi",
        "Practical and spacious hatchback/estate with excellent value.",
        "The 2022 Skoda Octavia Combi offers an exceptional combination of practicality and value. Its expansive cargo area makes it ideal for those needing extra space, while the comfortable passenger cabin and efficient engines make it a great all-rounder. Built with a focus on functionality and reliability, the Octavia Combi provides a range of smart features and a comfortable ride, making it a popular choice for families and professionals alike.",
        6,
        27000.00,
        "https://unsplash.com/s/photos/skoda-octavia",
        2022,
        BodyStyle.HATCHBACK
    ),
    Product(
        "NISSAN-QASHQAI-2024",
        "Nissan Qashqai",
        "Stylish and efficient compact crossover SUV for urban living.",
        "The 2024 Nissan Qashqai is a stylish and efficient compact crossover SUV designed for the demands of urban living. Its sleek exterior design is complemented by a comfortable and well-equipped interior. Offering a balance of agility and practicality, the Qashqai is easy to maneuver in city traffic while still providing enough space for passengers and cargo. With modern safety features and a user-friendly infotainment system, it's a compelling option in the competitive crossover market.",
        4,
        26000.00,
        "https://unsplash.com/s/photos/nissan-qashqai",
        2024,
        BodyStyle.SUV
    ),
    Product(
        "FIAT-500C-2023",
        "Fiat 500 Convertible",
        "Charming and iconic city car with a fun retractable roof.",
        "The 2023 Fiat 500 Convertible embodies Italian charm and urban agility with the added fun of a retractable soft top. Its iconic design and compact size make it perfect for navigating city streets and enjoying open-air driving. Despite its small footprint, the Fiat 500C offers a surprisingly comfortable interior and a distinctive style that turns heads wherever it goes. It's a delightful choice for those seeking a unique and enjoyable city car.",
        2,
        21000.00,
        "https://unsplash.com/s/photos/fiat-500-convertible",
        2023,
        BodyStyle.CONVERTIBLE
    ),
    Product(
        "CHRYSLER-PACIFICA-2022",
        "Chrysler Pacifica",
        "Modern minivan with innovative storage and technology.",
        "The 2022 Chrysler Pacifica is a modern and sophisticated minivan that prioritizes passenger comfort and convenience. Its innovative Stow 'n Go seating system provides unparalleled flexibility for cargo and passenger arrangements. Equipped with a range of technology features, including a user-friendly infotainment system and available rear-seat entertainment, the Pacifica offers a comfortable and connected experience for the whole family. Its smooth ride and ample space make it a top contender in the minivan segment.",
        3,
        40000.00,
        "https://unsplash.com/s/photos/chrysler-pacifica",
        2022,
        BodyStyle.MINIVAN
    ),
    Product(
        "PEUGEOT-508-2023",
        "Peugeot 508 Sedan",
        "Stylish and comfortable sedan with a premium feel.",
        "The 2023 Peugeot 508 Sedan offers a compelling blend of elegant design, a comfortable and refined interior, and efficient engine options. Its distinctive styling sets it apart, while the focus on comfort and technology provides a pleasant driving experience. Equipped with modern safety features and a sophisticated infotainment system, the Peugeot 508 is a strong contender in the mid-size sedan segment.",
        2,
        39000.00,
        "https://unsplash.com/s/photos/peugeot-508",
        2023,
        BodyStyle.SEDAN
    ),
    Product(
        "OPEL-ASTRA-2024",
        "Opel Astra",
        "Practical and well-equipped compact hatchback.",
        "The latest generation Opel Astra, produced in 2024, offers a balanced package of practicality, efficiency, and modern technology. Its comfortable interior, user-friendly features, and a range of efficient engines make it a solid choice in the competitive compact hatchback market. With a focus on value and reliability, the Astra is well-suited for daily commutes and longer trips alike.",
        4,
        24000.00,
        "https://unsplash.com/s/photos/opel-astra",
        2024,
        BodyStyle.HATCHBACK
    ),
    Product(
        "CITROEN-C5-2022",
        "Citroën C5 Aircross",
        "Comfort-focused SUV with a unique suspension system.",
        "The 2022 Citroën C5 Aircross stands out in the SUV segment with its emphasis on ride comfort, thanks to its innovative Progressive Hydraulic Cushions suspension system. Offering a spacious and versatile interior, along with a distinctive and modern design, the C5 Aircross provides a relaxed and enjoyable driving experience. Its practical features and comfortable seating make it a great choice for families.",
        3,
        30000.00,
        "https://unsplash.com/s/photos/citroen-c5-aircross",
        2022,
        BodyStyle.SUV
    ),
    Product(
        "AUDI-TT-ROADSTER-2021",
        "Audi TT Roadster",
        "Sporty and stylish compact convertible with a premium feel.",
        "The 2021 Audi TT Roadster is a compact and stylish two-seater convertible that delivers a sporty driving experience. Its sleek design, high-quality interior, and engaging handling make it a desirable open-top car. Equipped with Audi's virtual cockpit and a range of powerful engines, the TT Roadster offers a blend of performance and premium features for driving enthusiasts.",
        1,
        43000.00,
        "https://unsplash.com/s/photos/audi-tt-roadster",
        2021,
        BodyStyle.CONVERTIBLE
    ),
    Product(
        "VW-SHARAN-2020",
        "Volkswagen Sharan",
        "Large and practical seven-seater minivan.",
        "The 2020 Volkswagen Sharan is a spacious and practical minivan designed to comfortably accommodate up to seven passengers. Its versatile seating arrangements and ample cargo space make it an ideal choice for large families or those needing extra utility. Known for its comfortable ride and robust build quality, the Sharan offers a functional and reliable solution for transporting people and their belongings.",
        2,
        37000.00,
        "https://unsplash.com/s/photos/volkswagen-sharan",
        2020,
        BodyStyle.MINIVAN
    ),
    Product(
        "VOLVO-S60-2023",
        "Volvo S60 Sedan",
        "Scandinavian luxury sedan with a strong focus on safety.",
        "The 2023 Volvo S60 Sedan embodies Scandinavian design with its elegant and minimalist styling. Renowned for its commitment to safety, the S60 is equipped with a comprehensive suite of advanced safety features. Its comfortable and technologically advanced interior provides a premium driving experience, while its efficient engines offer a balance of performance and fuel economy.",
        2,
        46000.00,
        "https://unsplash.com/s/photos/volvo-s60",
        2023,
        BodyStyle.SEDAN
    ),
    Product(
        "SEAT-LEON-2024",
        "Seat Leon",
        "Sporty and youthful compact hatchback with modern technology.",
        "The latest generation Seat Leon, produced in 2024, offers a dynamic driving experience with its sporty handling and modern design. Its stylish exterior is matched by a well-equipped and comfortable interior, featuring the latest infotainment and connectivity options. With a range of efficient engines and a focus on youthful appeal, the Leon is a compelling choice in the compact hatchback segment.",
        3,
        25000.00,
        "https://unsplash.com/s/photos/seat-leon",
        2024,
        BodyStyle.HATCHBACK
    ),
    Product(
        "SUBARU-FORESTER-2022",
        "Subaru Forester",
        "Reliable and capable all-wheel-drive SUV.",
        "The 2022 Subaru Forester is known for its reliability, practicality, and standard all-wheel-drive system, making it a capable choice for various road conditions. Its spacious interior, comfortable ride, and excellent visibility make it a popular SUV for families and outdoor enthusiasts. With a focus on safety and durability, the Forester offers a dependable and versatile driving experience.",
        4,
        32000.00,
        "https://unsplash.com/s/photos/subaru-forester",
        2022,
        BodyStyle.SUV
    ),
    Product(
        "BMW-Z4-2023",
        "BMW Z4 Roadster",
        "Stylish and agile two-seater convertible with a premium driving feel.",
        "The 2023 BMW Z4 Roadster is a sleek and agile two-seater convertible that delivers a thrilling open-top driving experience. Its stylish design, powerful engine options, and precise handling make it a desirable sports car. The premium interior is equipped with the latest BMW technology, providing a luxurious and connected ride for driving enthusiasts.",
        1,
        50000.00,
        "https://unsplash.com/s/photos/bmw-z4",
        2023,
        BodyStyle.CONVERTIBLE
    ),
    Product(
        "TOYOTA-SIENNA-2021",
        "Toyota Sienna",
        "Comfortable and spacious minivan with available all-wheel drive.",
        "The 2021 Toyota Sienna offers a comfortable and spacious interior, making it an excellent choice for families. With available all-wheel drive, it provides added confidence in various weather conditions. Known for its reliability and practicality, the Sienna features a smooth ride and a range of family-friendly amenities, ensuring a comfortable and convenient travel experience.",
        3,
        39000.00,
        "https://unsplash.com/s/photos/toyota-sienna",
        2021,
        BodyStyle.MINIVAN
    ),
    Product(
        "LEXUS-ES-2024",
        "Lexus ES Sedan",
        "Luxury sedan known for its comfort and quiet ride.",
        "The 2024 Lexus ES Sedan offers a serene and comfortable driving experience, characterized by its quiet cabin, smooth ride, and refined interior. As a luxury sedan, it boasts premium materials and advanced technology, providing a sophisticated and relaxing environment for both drivers and passengers. Known for its reliability and elegant styling, the ES is a compelling choice in the luxury segment.",
        2,
        47000.00,
        "https://unsplash.com/s/photos/lexus-es",
        2024,
        BodyStyle.SEDAN
    ),
    Product(
        "FORD-FOCUS-2020",
        "Ford Focus",
        "Practical and fuel-efficient compact hatchback.",
        "The 2020 Ford Focus (while production varies by region) was a well-regarded compact hatchback known for its practical design, fuel efficiency, and engaging driving dynamics. Offering a comfortable interior and a range of technology features, the Focus was a strong contender in its class, providing a balance of affordability and functionality for everyday use.",
        5,
        22000.00,
        "https://unsplash.com/s/photos/ford-focus",
        2020,
        BodyStyle.HATCHBACK
    ),
    Product(
        "HYUNDAI-TUCSON-2023",
        "Hyundai Tucson",
        "Modern and feature-rich compact SUV with bold styling.",
        "The 2023 Hyundai Tucson showcases a modern and bold design, coupled with a feature-rich interior and a comfortable ride. Offering a range of powertrain options and advanced technology, the Tucson provides a compelling package in the competitive compact SUV market. Its spacious cabin and user-friendly infotainment system make it a practical choice for individuals and small families.",
        4,
        27000.00,
        "https://unsplash.com/s/photos/hyundai-tucson",
        2023,
        BodyStyle.SUV
    ),
    Product(
        "MERCEDES-E-CABRIO-2022",
        "Mercedes-Benz E-Class Convertible",
        "Luxurious and elegant open-top car with advanced technology.",
        "The 2022 Mercedes-Benz E-Class Convertible offers a sophisticated open-air driving experience, combining elegant styling with a luxurious and technologically advanced interior. Its powerful engine options and smooth ride make it a pleasure to drive, while the premium materials and refined features provide a high level of comfort and sophistication. It's a top-tier choice for those seeking a luxurious convertible.",
        1,
        65000.00,
        "https://unsplash.com/s/photos/mercedes-e-class-convertible",
        2022,
        BodyStyle.CONVERTIBLE
    ),
    Product(
        "HONDA-STEPWGN-2021",
        "Honda Stepwgn",
        "Compact and versatile minivan popular for its innovative interior.",
        "The 2021 Honda Stepwgn, particularly popular in the Japanese market, is a compact yet surprisingly spacious and versatile minivan. Known for its innovative Waku Waku Gate (a unique tailgate design) and flexible seating arrangements, the Stepwgn offers excellent practicality for families and cargo. Its comfortable ride and efficient engines make it a smart choice in the compact minivan segment.",
        2,
        33000.00,
        "https://unsplash.com/s/photos/honda-stepwgn",
        2021,
        BodyStyle.MINIVAN
    ),
    Product(
        "AUDI-A6-SEDAN-2024",
        "Audi A6 Sedan",
        "Executive sedan with cutting-edge technology and refined performance.",
        "The 2024 Audi A6 Sedan represents a blend of sophisticated design, advanced technology, and refined performance in the executive sedan class. Its luxurious interior, intuitive MMI infotainment system, and powerful yet efficient engine options provide a premium driving experience. With a focus on comfort and innovation, the A6 is a strong contender for those seeking a high-end sedan.",
        2,
        55000.00,
        "https://unsplash.com/s/photos/audi-a6",
        2024,
        BodyStyle.SEDAN
    ),
    Product(
        "VW-POLO-2023",
        "Volkswagen Polo",
        "Small and nimble city hatchback with surprising spaciousness.",
        "The 2023 Volkswagen Polo is a compact and agile city hatchback that offers surprising interior space and practicality. Known for its comfortable ride, efficient engines, and solid build quality, the Polo is a popular choice for urban environments and first-time car buyers. Despite its small size, it offers a range of modern features and a pleasant driving experience.",
        6,
        19000.00,
        "https://unsplash.com/s/photos/volkswagen-polo",
        2023,
        BodyStyle.HATCHBACK
    ),
    Product(
        "NISSAN-XTRAIL-2022",
        "Nissan X-Trail",
        "Family-oriented SUV with available seven seats and all-wheel drive.",
        "The 2022 Nissan X-Trail is a family-focused SUV offering a spacious interior with available seven-seat configurations and the option of all-wheel drive for enhanced traction. Its comfortable ride, practical features, and ample cargo space make it well-suited for families and those needing versatility for longer journeys and varied road conditions.",
        3,
        31000.00,
        "https://unsplash.com/s/photos/nissan-x-trail",
        2022,
        BodyStyle.SUV
    ),
    Product(
        "BMW-4-CABRIO-2021",
        "BMW 4 Series Convertible",
        "Stylish and sporty open-top car with a luxurious interior.",
        "The 2021 BMW 4 Series Convertible combines elegant styling with a sporty driving experience and a luxurious interior. Its retractable hardtop provides both security and open-air enjoyment. With powerful engine options and precise handling, the 4 Series Convertible is a desirable choice for those seeking a premium and engaging drop-top car.",
        1,
        52000.00,
        "https://unsplash.com/s/photos/bmw-4-series-convertible",
        2021,
        BodyStyle.CONVERTIBLE
    ),
    Product(
        "KIA-CARNIVAL-2023",
        "Kia Carnival",
        "Large and comfortable minivan with a stylish and modern design.",
        "The 2023 Kia Carnival is a large and comfortable minivan that stands out with its modern and SUV-inspired design. Offering ample space for passengers and cargo, along with a range of convenience and technology features, the Carnival provides a premium minivan experience. Its comfortable seating and smooth ride make it an excellent choice for families and group travel.",
        2,
        38000.00,
        "https://unsplash.com/s/photos/kia-carnival",
        2023,
        BodyStyle.MINIVAN
    )
)