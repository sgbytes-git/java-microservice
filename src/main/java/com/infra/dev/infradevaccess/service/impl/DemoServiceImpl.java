package com.infra.dev.infradevaccess.service.impl;

import com.infra.dev.infradevaccess.exception.GenericException;
import com.infra.dev.infradevaccess.exception.ResourceNotFoundException;
import com.infra.dev.infradevaccess.model.MessageType;
import com.infra.dev.infradevaccess.service.DemoService;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getDemoServiceResourceNotFound() throws ResourceNotFoundException {        
            throw new ResourceNotFoundException(MessageType.ERROR, "demo for Resource Not found Exception");
            }

    @Override
    public String getDemoServiceGenericException() throws GenericException {
        throw new GenericException("demo for Generic Exception");
    }

    @Override
    public String getDemoServiceSuccess() {
        // TODO Auto-generated method stub
        return "helloworld";
    }
    
}