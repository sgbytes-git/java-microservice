package com.infra.dev.infradevaccess.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application_${dbconfig.dbname}.properties")
public class DBConfig {

}