package com.example.foster_backend.controller;

import com.example.foster_backend.model.User;
import com.example.foster_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(){ return userRepository.findAll(); }


}
