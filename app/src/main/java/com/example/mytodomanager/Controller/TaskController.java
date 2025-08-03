package com.example.mytodomanager.Controller;

import androidx.annotation.VisibleForTesting;

import com.example.mytodomanager.Model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private static TaskController instance;
    private final List<Task> tasks = new ArrayList<>();

    // Prevents the constructor from being called in other classes.
    private TaskController(){};

    public static TaskController getInstance() {
        if (instance == null) instance = new TaskController();
        return instance;
    }

    public void addTask(Task task) {
        if(task == null || task.getTitle() == null || task.getTitle().trim().isEmpty()) {
            return;
        }
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    @VisibleForTesting
    public void clearList(){
        tasks.clear();
    }
}

