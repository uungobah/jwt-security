package com.uun.gobah.jwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JwtSecurityApplication {

	public static void main(String[] args) {
        SpringApplication.run(JwtSecurityApplication.class, args);
	}
}
