package com.techprimers.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableResourceServer
public class SpringSecurityClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityClientApplication.class, args);
	}

}
