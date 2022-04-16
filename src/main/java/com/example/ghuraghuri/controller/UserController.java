package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
       userService.newUser(user);
       return "New user is added";
    }

}
