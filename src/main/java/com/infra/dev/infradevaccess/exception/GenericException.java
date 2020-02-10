package com.infra.dev.infradevaccess.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GenericException extends Exception{

    private static final long serialVersionUID= 1L;

    public GenericException(){
        super();
    }

    public GenericException(final String message){
        super(message);
    }
    
}