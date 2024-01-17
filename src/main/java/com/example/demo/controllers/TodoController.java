package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Todo;
import com.example.demo.services.TodoService;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
// import java.util.List;




@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;
    // Create ToDo
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        
        return todoService.create(todo);
    }


    // Get All ToDos

    @GetMapping
    public List<Todo> getAll() {
        return todoService.getList();
    }
    
}