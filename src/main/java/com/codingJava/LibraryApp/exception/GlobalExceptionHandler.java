package com.codingJava.LibraryApp.exception;

import com.codingJava.LibraryApp.dto.ErrorMessage;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Environment environment;

    public GlobalExceptionHandler(Environment environment) {
        this.environment = environment;
    }


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException exception,  HttpServletRequest request){

        Boolean isEnvDevActive = isEnvDevActive();

        String fullPath = isEnvDevActive ? request.getRequestURI() : null;

        ErrorMessage errorMessage =  ErrorMessage.builder()
                .message(exception.getMessage())
                .isEnvDevActive(isEnvDevActive)
                .timestamp(LocalDateTime.now())
                .path(fullPath)
                .details(exception.getErrorDetails())
                .build();
        return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
    }



    public List<String> getActiveProfiles(){
        return Arrays.asList(environment.getActiveProfiles());
    }

    public Boolean isEnvDevActive(){
        return getActiveProfiles().contains("dev");
    }


}
