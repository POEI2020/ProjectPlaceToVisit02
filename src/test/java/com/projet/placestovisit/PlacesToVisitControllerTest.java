package com.projet.placestovisit;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
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
import com.projet.placestovisit.PlacesToVisitItem;
import com.projet.placestovisit.WebMvcConfig;
import com.projet.placestovisit.WebMvcConfig2;
import junit.framework.Assert;


@ContextConfiguration(classes= {WebMvcConfig.class , WebMvcConfig2.class})

@RunWith(SpringRunner.class)

@WebMvcTest

public class PlacesToVisitControllerTest {

	PlacesToVisitItem PlacesToVisititemTest;

	@Autowired
	MockMvc mockMvc;
	private PlacesToVisitItem mockPlacesToVisitItem;

	@Before
	public void init() {
		 PlacesToVisititemTest=new PlacesToVisitItem("lieu", "date", "budjget", "description",2);
		 Integer ID=PlacesToVisititemTest.getId();
	}

	 public void initMocks() {
	 mockPlacesToVisitItem=Mockito.mock(PlacesToVisitItem.class); 
	 }
	 
	 /*
	@Test
	public void testShowPlacesToVisitItemForm() throws Exception{

		mockMvc.perform(get("/PlacesToVisitItemForm.html") {
		.andExpect(status().is2xxSuccessful())
		.andExpect(view().name("PlacesToVisitItemForm"))
		.andExpect(model().size(1))
	}
*/
}
