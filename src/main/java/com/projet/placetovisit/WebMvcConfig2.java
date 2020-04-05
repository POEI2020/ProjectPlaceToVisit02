package com.projet.placetovisit;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig2 implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home.html");
		registry.addViewController("/home.html").setViewName("home.html");
		registry.addViewController("/MyPlaceToVisit.html").setViewName("MyPlaceToVisit.html");
		registry.addViewController("/PlaceToVisitItemForm.html").setViewName("PlaceToVisitItemForm.html");
	}

}
