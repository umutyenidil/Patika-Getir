package com.umutyenidil.taskmanagerservice.Task;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class TaskService {

    private Map<String, Task> tasks = new HashMap<>();

    public Task createTask(TaskCreateRequest request) {
        Task task = new Task();

        task.setId(UUID.randomUUID());
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setStatus(Task.Status.TODO);
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(LocalDateTime.now());

        tasks.put(task.getId().toString(), task);

        return task;
    }

    public List<Task> getAllTasks() {
        return tasks.values().stream().toList();
    }

    public Task getTask(String id) {
        return tasks.get(id);
    }
}
