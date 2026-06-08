package com.jane;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootOpenApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenApiApplication.class, args);
	}

	@Bean
	public OpenAPI janeShopOpenAPI() {
		List<Tag> tags = new ArrayList<>();
		Tag tag = new Tag();
		tag.setName("Category");
		tags.add(tag);
		return new OpenAPI()
				.info(new Info().title("Jane Shop API")
						.description("Jane shop sample application")
						.version("v0.0.1")
						.contact(new Contact().name("Jane Shop").email("support@janeshop.com")
								.url("www.janeshop.com"))
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("JaneShop Wiki Documentation")
						.url("https://janeshop.wiki.github.org/docs"))
				.tags(tags);

	}
}
