package com.infra.dev.infradevaccess.model;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Message", description = "A message containing more info why the operation failed")
public class Message {

    private String message;

    private MessageType type;  
    
    public Message(){
        super();
    }

    public Message(MessageType type, String message){
        super();
        this.message= message;
        this.type = type;
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