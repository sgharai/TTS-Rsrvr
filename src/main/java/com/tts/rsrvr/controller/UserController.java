package com.tts.rsrvr.controller;

import com.tts.rsrvr.model.User;
import com.tts.rsrvr.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //Get all users
    @GetMapping()
    public List<User> getUsers() {
        return userService.findAll();
    }


    //Get user by id
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findUserById(id);
    }

    //Create a user
    @PostMapping()
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    //Update user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUserById(id, user);
    }

    //Delete a user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
