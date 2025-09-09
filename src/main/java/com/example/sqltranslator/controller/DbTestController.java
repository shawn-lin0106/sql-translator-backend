package com.example.sqltranslator.controller;

import com.example.sqltranslator.entity.TestEntity;
import com.example.sqltranslator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/db")
public class DbTestController {

    private final TestService testService;

    @Autowired
    public DbTestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/test-connection")
    public ResponseEntity<TestEntity> testConnection(@RequestParam String message) {
        try {
            TestEntity savedEntity = testService.createTestMessage(message);
            return ResponseEntity.ok(savedEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<TestEntity>> getAllMessages() {
        try {
            List<TestEntity> allMessages = testService.getAllTestMessages();
            return ResponseEntity.ok(allMessages);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

}