package com.example.mytodomanager.Controller;

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
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks); // Kopie zum Schutz
    }
}

