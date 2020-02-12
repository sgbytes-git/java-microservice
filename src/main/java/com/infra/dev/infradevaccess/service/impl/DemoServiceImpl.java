package com.infra.dev.infradevaccess.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.infra.dev.infradevaccess.common.AppModelMapper;
import com.infra.dev.infradevaccess.entity.Employee;
import com.infra.dev.infradevaccess.exception.GenericException;
import com.infra.dev.infradevaccess.exception.ResourceNotFoundException;
import com.infra.dev.infradevaccess.model.EmployeeDTO;
import com.infra.dev.infradevaccess.model.MessageType;
import com.infra.dev.infradevaccess.repository.EmployeeRepository;
import com.infra.dev.infradevaccess.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    EmployeeRepository empRepository;

    @Autowired
    AppModelMapper appModelMapper;

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

    @Override
    public List<EmployeeDTO> getEmpDetails() {
    
        List<EmployeeDTO> empDTOList = new ArrayList<EmployeeDTO>();

        //Employee emp = new Employee();


        List<Employee> empList = empRepository.findAll();

        if(!CollectionUtils.isEmpty(empList)){

            empList.forEach(row ->{

                EmployeeDTO empDTO=appModelMapper.convertToEmployeeDTO(row);
                empDTOList.add(empDTO);

            });
        }


        return empDTOList;
    }
    
}