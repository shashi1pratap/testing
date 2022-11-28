package com.Assignment.swaggerapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableWebMvc
@EnableSwagger2
public class RecipesConfig {
		@Bean
		public Docket postApi()
		{
			return new Docket(DocumentationType.SWAGGER_2)
	                .enable(true)
	                .apiInfo(new ApiInfoBuilder()
	                        .title("Swagger Super")
	                        .description("Swagger Description details")
	                        .version("1.0").build())
	                .select()
	                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
	                .paths(PathSelectors.any()).build();
		}

		
		
}
