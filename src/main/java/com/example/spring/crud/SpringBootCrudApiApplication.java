package com.example.spring.crud;
import io.swagger.v3.oas.models.info.Info;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApiApplication.class, args);
	}
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("User Management REST API")
						.version("1.0.0")
						.description("This is a sample Spring Boot project demonstrating CRUD operations using Swagger UI")
						.contact(new Contact()
								.name("Sai Bharath Katta")
								.email("saibharath@example.com")
								.url("https://github.com/yourprofile"))
						.license(new License()
								.name("Apache 2.0")
								.url("https://www.apache.org/licenses/LICENSE-2.0")));
	}
}
