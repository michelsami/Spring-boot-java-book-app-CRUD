package com.codingJava.LibraryApp.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {

    private final String errorDetails;

    public ResourceNotFoundException(String errorMessage , String errorDetails){
        super(errorMessage);
        this.errorDetails = errorDetails;
    }

}
