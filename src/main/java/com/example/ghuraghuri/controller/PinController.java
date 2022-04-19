package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Pin;
import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.service.PinService;
import com.example.ghuraghuri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pins")
@CrossOrigin
public class PinController {
    @Autowired
    PinService pinService;

    @GetMapping("/getAllPins")
    public List<Pin> getAllPins(){
        return pinService.getAllPins();
    }

}
