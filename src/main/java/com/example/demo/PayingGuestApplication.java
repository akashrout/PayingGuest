package com.example.demo;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;

 

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PayingGuestApplication {
	 private int maxUploadSizeInMb = 10 * 1024 * 1024; // 10 MB

	public static void main(String[] args) {
		SpringApplication.run(PayingGuestApplication.class, args);
	}
	
	 
}
