package com.example.restapis.user.controller;

import com.example.restapis.user.model.User;
import com.example.restapis.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
       return userService.getUsers();
    }

    @GetMapping("/users/{usrId}")
    Optional<User> getUser(@PathVariable Integer usrId) {
       return userService.getUser(usrId);
    }

    @PostMapping("/create/user")
    ResponseEntity<User> createUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
