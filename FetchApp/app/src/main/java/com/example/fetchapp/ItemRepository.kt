package com.example.fetchapp

class ItemRepository(private val apiService: FetchApi) {
    suspend fun getItems(): List<Item> {
        return apiService.fetchItems()
            .filter { !it.name.isNullOrBlank() }
            .sortedWith(compareBy({ it.listId }, { it.name }))
    }
}