package com.infra.dev.infradevaccess;

import com.infra.dev.infradevaccess.interceptor.GenericInterceptor;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public ModelMapper modelMapper() {
    return new ModelMapper();
   }
   @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
        
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new GenericInterceptor()).addPathPatterns("/**");
            }
        };
    }

}
