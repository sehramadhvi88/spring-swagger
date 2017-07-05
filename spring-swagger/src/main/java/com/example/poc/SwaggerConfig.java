package com.example.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.collect.ImmutableList;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api(){
		
		Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
				select().
				apis(RequestHandlerSelectors.basePackage("com.example.poc")).
				paths(PathSelectors.any()).
				build();
		
		docket.globalResponseMessage(RequestMethod.GET, ImmutableList.of(new ResponseMessageBuilder().code(400).
				message("Bad Request").responseModel(new ModelRef("Error")).build(),
				(new ResponseMessageBuilder().code(500).
						message("Internal Server Error").responseModel(new ModelRef("Error")).build())));
		
		return docket;
	}
	
	//@Bean
	public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST Sample with Swagger")
                .description("Spring Boot REST Sample with Swagger")
                .contact("Madhvi")
                .license("Apache License Version 2.0")
                .build();
    }
}
