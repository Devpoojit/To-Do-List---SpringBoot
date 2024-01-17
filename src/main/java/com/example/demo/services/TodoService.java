package com.example.demo.services;

import java.util.ArrayList;
import java.util.List; // Import the correct List class

import org.springframework.stereotype.Service;

import com.example.demo.models.Todo;

@Service
public class TodoService {
    private List<Todo> list = new ArrayList<Todo>(); // Use the generic type ArrayList<Todo>

    public Todo create(Todo todo) {
        list.add(todo);
        return todo;
    }

    public List<Todo> getList() {
        return list;
    }
}
