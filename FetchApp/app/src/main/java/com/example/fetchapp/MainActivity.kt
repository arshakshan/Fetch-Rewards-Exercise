package com.example.fetchapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ItemViewModel
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val repository = ItemRepository(RetrofitInstance.api)
        val factory = ItemViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(ItemViewModel::class.java)

        viewModel.items.observe(this) { items ->
            adapter = ItemAdapter(items)
            recyclerView.adapter = adapter
        }

        viewModel.fetchItems()
    }
}

