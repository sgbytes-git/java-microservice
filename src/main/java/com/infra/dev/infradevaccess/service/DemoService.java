package com.infra.dev.infradevaccess.service;

import com.infra.dev.infradevaccess.exception.GenericException;
import com.infra.dev.infradevaccess.exception.ResourceNotFoundException;
import com.infra.dev.infradevaccess.model.EmployeeDTO;
import java.util.List;
public interface DemoService {

    String getDemoServiceResourceNotFound() throws ResourceNotFoundException;

    String getDemoServiceGenericException() throws GenericException;

    String getDemoServiceSuccess();

    List <EmployeeDTO> getEmpDetails();
    
}