package com.projet.placestovisit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.projet.placestovisit.domain.PlacesToVisitItem;



@RunWith(SpringRunner.class)

@WebMvcTest

public class CustomErrorControllerTest {

PlacesToVisitItem PlacesToVisititemTest;

	@Autowired
	MockMvc mockMvc;
		
	@Test
	public void test() throws Exception {
		mockMvc.perform(get("/error.html"))
		.andExpect(status().is2xxSuccessful());
	}

	
	@Test
	public void test2() throws Exception {
		mockMvc.perform(get("/MyPlacesToNimportequoi.html"))
		.andExpect(status().is4xxClientError());
	}
	

}
