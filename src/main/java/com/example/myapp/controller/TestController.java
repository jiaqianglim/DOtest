package com.example.myapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;

@RequestMapping("/")
@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> getIndex() {
        return ResponseEntity.ok().body("Index");
    }

    @GetMapping(path = "/string")
    public ResponseEntity<String> getString() {
        JsonObject sample = Json.createObjectBuilder().add("sample string 1", "ok").add("sample string 2", "ok")
                .build();
        return ResponseEntity.ok().body(sample.toString());
    }

    @GetMapping(path = "/array")
    public ResponseEntity<String> getList() {
        JsonArray sample = Json.createArrayBuilder().add("sample string 1").add("sample string 2").build();
        return ResponseEntity.ok().body(sample.toString());
    }
}
