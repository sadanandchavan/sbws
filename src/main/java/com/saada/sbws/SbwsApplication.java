package com.saada.sbws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sadanand
 *
 * Apr 17, 2020 12:50:07 PM
 */
@SpringBootApplication //Auto-configuration can be enabled by adding @SpringBootApplication or @EnableAutoConfiguration annotation in startup class. It indicates that it is a spring context file.
@ComponentScan("com.saada")
public class SbwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbwsApplication.class, args);
		System.out.println("####################################################");
		System.out.println("Spring Boot RESTful Web Services application start..");
		System.out.println("####################################################");
	}

}
