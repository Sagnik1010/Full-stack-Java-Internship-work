package com.taskmanager.service;

import com.taskmanager.model.entity.*;
import com.taskmanager.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository repo;
    private final UserRepository userRepo;

    public Task create(Task t,String username){
        User user = userRepo.findByUsername(username).orElseThrow();
        t.setUser(user);
        t.setStatus("TODO");
        return repo.save(t);
    }

    public List<Task> myTasks(String username){
        User user = userRepo.findByUsername(username).orElseThrow();
        return repo.findByUserId(user.getId());
    }
}

