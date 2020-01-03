package com.example.second.rest;

import com.example.second.model.User;
import com.example.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/me")
    public User me() {
        return userService.getUser();
//        User u = new User("ariful", "moon", "9343434");
//        return u;
    }

}
