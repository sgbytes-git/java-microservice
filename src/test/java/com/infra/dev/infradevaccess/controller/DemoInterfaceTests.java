package com.infra.dev.infradevaccess.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.springframework.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate; 
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoInterfaceTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test_int1_demoAPI() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity((  "/demo").toString(),  String.class);

		assertEquals( HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
        assertEquals("helloworld", response.getBody());

    }

}
