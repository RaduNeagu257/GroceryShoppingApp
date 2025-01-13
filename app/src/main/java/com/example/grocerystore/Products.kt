package com.example.grocerystore

abstract class ProductInfo {

    abstract val type: String
    abstract val name: String
    abstract val price: Double
    abstract var amount: Double

}

class Fruit_1 : ProductInfo() {
    override val type = "Fruits"
    override val name = "Mango"
    override val price = 1.0
    override var amount = 1.0
}

class Fruit_2 : ProductInfo() {
    override val type = "Fruits"
    override val name = "Banana"
    override val price = 0.25
    override var amount = 12.0
}

class Fruit_3 : ProductInfo() {
    override val type = "Fruits"
    override val name = "Apple"
    override val price = 0.8
    override var amount = 1.0
}

class Fruit_4 : ProductInfo() {
    override val type = "Fruits"
    override val name = "Watermelon"
    override val price = 0.3
    override var amount = 2.0
}

class Vegetable_1 : ProductInfo() {
    override val type = "Vegetables"
    override val name = "Carrot"
    override val price = 0.5
    override var amount = 1.0
}

class Vegetable_2 : ProductInfo() {
    override val type = "Vegetables"
    override val name = "Coriander"
    override val price = 0.1
    override var amount = 0.25
}

class Vegetable_3 : ProductInfo() {
    override val type = "Vegetables"
    override val name = "Potato"
    override val price = 0.2
    override var amount = 1.0
}

class Vegetable_4 : ProductInfo() {
    override val type = "Vegetables"
    override val name = "Tomato"
    override val price = 0.3
    override var amount = 1.0
}

class Cereal_1 : ProductInfo() {
    override val type = "Cereals"
    override val name = "Rye"
    override val price = 1.0
    override var amount = 1.0
}

class Cereal_2 : ProductInfo() {
    override val type = "Cereals"
    override val name = "Wheat"
    override val price = 0.9
    override var amount = 1.0
}

class Cereal_3 : ProductInfo() {
    override val type = "Cereals"
    override val name = "Oats"
    override val price = 1.5
    override var amount = 1.0
}

class Cereal_4 : ProductInfo() {
    override val type = "Cereals"
    override val name = "Rice"
    override val price = 1.2
    override var amount = 1.0
}

