package com.senatastan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan("com.senatastan.web")
@EnableJpaRepositories("com.senatastan.web.repository")
@EntityScan("com.senatastan.web.entities")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		
		
	}

}
@RestController
class HelloWorldController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
