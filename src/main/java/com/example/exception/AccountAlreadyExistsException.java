package com.example.exception;

public class AccountAlreadyExistsException extends RuntimeException {

    // Constructor to accept a message
    public AccountAlreadyExistsException(String message) {
        super(message);
    }
    // Constructor to accept both message and cause
    public AccountAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
