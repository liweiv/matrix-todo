package com.changhong.cdc.todo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/todos")
public class ApiController {
    @GetMapping("")
    public Object getTodos() {
        log.info("get todos");
        String[] todos = {"First", "Second", "Third"};
        return ResponseEntity.ok(todos);
    }
}
