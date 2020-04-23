package com.tts.rsrvr.service;

import com.tts.rsrvr.model.User;

import java.util.List;

public interface UserServiceInt {
    List<User> findAll();

    User findUserById(Long id);

    User saveUser(User user);

    User updateUserById(Long id, User user);

    void deleteUserById(Long id);
}
