package com.example.todoapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class TodoItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;

    private String priority;

    private Boolean isComplete;

    private Instant createdAt;

    private Instant updatedAt;

    @Override
    public String toString(){
        return String.format("TodoItem{id=%d, description='%s', priority='%s', isComplete='%s', " +
                "createdAt='%s', updatedAt='%s'}", id,description,priority, isComplete, createdAt, updatedAt);
    }

}
