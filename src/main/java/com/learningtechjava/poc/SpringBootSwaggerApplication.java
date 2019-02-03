package com.learningtechjava.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerApplication.class, args);
	}
}


/*
* spring swagger we use so that we can share 
* rest apis with front end developers so that they
* can integrate it wherever required and understand it 
* what all are the api available , their format , request structure ,
* parameter type , request method , response type and all other related information 
* 
* to share this information manually on document is difficult manage and difficult to 
* update in future also 
* 
* so instead of managing manually , we can do it automatically with SWAGGER
* 
* its API framework  - can use to build, design and document rest apis , it works by examining application
* on runtime
* 
*  with a very little integration it helps to create interactive documentation 
*  for rest apis
*	
* Swagger specifications are implemented by SpringFox ( collection of java libraries )
* so we need to add springfox dependency to integrate swagger with spring 
* 
* 		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.4.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.4.0</version>
		</dependency>	
*
* 
*  create a SwaggerConfig.java and specify swagger configuration 
*
*
*/
