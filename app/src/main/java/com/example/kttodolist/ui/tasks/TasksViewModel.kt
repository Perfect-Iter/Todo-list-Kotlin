package com.example.kttodolist.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.kttodolist.data.TaskDao

class TasksViewModel @ViewModelInject constructor(
    taskDao: TaskDao
) : ViewModel() {

    val tasks = taskDao.getTask().asLiveData()
}