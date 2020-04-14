package com.projet.placestovisit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig2 implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index.html");
		registry.addViewController("/index.html").setViewName("index.html");
		registry.addViewController("/MyPlacesToVisit.html").setViewName("MyPlacesToVisit.html");
		registry.addViewController("/PlacesToVisitItemForm.html").setViewName("PlacesToVisitItemForm.html");
	}

}