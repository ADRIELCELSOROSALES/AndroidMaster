package com.aristidevs.androidmaster.todoapp

import com.example.androidmaster.todoapp.TaskCategory

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false)