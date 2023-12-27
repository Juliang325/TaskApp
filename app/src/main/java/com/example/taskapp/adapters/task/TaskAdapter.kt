package com.example.taskapp.adapters.task

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.R
import com.example.taskapp.entities.Task


class TaskAdapter(private val tasksList: List<Task>) : RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TaskViewHolder(layoutInflater.inflate(R.layout.item_task, parent, false))
    }


    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val item = tasksList[position]
        holder.render(item)
    }


    override fun getItemCount(): Int = tasksList.size
}