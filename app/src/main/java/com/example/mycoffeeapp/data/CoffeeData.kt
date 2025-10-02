package com.example.mycoffeeapp.data

object CoffeeData {
    val coffees = arrayListOf(
        Coffee(
            id = 1,
            name = "Espresso",
            image = "https://upload.wikimedia.org/wikipedia/commons/4/45/A_small_cup_of_coffee.JPG",
            description = "A strong black coffee made by forcing steam through ground coffee beans.",
            ingredients = listOf("Finely ground coffee beans", "Hot water"),
            price = "Rp. 18.000"
        ),
        Coffee(
            id = 2,
            name = "Americano",
            image = "https://upload.wikimedia.org/wikipedia/commons/6/6b/Caffe_Americano.JPG",
            description = "Espresso diluted with hot water, giving it a similar strength to drip coffee.",
            ingredients = listOf("Espresso", "Hot water"),
            price = "Rp. 20.000"
        ),
        Coffee(
            id = 3,
            name = "Latte",
            image = "https://upload.wikimedia.org/wikipedia/commons/7/7e/Caffe_Latte_art.jpg",
            description = "A creamy coffee drink made with espresso and steamed milk, topped with foam.",
            ingredients = listOf("Espresso", "Steamed milk", "Foamed milk"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 4,
            name = "Cappuccino",
            image = "https://upload.wikimedia.org/wikipedia/commons/c/c8/Cappuccino_at_Sightglass_Coffee.jpg",
            description = "Equal parts espresso, steamed milk, and milk foam.",
            ingredients = listOf("Espresso", "Steamed milk", "Foamed milk"),
            price = "Rp. 25.000"
        ),
        Coffee(
            id = 5,
            name = "Macchiato",
            image = "https://upload.wikimedia.org/wikipedia/commons/0/0c/Caffe_macchiato_as_seen_in_Madrid.jpg",
            description = "Espresso 'stained' with a small amount of foamed milk.",
            ingredients = listOf("Espresso", "Foamed milk"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 6,
            name = "Mocha",
            image = "https://upload.wikimedia.org/wikipedia/commons/f/f6/Mocha_coffee.jpg",
            description = "A chocolate-flavored variant of a latte, with cocoa powder or chocolate syrup.",
            ingredients = listOf("Espresso", "Steamed milk", "Chocolate"),
            price = "Rp. 25.000"
        ),
        Coffee(
            id = 7,
            name = "Flat White",
            image = "https://upload.wikimedia.org/wikipedia/commons/0/05/Flat_white_coffee_with_pretty_feather_pattern.jpg",
            description = "An espresso with microfoam (steamed milk with fine, velvety bubbles).",
            ingredients = listOf("Espresso", "Steamed milk"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 8,
            name = "Irish Coffee",
            image = "https://upload.wikimedia.org/wikipedia/commons/6/61/Irish_coffee_glass.jpg",
            description = "A cocktail consisting of hot coffee, Irish whiskey, sugar, and cream.",
            ingredients = listOf("Hot coffee", "Irish whiskey", "Sugar", "Cream"),
            price = "Rp. 25.000"
        ),
        Coffee(
            id = 9,
            name = "Affogato",
            image = "https://upload.wikimedia.org/wikipedia/commons/6/61/Affogato_al_caffe.jpg",
            description = "Vanilla ice cream or gelato 'drowned' with a shot of hot espresso.",
            ingredients = listOf("Espresso", "Vanilla ice cream"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 10,
            name = "Cold Brew",
            image = "https://upload.wikimedia.org/wikipedia/commons/2/29/Cold_Brew_Coffee.jpg",
            description = "Coffee brewed with cold water over 12–24 hours, served chilled.",
            ingredients = listOf("Coarsely ground coffee beans", "Cold water"),
            price = "Rp. 21.000"
        )
    )
}
