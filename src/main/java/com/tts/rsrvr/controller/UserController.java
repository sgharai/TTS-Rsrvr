package com.tts.rsrvr.controller;

import com.tts.rsrvr.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String index() {
        return "Hello world";
    }

    //Get all users

    //Get user by id

    //Create a user

    //Update user



    //Delete a user
}
