package com.example.exception;
// MessageNotFoundException
public class MessageNotFoundException extends RuntimeException {
    public MessageNotFoundException(String message) {
        super(message);
    }
}

