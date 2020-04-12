package com.projet.placestovisit;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.projet.placestovisit.PlacesToVisitItem;




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
		 PlacesToVisititemTest=new PlacesToVisitItem("un certain lieu", "une certaine date", "un certain budget", "une certaine description");
		 Integer ID=PlacesToVisititemTest.getId();
		mockMvc.perform(get("/PlacesToVisitItemForm.html", ID))
		.andExpect(status().is2xxSuccessful()).andExpect(view().name("PlacesToVisitItemForm"))
		.andExpect(model().size(1));;
	}
}
