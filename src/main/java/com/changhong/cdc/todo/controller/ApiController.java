package com.changhong.cdc.todo.controller;

import com.changhong.cdc.todo.config.CustomConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/todos")
public class ApiController {

    final CustomConfig config;

    public ApiController(CustomConfig config) {
        this.config = config;
    }

    @GetMapping("")
    public Object getTodos() {
        log.info("get todos: config: {}", config);

        String[] todos = {"First", "Second", "Third"};
        return ResponseEntity.ok(todos);
    }
}
