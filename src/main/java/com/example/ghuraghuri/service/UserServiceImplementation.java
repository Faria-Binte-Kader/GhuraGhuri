package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
    UserRepository repo;
    @Override
    public User newUser(User user) {
        return repo.save(user);
    }
}
