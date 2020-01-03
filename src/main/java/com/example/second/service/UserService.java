package com.example.second.service;

import com.example.second.model.User;
import com.example.second.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser() {
        return userRepository.getUser();
//        User u = new User("sakib", "ca", "3444343");
//        return u;
    }
}
