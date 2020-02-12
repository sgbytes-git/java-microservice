package com.infra.dev.infradevaccess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.infra.dev.infradevaccess.exception.GenericException;
import com.infra.dev.infradevaccess.exception.ResourceNotFoundException;
import com.infra.dev.infradevaccess.model.EmployeeDTO;
import com.infra.dev.infradevaccess.service.DemoService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/api")
@Api(value = "/api")
@Validated
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

   @Autowired
    private DemoService demoservice;

    @RequestMapping(method= RequestMethod.GET,value="/demo",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "gets response",notes = "retrieve response for a user query",response = String.class)
    @ApiResponses({
        @ApiResponse(code=200,message = "successfully retrieved the response from controller")
    })
    public String getDemo(){
        logger.info("inside DemoController-getHelloWorld");
        return demoservice.getDemoServiceSuccess();

    }

    @RequestMapping(method= RequestMethod.GET,value="/demoresource",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "gets response",notes = "retrieve response for a user query",response = String.class)
    @ApiResponses({
        @ApiResponse(code=200,message = "successfully retrieved the response from controller")
    })
    public String getDemoResourceNotFound() throws ResourceNotFoundException{
        logger.info("inside DemoController-getDemoResourceNotFound");      
           return demoservice.getDemoServiceResourceNotFound();
    }

    @RequestMapping(method= RequestMethod.GET,value="/demogeneric",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "gets response",notes = "retrieve response for a user query",response = String.class)
    @ApiResponses({
        @ApiResponse(code=200,message = "successfully retrieved the response from controller")
    })
    public String getDemoGeneric() throws GenericException{
        logger.info("inside DemoController-getDemoGeneric");      
           return demoservice.getDemoServiceGenericException();
    }

    @RequestMapping(method= RequestMethod.GET,value="/getEmpDetails",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "gets response",notes = "retrieve response for a user query",response = String.class)
    @ApiResponses({
        @ApiResponse(code=200,message = "successfully retrieved the response from controller")
    })
    public List<EmployeeDTO> getEmpDetails() throws GenericException{
        logger.info("inside DemoController-getDemoGeneric");      
           List<EmployeeDTO> list = demoservice.getEmpDetails();
           System.out.println("List Size****** "+list.size());
           return list;
    }

    
}