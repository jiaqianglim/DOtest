package com.example.myapp.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> getIndex() {
        return ResponseEntity.ok().body("Index");
    }

    @GetMapping(path = "/string")
    public ResponseEntity<String> getString() {
        return ResponseEntity.ok().body("Spring Works");
    }

    @GetMapping(path = "/array")
    public ResponseEntity<String> getList() {
        List sampleList = new LinkedList<String>();
        sampleList.add("string 1");
        sampleList.add("string 2");
        return ResponseEntity.ok().body(sampleList.toString());
    }
}
