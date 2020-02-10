package com.infra.dev.infradevaccess.exception;

public class GenericException extends Exception{

    private static final long serialversionUID= 1L;

    public GenericException(){
        super();
    }

    public GenericException(final String message){
        super(message);
    }
    
}