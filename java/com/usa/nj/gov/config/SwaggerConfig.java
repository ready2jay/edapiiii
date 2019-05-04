package com.usa.nj.gov.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Documentation;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.usa.nj.gov.controller")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("my ED-RulesApi", "Some custom description of ED Rules Api", "version 2.1.4.RELESE",
				"Terms of service",
				new springfox.documentation.service.Contact("pavan", "www.pavan678.com", "kkuruvapavan@company.com"),
				"License of API", "API license URL", Collections.emptyList());
	}
}