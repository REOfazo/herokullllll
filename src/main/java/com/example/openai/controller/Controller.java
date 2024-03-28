package com.example.openai.controller;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(path="/index")
    public String hello() {
        return "index";
    }
    @PostMapping("/create")
    public void create() {

    }
    @PutMapping("/update")
    public void update() {

    }
    @DeleteMapping("/delete")
    public void delete() {

    }
}
