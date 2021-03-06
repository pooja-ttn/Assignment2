package com.ttn.restApiSpring.controllers;

import com.ttn.restApiSpring.exceptions.ExceptionResponse;
import com.ttn.restApiSpring.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
@Autowired
    MessageSource messageSource;

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> errorMessageList=ex.getBindingResult().getAllErrors().stream().filter(e->e instanceof FieldError).map((e)->{
            FieldError fieldError = (FieldError) e;
            return messageSource.getMessage(fieldError, null);
        }).collect(Collectors.toList());
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),"Validation Failed....",errorMessageList.toString());

        return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
    }
}
