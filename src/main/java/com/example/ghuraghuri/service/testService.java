package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.test;

import java.util.List;

public interface testService {
    public test newTest(test tst);
    public List<test> getAll();
}
