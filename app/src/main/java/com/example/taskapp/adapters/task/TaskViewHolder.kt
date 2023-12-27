package com.example.taskapp.adapters.task

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.databinding.ItemTaskBinding
import com.example.taskapp.entities.Category
import com.example.taskapp.entities.Task

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemTaskBinding.bind(view)

    fun render(taskModel: Task){
        binding.tvName.text = taskModel.name
    }
}