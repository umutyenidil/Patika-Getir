package com.umutyenidil.taskmanagerservice.Task;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(
            TaskService taskService
    ) {
        this.taskService = taskService;
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Task createTask(
            @RequestBody TaskCreateRequest request
    ) {
        return this.taskService.createTask(request);
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Task> getTasks() {
        return this.taskService.getAllTasks();
    }
}
