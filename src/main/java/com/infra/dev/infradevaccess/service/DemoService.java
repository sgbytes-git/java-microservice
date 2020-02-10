package com.infra.dev.infradevaccess.service;

import com.infra.dev.infradevaccess.exception.GenericException;
import com.infra.dev.infradevaccess.exception.ResourceNotFoundException;

public interface DemoService {

    String getDemoServiceResourceNotFound() throws ResourceNotFoundException;

    String getDemoServiceGenericException() throws GenericException;

    String getDemoServiceSuccess();
    
}