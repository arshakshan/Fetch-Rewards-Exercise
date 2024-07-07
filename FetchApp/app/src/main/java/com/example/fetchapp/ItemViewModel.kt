package com.example.fetchapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

// ViewModel class to manage UI data
class ItemViewModel(private val repository: ItemRepository) : ViewModel() {
    private val _items = MutableLiveData<List<Item>>()      // LiveData to hold the list of items
    val items: LiveData<List<Item>> get() = _items

    // Function to fetch items from the repository
    fun fetchItems() {
        viewModelScope.launch {
            val result = repository.getItems()
            _items.postValue(result)                        // Post the fetched items to LiveData
        }
    }
}