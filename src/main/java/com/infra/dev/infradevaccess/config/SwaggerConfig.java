package com.infra.dev.infradevaccess.config;

import com.infra.dev.infradevaccess.config.beans.SwaggerProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private SwaggerProperty configBean;

    
    

    /**
     * @return SwaggerProperty return the configBean
     */
    public SwaggerProperty getConfigBean() {
        return configBean;
    }

    /**
     * @param configBean the configBean to set
     */
    @Autowired
    public void setConfigBean(SwaggerProperty configBean) {
        this.configBean = configBean;
    }

    @Bean
    public Docket logDataApi(){        
        return new Docket(DocumentationType.SWAGGER_2)
        .groupName(configBean.getDocketProp().getGroupName())
        .useDefaultResponseMessages(false)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage(configBean.getDocketProp().getApisPackages()))
        .paths(regex(configBean.getDocketProp().getApiPath()))        
        .build()
        .pathMapping(configBean.getDocketProp().getPathMapping());
    }

    @Bean
    public UiConfiguration uiConfig(){
        return new UiConfiguration(null);
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
        .title(configBean.getApiInfoProp().getTitle())
        .description(configBean.getApiInfoProp().getDesc())
        .version(configBean.getApiInfoProp().getVersion())
        .build();
    }

}