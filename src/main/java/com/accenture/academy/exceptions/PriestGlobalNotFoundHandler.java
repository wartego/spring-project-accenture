package com.accenture.academy.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
}
