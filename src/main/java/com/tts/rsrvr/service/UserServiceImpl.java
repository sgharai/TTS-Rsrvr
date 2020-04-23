package com.tts.rsrvr.service;

import com.tts.rsrvr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInt {

    @Autowired
    private UserRepository userRepository;
}
