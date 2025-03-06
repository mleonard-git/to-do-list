package com.qa.tdl.java.service;
import com.qa.tdl.java.model.Task;
import com.qa.tdl.java.repository.TaskRepository;


public class TaskService {
    //logic layer

    private final TaskRepository taskRepository;

    //instantiate service class passing repository class through the parameters
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createNewTask(Task task){

        return taskRepository.save(task);

    }
}