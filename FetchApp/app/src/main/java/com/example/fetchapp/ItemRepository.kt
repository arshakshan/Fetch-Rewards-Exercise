package com.example.fetchapp

// Repository Class to handle data operations
class ItemRepository(private val apiService: FetchApi) {

    // Function to fetch and filter, along with sorting based on listId and then name
    suspend fun getItems(): List<Item> {
        return apiService.fetchItems()
            .filter { !it.name.isNullOrBlank() }                // filter out names that are blank or null
            .sortedWith(compareBy({ it.listId }, { it.name }))  // Sort by listId and name
    }
}