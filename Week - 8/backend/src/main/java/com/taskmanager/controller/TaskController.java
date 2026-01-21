package com.taskmanager.controller;

import com.taskmanager.model.entity.Task;
import com.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService service;

    @PostMapping
    public Task create(@RequestBody Task t, Authentication auth){
        return service.create(t, auth.getName());
    }

    @GetMapping
    public List<Task> myTasks(Authentication auth){
        return service.myTasks(auth.getName());
    }
}

