package com.taskmanager.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Task {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;   // TODO, IN_PROGRESS, DONE
    private LocalDate dueDate;

    @ManyToOne
    private User user;
}

