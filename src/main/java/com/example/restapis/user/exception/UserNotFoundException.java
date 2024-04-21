package com.example.restapis.user.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
    String errorCOde = "111";
    public UserNotFoundException(String s) {
        super(s);
    }
}

// add validations
// send 201 responseCode