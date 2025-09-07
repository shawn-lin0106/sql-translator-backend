package com.example.sqltranslator.service;

import com.example.sqltranslator.entity.TestEntity;
import com.example.sqltranslator.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public TestEntity createTestMessage(String message) {
        TestEntity testEntity = new TestEntity();
        testEntity.setMessage(message);
        return testRepository.save(testEntity);
    }

    public Iterable<TestEntity> getAllTestMessages() {
        return testRepository.findAll();
    }

}