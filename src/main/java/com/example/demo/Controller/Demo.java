package com.example.demo.Controller;

import com.example.demo.entity.Entity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Demo {

    private final Map<Long, Entity> data = new HashMap<>();

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/entity")
    public List<Entity> getEntity() {
        return new ArrayList<>(data.values());
    }

    @GetMapping("/entity/{id}")
    public Entity getEntityById(@PathVariable long id) {
        return data.get(id);
    }

    @PostMapping("/entity")
    public Entity addEntity(@RequestBody Entity entity) {
        data.put(entity.getId(), entity);
        return entity;
    }

    @DeleteMapping("/entity/{id}")
    public Boolean deleteEntity(@PathVariable long id) {
        data.remove(id);
        return true;
    }

    @PutMapping("/entity/{id}")
    public Entity updateEntity(@PathVariable long id, @RequestBody Entity entity) {
        data.put(id, entity);
        return entity;
    }

}