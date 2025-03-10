package com.example.demo.entity;

public class Entity
{
    private long id;

    private String title;

    private String description;

    @Override
    public String toString() {
        return "Entity{id=" + this.id + ", title='" + this.title + "', description='" + this.description + "'}";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}