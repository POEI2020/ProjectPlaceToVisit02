package com.projet.placestovisit;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

import com.projet.placestovisit.PlacesToVisitItem;
import com.projet.placestovisit.WebMvcConfig;
import com.projet.placestovisit.WebMvcConfig2;
import junit.framework.Assert;




@RunWith(SpringRunner.class)

@WebMvcTest

public class PlacesToVisitControllerTest {

	PlacesToVisitItem PlacesToVisititemTest;

	@Autowired
	MockMvc mockMvc;

	 
	@Test
	public void testShowMyPlacesToVisitItemForm() throws Exception{

		mockMvc.perform(get("/PlacesToVisitItemForm.html"))
		.andExpect(status().is2xxSuccessful())
		.andExpect(view().name("PlacesToVisitItemForm"))
		.andExpect(model().size(1));
	}
	
	@Test
	public void testSubmitMyPlacesToVisitItemForm() throws Exception {
		mockMvc.perform(post("/PlacesToVisitItemForm.html"))
		.andExpect(status().is3xxRedirection())
		.andExpect(redirectedUrl("/MyPlacesToVisit.html"));
	}
	
	@Test
	public void testGetPlacesList() throws Exception{

		mockMvc.perform(get("/MyPlacesToVisit.html"))
		.andExpect(status().is2xxSuccessful())
		.andExpect(view().name("MyPlacesToVisit"))
		.andExpect(model().size(2));
	}
// Test écrit pour invoquer la méthode findPlacesToVisitByID() //
	
	@Test
	public void testfindPlacesToVisitByID() throws Exception{
		 PlacesToVisititemTest=new PlacesToVisitItem("un certain lieu", "une certaine date", "un certain budget", "une certaine description", 2);
		 Integer ID=PlacesToVisititemTest.getId();
		mockMvc.perform(get("/PlacesToVisitItemForm.html", ID))
		.andExpect(status().is2xxSuccessful()).andExpect(view().name("PlacesToVisitItemForm"))
		.andExpect(model().size(1));;
	}
}
