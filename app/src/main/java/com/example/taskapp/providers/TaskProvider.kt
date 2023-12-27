package com.example.taskapp.providers

import com.example.taskapp.entities.Task

class TaskProvider {
    companion object {
        val tasksOther = listOf<Task>(
           Task("Visitar a los abuelos"),
           Task("Jugar al padel"),
           Task("Ver a la gorda"),
        )
        val tasksTrabajo = listOf<Task>(
            Task("Estudiar"),
            Task("Sacar al perro"),
            Task("Hacer de comer"),
        )
        val taskEntretenimiento = listOf<Task>(
            Task("Ver series"),
            Task("Jugar al padel"),
            Task("Ver a la gorda"),
        )
    }
}