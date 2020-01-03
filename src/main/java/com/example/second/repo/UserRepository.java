package com.example.second.repo;

import com.example.second.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {
        return new User("siam", "usa", "343434");
    }
}
