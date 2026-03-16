package com.example.demo.AIQuery.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OpenAIExceptionHandler {

    @ExceptionHandler(QueryNotFoundException.class)
    public ResponseEntity<?> emptyResponse(QueryNotFoundException e){
        return new ResponseEntity<>("Query cannot be empty",HttpStatus.BAD_REQUEST);
    }
}
