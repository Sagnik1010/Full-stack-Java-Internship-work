package com.blogapi.week6_spring_blog_api.config;

import io.swagger.v3.oas.models.*;
import org.springframework.context.annotation.*;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(new Info()
                .title("Week6 Blog API")
                .version("1.0")
                .description("Spring Boot Blog REST API"));
    }
}
