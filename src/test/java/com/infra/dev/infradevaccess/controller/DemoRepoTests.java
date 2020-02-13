package com.infra.dev.infradevaccess.controller;

import static org.junit.jupiter.api.Assertions.assertEquals; 
import java.util.List;

import com.infra.dev.infradevaccess.entity.Employee;
import com.infra.dev.infradevaccess.repository.EmployeeRepository;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
 
@ExtendWith(SpringExtension.class)  
@SpringBootTest
class DemoRepoTests {

 
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void test_repo1_demoAPI() throws Exception  {   
		List<Employee> empList = employeeRepository.findById(11);
		assertEquals(2, empList.size() );
 
	}

	 

}
