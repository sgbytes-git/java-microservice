package com.infra.dev.infradevaccess.exception.handler;


import javax.servlet.http.HttpServletRequest;

import com.infra.dev.infradevaccess.exception.GenericException;
import com.infra.dev.infradevaccess.exception.ResourceNotFoundException;
import com.infra.dev.infradevaccess.model.Message;
import com.infra.dev.infradevaccess.model.MessageType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        Message errorDetails = new Message(MessageType.ERROR, ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(GenericException.class)
    public ResponseEntity<?> genericException(Exception ex, HttpServletRequest request) {
        Message errorDetails = new Message(MessageType.WARNING, ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalExcpetionHandler(Exception ex, HttpServletRequest request) {
        Message errorDetails = new Message(MessageType.ERROR, ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    
}