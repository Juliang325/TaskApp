package com.example.taskapp.entities

data class Category ( val name:String, var TaskList: MutableList<Task> = mutableListOf() )
