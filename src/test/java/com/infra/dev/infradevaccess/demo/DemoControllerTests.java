package com.infra.dev.infradevaccess.demo;

import com.infra.dev.infradevaccess.service.DemoService;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; 
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasItems;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
@ExtendWith(SpringExtension.class)  
@WebMvcTest(DemoController.class) 
class DemoControllerTests {

	@Autowired
	private MockMvc mockMvc; 

	@MockBean
	private DemoService demoService;

	@Test
	void test_con1_getDemoAPI() throws Exception  {   
		
		when(demoService.getDemoServiceSuccess()).thenReturn("helloworld");

        this.mockMvc.perform(get("/demo"))
				.andDo(print())
				.andExpect(status().isOk())
                .andExpect(content().string("helloworld"));

		verify(demoService).getDemoServiceSuccess();
	}

	@Test
	public void test_con2_getAllEmployeesAPI() throws Exception 
	{
		this.mockMvc.perform( get("/getEmpDetails")
		.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.empDTOList").exists())
		.andExpect(jsonPath("$.empDTOList",hasSize(2)))
		.andExpect(jsonPath("$.empDTOList[*].id").isNotEmpty())
		.andExpect(jsonPath("$.empDTOList[*].id",hasItems(11,12)));
	}

	
	@BeforeAll
	static void initAll() {
		System.out.println("Start..BeforeAll");
	}

	@BeforeEach
	void init( ) {
		System.out.println("Start..BeforeEach "  );
	}

	 
	@AfterEach
	void end( ) {
		System.out.println("Finished...AfterEach" );
	}

	@AfterAll
	static void endAll() {
		System.out.println("Finished...AfterAll" );
	}
 

}
