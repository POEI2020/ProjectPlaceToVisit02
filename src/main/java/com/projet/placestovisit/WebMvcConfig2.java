package com.projet.placestovisit;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.io.*;
import java.nio.*;
import java.sql.*;
import java.*;

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
