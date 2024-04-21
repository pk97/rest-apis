package com.example.restapis.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.restapis.user.exception.UserNotFoundException;
import com.example.restapis.user.model.*;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    static List<User> users;
    static  {
        users = new ArrayList<>();
        users.add(new User(1,"ABC", 23));
        users.add(new User(2,"ABC", 24));
        users.add(new User(2,"ABC", 24));
    }

    public List<User>  getUsers() {
        return users;
    }
    public Optional<User> getUser(int id) {
        var e = users.stream().filter( x -> x.id() == id)
                .findFirst();
        if (e.isEmpty()) throw  new UserNotFoundException("userIf "+id+"invalid");
        return e;
    }

    public void createUser(User user) {
        users.add(user);
    }
}
