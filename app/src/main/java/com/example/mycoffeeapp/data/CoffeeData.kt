package com.example.mycoffeeapp.data

object CoffeeData {
    val coffees = arrayListOf(
        Coffee(
            id = 1,
            name = "Espresso",
            image = "https://upload.wikimedia.org/wikipedia/commons/4/41/Espresso_BW_1.jpg",
            description = "A strong black coffee made by forcing steam through ground coffee beans. Espresso originated in Italy and has become the foundation for many coffee drinks around the world. The brewing process involves forcing nearly boiling water under high pressure through finely-ground coffee beans, resulting in a concentrated shot of coffee with a distinctive rich flavor and thick crema on top. The perfect espresso shot should have a balance of sweetness, bitterness, and acidity, with a smooth, velvety texture. It's typically served in small demitasse cups and consumed quickly to enjoy the optimal temperature and flavor profile. The quality of an espresso depends on several factors including the coffee beans used, the grind size, water temperature, pressure, and the barista's skill in tamping and extraction timing.",
            ingredients = listOf("Finely ground coffee beans", "Hot water"),
            price = "Rp. 18.000"
        ),
        Coffee(
            id = 2,
            name = "Americano",
            image = "https://upload.wikimedia.org/wikipedia/commons/4/45/A_small_cup_of_coffee.JPG",
            description = "Espresso diluted with hot water, giving it a similar strength to drip coffee. The Americano was reportedly created during World War II when American soldiers in Italy would dilute espresso with hot water to approximate the coffee they were accustomed to back home. Despite its watered-down origins, a well-made Americano is far from a compromise. The hot water doesn't just dilute the espresso; it transforms it, creating a drink with the body and strength of drip coffee but with the complex flavors and aromatic qualities of espresso. The ratio of espresso to water can be adjusted to personal preference, typically ranging from 1:2 to 1:4. Some prefer it strong and bold, while others enjoy a milder, more approachable cup. The Americano is perfect for those who want to savor their coffee slowly without the intensity of straight espresso.",
            ingredients = listOf("Espresso", "Hot water"),
            price = "Rp. 20.000"
        ),
        Coffee(
            id = 3,
            name = "Latte",
            image = "https://upload.wikimedia.org/wikipedia/commons/0/0d/Caffe_latte_%286064969604%29.jpg",
            description = "A creamy coffee drink made with espresso and steamed milk, topped with foam. The caffè latte, or simply latte, is one of the most popular coffee beverages worldwide. Originating from Italy, the word 'latte' literally means milk, reflecting the drink's primary characteristic: a generous amount of steamed milk combined with espresso. The typical ratio is one shot of espresso to three parts steamed milk, topped with a thin layer of microfoam. This creates a smooth, creamy texture that balances the intensity of the espresso with the sweetness of the milk. The steaming process is crucial - properly steamed milk should be velvety and sweet, not scalded or bubbly. Lattes have become a canvas for latte art, where skilled baristas create beautiful designs by pouring the microfoam into the espresso. The drink's mild flavor profile makes it an excellent introduction to espresso-based beverages and a perfect vehicle for flavored syrups like vanilla, caramel, or hazelnut.",
            ingredients = listOf("Espresso", "Steamed milk", "Foamed milk"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 4,
            name = "Cappuccino",
            image = "https://upload.wikimedia.org/wikipedia/commons/3/3f/Classical_Cappuccino_in_Savour_Cafe.jpg",
            description = "Equal parts espresso, steamed milk, and milk foam. The cappuccino is a classic Italian coffee drink that has achieved global fame. Named after the Capuchin friars, whose brown robes resembled the color of the drink when milk was added to coffee, the traditional cappuccino follows a precise formula: one-third espresso, one-third steamed milk, and one-third milk foam. This perfect balance creates a harmonious drink where the robust espresso flavor shines through the creamy milk, while the foam adds a light, airy texture. The foam should be thick enough to support a sprinkle of cocoa powder or cinnamon, which is often added as a finishing touch. In Italy, cappuccinos are traditionally consumed only in the morning, as the milk is considered too heavy for afternoon or evening drinking. The key to a great cappuccino lies in the quality of the foam - it should be dense and velvety, not dry or bubbly, creating what baristas call 'microfoam' that integrates seamlessly with the milk and espresso.",
            ingredients = listOf("Espresso", "Steamed milk", "Foamed milk"),
            price = "Rp. 25.000"
        ),
        Coffee(
            id = 5,
            name = "Macchiato",
            image = "https://upload.wikimedia.org/wikipedia/commons/9/9b/Caff%C3%A8_macchiato_in_Hotel_Moskva%2C_Belgrade_02.jpg",
            description = "Espresso 'stained' with a small amount of foamed milk. The caffè macchiato, which translates to 'stained' or 'marked' coffee in Italian, is an espresso-based drink that represents the perfect middle ground between straight espresso and milk-heavy drinks like lattes. The traditional macchiato consists of a shot of espresso topped with just a dollop of foamed milk - literally just enough to 'stain' the dark espresso. This small addition of milk foam serves to slightly mellow the intensity of the espresso while maintaining its bold, robust character. The macchiato is ideal for those who find straight espresso too intense but don't want their coffee flavor diluted by too much milk. It's worth noting that the macchiato has evolved differently in various coffee cultures - the Italian version is quite different from what many modern coffee chains serve under the same name. The authentic macchiato remains small, strong, and predominantly coffee-forward, allowing the quality and flavor notes of the espresso to remain the star of the show.",
            ingredients = listOf("Espresso", "Foamed milk"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 6,
            name = "Mocha",
            image = "https://upload.wikimedia.org/wikipedia/commons/8/89/Mocha_-_Kooks%2C_Gardner_Street%2C_Brighton_2024-02-22.jpg",
            description = "A chocolate-flavored variant of a latte, with cocoa powder or chocolate syrup. The caffè mocha, also called mocaccino, is a delightful marriage of coffee and chocolate that appeals to both coffee lovers and chocolate enthusiasts. Named after the city of Mocha in Yemen, which was famous for its coffee trade, this drink combines espresso with steamed milk and chocolate, creating a rich, indulgent beverage. The chocolate component can be in the form of chocolate syrup, cocoa powder, or even melted chocolate, each providing a slightly different flavor profile. The standard preparation includes one shot of espresso, chocolate, and steamed milk, often topped with whipped cream for extra decadence. The mocha strikes a perfect balance - the bitterness of the espresso complements the sweetness of the chocolate, while the milk ties everything together with its creamy texture. Some variations include white chocolate mochas or dark chocolate versions for those who prefer less sweetness. The mocha has become a gateway drink for many people transitioning into coffee drinking, as the chocolate helps ease newcomers into the bold flavors of espresso.",
            ingredients = listOf("Espresso", "Steamed milk", "Chocolate"),
            price = "Rp. 25.000"
        ),
        Coffee(
            id = 7,
            name = "Flat White",
            image = "https://upload.wikimedia.org/wikipedia/commons/3/3c/Flat_white_coffee_at_Highdown_Gardens%2C_Worthing%2C_West_Sussex%2C_England.jpg",
            description = "An espresso with microfoam (steamed milk with fine, velvety bubbles). The flat white originated in Australia and New Zealand in the 1980s and has since gained worldwide popularity. While similar to a latte, the flat white is distinguished by its texture and ratio - it uses less milk than a latte, typically served in a smaller cup, with a higher proportion of coffee to milk. The defining characteristic is the microfoam, which should be velvety smooth with tiny, barely visible bubbles, creating a glossy, paint-like consistency. This microfoam is integrated throughout the drink rather than sitting as a separate layer on top. The result is a coffee-forward drink where the espresso flavor remains prominent, enhanced rather than masked by the silky milk. The flat white typically uses a double shot of ristretto (a shorter, more concentrated espresso extraction), which provides a sweeter, more intense coffee flavor. The drink should have minimal foam on top - hence the name 'flat' - with just a thin layer that allows for latte art. It's the perfect choice for those who want a milky coffee that doesn't compromise on espresso flavor.",
            ingredients = listOf("Espresso", "Steamed milk"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 8,
            name = "Irish Coffee",
            image = "https://upload.wikimedia.org/wikipedia/commons/5/52/Irish_Coffee_layers.jpg",
            description = "A cocktail consisting of hot coffee, Irish whiskey, sugar, and cream. Irish Coffee is a classic cocktail that perfectly combines the warmth of coffee with the smoothness of Irish whiskey. Created in the 1940s at Foynes Airport in Ireland by chef Joe Sheridan, this drink was originally made to warm up weary travelers on cold winter nights. The traditional recipe calls for hot coffee, Irish whiskey, brown sugar, and fresh cream floated on top. The preparation is an art form in itself - the coffee should be strong and hot, the sugar dissolved completely, and the cream carefully poured over the back of a spoon to create a distinct layer floating on top of the dark coffee and whiskey mixture. The cream should be slightly whipped but still pourable, creating a cool, rich contrast to the hot, boozy coffee beneath. The drink is meant to be sipped through the cream, allowing each sip to combine the cold cream with the hot, sweet, spirited coffee. Irish Coffee has inspired numerous variations using different spirits, but the original remains the most beloved, embodying the Irish spirit of hospitality and comfort.",
            ingredients = listOf("Hot coffee", "Irish whiskey", "Sugar", "Cream"),
            price = "Rp. 25.000"
        ),
        Coffee(
            id = 9,
            name = "Affogato",
            image = "https://upload.wikimedia.org/wikipedia/commons/1/19/Affogato.JPG",
            description = "Vanilla ice cream or gelato 'drowned' with a shot of hot espresso. The affogato is an Italian dessert that blurs the line between beverage and dessert, combining two beloved indulgences into one perfect creation. The name 'affogato' means 'drowned' in Italian, referring to the gelato or ice cream being drowned in espresso. The preparation is beautifully simple yet sophisticated - a scoop of high-quality vanilla gelato or ice cream is placed in a glass or bowl, and a shot of hot espresso is poured over it immediately before serving. The contrast between the cold, creamy gelato and the hot, bitter espresso creates a magical sensory experience. As the espresso melts the ice cream, it forms a creamy, sweet coffee sauce that combines the best elements of both components. The traditional version uses vanilla, but modern variations might include other flavors like chocolate, hazelnut, or caramel. Some establishments add a shot of liqueur such as amaretto or Frangelico for an adult twist. The affogato is typically enjoyed immediately, eaten with a spoon to capture the perfect ratio of melting gelato and espresso in each bite. It's the ultimate after-dinner treat for coffee lovers.",
            ingredients = listOf("Espresso", "Vanilla ice cream"),
            price = "Rp. 23.000"
        ),
        Coffee(
            id = 10,
            name = "Cold Brew",
            image = "https://upload.wikimedia.org/wikipedia/commons/4/4b/Iced_cold_brew_coffee.jpg",
            description = "Coffee brewed with cold water over 12–24 hours, served chilled. Cold brew coffee has revolutionized the way people enjoy iced coffee, offering a completely different flavor profile from traditional hot-brewed coffee that's been cooled down. The cold brew method involves steeping coarsely ground coffee beans in cold or room temperature water for an extended period, typically 12 to 24 hours. This slow extraction process creates a coffee concentrate that's remarkably smooth, naturally sweet, and low in acidity compared to hot-brewed coffee. The cold water extracts different compounds from the coffee beans than hot water does, resulting in a drink that's less bitter and more mellow, with subtle chocolate and caramel notes coming through. The concentrate can be diluted with water, milk, or served over ice, and it keeps well in the refrigerator for up to two weeks. Cold brew has become particularly popular during hot summer months, but its smooth flavor profile has earned it year-round fans. The lower acidity makes it gentler on the stomach, and the brewing method highlights the natural sweetness of quality coffee beans without the need for added sugar. Many coffee shops now offer cold brew on tap, and home brewing has become increasingly popular with various brewing devices available.",
            ingredients = listOf("Coarsely ground coffee beans", "Cold water"),
            price = "Rp. 21.000"
        )
    )
}