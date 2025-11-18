package com.poject.todo_api;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private boolean completed;

    //getter and setter
    public int getId() {return id; }

    public String getTitle() {return title; }

    public boolean isCompleted() {return completed; }

    public void setId(int id) {this.id = id; }
    public void setTitle(String title) {this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed;
    }
}

