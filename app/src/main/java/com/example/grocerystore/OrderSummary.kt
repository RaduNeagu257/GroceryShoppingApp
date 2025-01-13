package com.example.grocerystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class OrderSummary : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_summary)


        val cart_list : TextView = findViewById(R.id.cart_items)
        // cart_list.text = myCart.cart_items.joinToString(separator = "\n")
        // Count occurrences of each item and format the string
//        val cartItemsFormatted = myCart.cart_items.groupingBy { it }
//            .eachCount()
//            .map { (item, count) -> "$count x $item" }
//            .joinToString(separator = "\n")
        // Count occurrences, sort by count descending, and format the string
        val cartItemsFormatted = myCart.cart_items.groupingBy { it }
            .eachCount()
            .toList() // Convert to a list of pairs (item, count)
            .sortedByDescending { (_, count) -> count } // Sort by count in descending order
            .map { (item, count) -> "$count x $item" } // Format each entry
            .joinToString(separator = "\n") // Combine into a single string


        cart_list.text = cartItemsFormatted


        val cart_total: TextView = findViewById(R.id.cart_total)
        cart_total.text = "PAY $ "+ myCart.cart_total.toString()



        val pay: Button = findViewById(R.id.cart_total)
        pay.setOnClickListener {
     Toast.makeText(this, "You need to pay $. ${myCart.cart_total} to get the products delivered.", Toast.LENGTH_LONG).show()
        }

    }
}
