package com.projet.placestovisit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PlacesToVisitApplication extends SpringBootServletInitializer{

	//Override nécessaire pour packager en war
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PlacesToVisitApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PlacesToVisitApplication.class, args);
	}

}
