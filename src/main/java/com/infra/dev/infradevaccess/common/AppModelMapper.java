package com.infra.dev.infradevaccess.common;

import com.infra.dev.infradevaccess.entity.Employee;
import com.infra.dev.infradevaccess.model.EmployeeDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppModelMapper {

@Autowired
private ModelMapper modelmapper;



public EmployeeDTO convertToEmployeeDTO(Employee employee){
    
    return modelmapper.map(employee, EmployeeDTO.class);
}

}