package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
//@RequestMapping(path = "/user", method = RequestMethod.GET)
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/add")
    public String addUser(@RequestBody User user){
       userService.newUser(user);
       return "New user is added";
    }

    @GetMapping("/getAllUser")
    public List<User> getAllLocations(){
        return userService.getAllUsers();
    }

    @GetMapping("getByMail/mail")
    public ResponseEntity<List<User>> getUserByMail(@RequestParam String mail){
        return new ResponseEntity<List<User>>(userService.findByEmail(mail), HttpStatus.OK);
    }

    @PutMapping("update/mail")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<User> updateUser(@PathVariable(value = "mail") String mail, @RequestBody User user){
        List<User> users = userService.findByEmail(mail);
        users.get(0).setName(user.getName());
        users.get(0).setArea(user.getArea());
        users.get(0).setAddress(user.getAddress());
        final User updatedUser = userService.updateUser(users.get(0));
        return ResponseEntity.ok(updatedUser);
    }
}

