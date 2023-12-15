package com.gaurav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApiUsingSpringApplication {
//	@Autowired
//	public RestTemplate template() {
//		return new RestTemplate();
//	}

	public static void main(String[] args) {
		SpringApplication.run(RestApiUsingSpringApplication.class, args);
	}

}
