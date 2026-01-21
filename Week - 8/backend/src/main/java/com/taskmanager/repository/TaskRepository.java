package com.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanager.model.entity.Task;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // Fetch all tasks belonging to a specific user
    List<Task> findByUserId(Long userId);
}