package com.ttn.restApiSpring.exceptions;

public class UserNotFoundException extends RuntimeException {
    public  UserNotFoundException(String message){
        super(message);
    }
}
