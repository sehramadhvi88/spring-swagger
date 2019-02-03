package com.learningtechjava.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 
@Configuration
@PropertySource(value = { "classpath:swagger.properties" })
//@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

	@Bean
	public Docket api(){
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
				select().
				apis(RequestHandlerSelectors.any()). // define classes (controller & model classes) to be included  , we can by base package [basePackage("com.example.poc.controller")]
				paths(PathSelectors.any()). // allow to define which controller's method should be included bases on their path mapping 
				build();
	}
	
	// describe your apis
	public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST Sample with Swagger")
                .description("Spring Boot REST Sample with Swagger")
                .license("Apache License Version 2.0")
                .version("1.0-SANPSHOT")
                .build();
    }
}


/* @EnableSwagger2 - annotation used to enable swagger 
 * All configuration is done through the Docket Bean
 * 
 *   
 * run your application and go to /swagger-ui.html end-point to access
*/
 