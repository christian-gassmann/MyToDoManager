package com.example.mytodomanager.Controller;

import static org.junit.Assert.*;

import com.example.mytodomanager.Model.Task;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TaskControllerTest {

    private TaskController controller;
    int taskListSize;

    @Before
    public void setup(){
        controller = TaskController.getInstance();
        controller.clearList();
        taskListSize = controller.getTasks().size();

    }

    @Test
    public void addTask_tryToAddOneTask_oneTaskAddedToList(){
        controller.addTask(new Task("Test"));
        assertEquals(taskListSize + 1, controller.getTasks().size());
    }

    @Test
    public void addTask_tryToAddEmptyStringTask_noneTaskAdded(){
        controller.addTask(new Task(" "));
        assertEquals(taskListSize, controller.getTasks().size());

    }

    @Test
    public void addTask_tryToAddNull_noneTaskAdded(){
        controller.addTask(null);
        assertEquals(taskListSize, controller.getTasks().size());
    }

    @Test
    public void addTask_tryToAddTaskWithNullTitle_noneTaskAdded(){
        Task task1 = new Task(null);
        controller.addTask(task1);
        assertEquals(taskListSize, controller.getTasks().size());
    }

    @Test
    public void getTasks_addTwoTasksAndGetList(){
        Task task1 = new Task("Test1");
        Task task2 = new Task("Test2");
        controller.addTask(task1);
        controller.addTask(task2);
        List<Task> result = controller.getTasks();
        assertEquals(2, result.size());
        assertTrue(result.contains(task1));
        assertTrue(result.contains(task2));
    }

    @Test
    public void getTasks_getCopyNotOriginalList(){
        Task task1 = new Task("Test1");
        controller.addTask(task1);
        List<Task> result = controller.getTasks();
        result.clear();
        assertEquals(1,controller.getTasks().size());
    }

    @Test
    public void clearList_addOneTaskAndClearList(){
        controller.addTask(new Task("Test1"));
        controller.clearList();
        assertEquals(0, controller.getTasks().size());

    }


}