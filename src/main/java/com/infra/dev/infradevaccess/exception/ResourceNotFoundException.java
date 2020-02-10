package com.infra.dev.infradevaccess.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.infra.dev.infradevaccess.model.MessageType;

import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    private String message;

    private MessageType type;



    public ResourceNotFoundException(){
        super();
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

	public ResourceNotFoundException(MessageType error, String message) {
        super();
        this.type=error;
        this.message= message;
	}

	
    

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return MessageType return the type
     */
    public MessageType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(MessageType type) {
        this.type = type;
    }

}