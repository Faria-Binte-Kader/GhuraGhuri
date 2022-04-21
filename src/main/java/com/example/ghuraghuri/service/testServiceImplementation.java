package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.test;
import com.example.ghuraghuri.repository.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImplementation implements testService{
    @Autowired
    testRepository repo;
    @Override
    public test newTest(test tst) {
        return repo.save(tst);
    }

    @Override
    public List<test> getAll() {
        return repo.findAll();
    }
}
