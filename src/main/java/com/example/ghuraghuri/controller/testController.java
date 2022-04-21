package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.model.test;
import com.example.ghuraghuri.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class testController {
    @Autowired
    testService tstService;

    @PostMapping("/addtest")
    public String addTest(@RequestBody test tst){
        tstService.newTest(tst);
        return "New test is added";
    }

    @GetMapping("/getAlltest")
    public List<test> getAllLocations(){
        return tstService.getAll();
    }
}
