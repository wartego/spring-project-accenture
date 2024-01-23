package com.accenture.academy.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class PriestGlobalNotFoundHandler {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PriestNotFoundException.class)
    public String priestNotExceptionHandler(PriestNotFoundException priestNotFoundException){
        return priestNotFoundException.getMessage();
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(InvalidParamException.class)
    public String priestNotExceptionHandler(InvalidParamException invalidParamException){
        return invalidParamException.getMessage();
    }

//    @ResponseBody
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(BindException.class)
//    public List<FieldError> bindExceptionHandler(BindException bindException){
//        return bindException.getBindingResult().getFieldErrors();
//    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class)
    public List<String> bindExceptionHandler(BindException bindException){
       List<FieldError> fieldErrors = bindException.getBindingResult().getFieldErrors();
       List<String> stringsList = new ArrayList<>();
               for(FieldError fieldError : fieldErrors){
                   stringsList.add(fieldError.getDefaultMessage());
               }
               return stringsList;
    }
}
