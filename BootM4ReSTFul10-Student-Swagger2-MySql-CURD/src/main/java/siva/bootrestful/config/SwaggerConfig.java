package siva.bootrestful.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket Configure() {
		return new Docket(DocumentationType.SWAGGER_2)
				          .select()
				          .apis(RequestHandlerSelectors.basePackage("siva.bootrestful.controller.rest"))
				          .paths(PathSelectors.regex("/rest/student.*"))
				          .build()
				          .apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {

		return new ApiInfo("SIVA SPRINGBOOT APPLICATIONS", "SpringBoot ReSTFul Web Applications", "3.1", "https://nareshit.in/",
				new Contact("MSK", "https://nareshit.in/", "adminnit@gmail.com"), "NIT LICENCE", "https://nareshit.in/",
				new ArrayList<>());
	}

}
