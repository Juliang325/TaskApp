package com.example.taskapp.providers

import com.example.taskapp.entities.Category

class CategoryProvider {
    companion object {
        val categories = listOf<Category>(
            Category("Trabajo", TaskProvider.tasksTrabajo.toMutableList()),
            Category("Other", TaskProvider.tasksOther.toMutableList()),
            Category("Entretenimiento", TaskProvider.taskEntretenimiento.toMutableList())
        )
    }
}
