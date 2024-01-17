package com.example.demo.models;

public class Todo {
    private int id;
    private String content;

    public Todo() {
    }

    public Todo (int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content; 
    }
}
