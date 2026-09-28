package com.example.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
@RestController
public class global{
    @ExceptionHandler({
            SQLException.class,
            NullPointerException.class,
            ClassNotFoundException.class
    })

    public ResponseEntity<String> Exceptions(Exception e){
        return ResponseEntity.status(500).body("Back end Error");
    }
}