package com.example.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.taskapp.adapters.category.CategoryAdapter
import com.example.taskapp.adapters.task.TaskAdapter
import com.example.taskapp.adapters.task.TaskViewHolder
import com.example.taskapp.databinding.ActivityMainBinding
import com.example.taskapp.entities.Task
import com.example.taskapp.providers.CategoryProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var categoriaEntretenimiento: MutableList<Task>
    private lateinit var categoriaPersonal: MutableList<Task>
    private lateinit var categoriaOther: MutableList<Task>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLists()

        initRecyclerView()

    }

    private fun initLists() {
        categoriaEntretenimiento =
            CategoryProvider.categories.find { it.name == "Entretenimiento" }?.TaskList ?: mutableListOf()

        categoriaPersonal =
            CategoryProvider.categories.find { it.name == "Personal" }?.TaskList ?: mutableListOf()

        categoriaOther =
            CategoryProvider.categories.find { it.name == "Other" }?.TaskList ?: mutableListOf()
    }


    private fun initRecyclerView() {
        binding.rvCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategory.adapter = CategoryAdapter(CategoryProvider.categories)

        binding.rvTarea.layoutManager = LinearLayoutManager(this)
        binding.rvTarea.adapter = TaskAdapter(categoriaEntretenimiento + categoriaOther)
    }
}