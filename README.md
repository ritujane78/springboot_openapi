# Spring Boot OpenAPI Demo

## Overview

This project demonstrates how to integrate **OpenAPI 3** documentation into a **Spring Boot** application using **springdoc-openapi**.

The application models a simple e-commerce domain called **Jane Shop** and exposes REST APIs for managing:

- Products
- Categories
- Orders

The project also includes OpenAPI metadata configuration such as API information, contact details, license information, tags, and external documentation links.

---
Example configuration:

```java
@Bean
public OpenAPI janeShopOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Jane Shop API")
            .description("Jane shop sample application")
            .version("v0.0.1"));
}
```

---

## Running the Application

### Prerequisites

- Java 17+ (or the version configured in the project)
- Maven

### Clone the Repository

```bash
git clone https://github.com/ritujane78/springboot_openapi.git
cd springboot_openapi
```

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/*.jar
```

---

## Swagger UI

After starting the application, Swagger UI is typically available at:

```text
http://localhost:8080/swagger-ui.html
```

or

```text
http://localhost:8080/swagger-ui/index.html
```

depending on the springdoc version being used.

---

## OpenAPI Specification

The generated OpenAPI document is typically available at:

```text
http://localhost:8080/v3/api-docs
```

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- OpenAPI 3
- springdoc-openapi
- Maven

---

## Learning Objectives

This project is useful for learning:

- OpenAPI 3 fundamentals
- Swagger UI integration
- API documentation best practices
- Spring Boot REST API development
- OpenAPI metadata customization
