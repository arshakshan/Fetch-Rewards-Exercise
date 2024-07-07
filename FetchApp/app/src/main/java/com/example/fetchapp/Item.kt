package com.example.fetchapp

// Data Class for an Item
data class Item(
    val id: Int,        // Unique Identifier for the item
    val listId: Int,    // Identifier for the list the Item belongs to (1,2,3..)
    val name: String?   // Name of the Item, can be null or blank
)
