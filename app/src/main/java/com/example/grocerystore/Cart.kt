package com.example.grocerystore

class Cart {

    var cart_items = mutableListOf<String>()
    var cart_total: Double = 0.0
}

val myCart = Cart()