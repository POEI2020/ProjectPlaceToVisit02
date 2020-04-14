package com.projet.placestovisit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlacesToVisitItemFormTest {

	PlacesToVisitItem PlacesToVisitItemTest;
	
	@Before
	public void init() {
		
		PlacesToVisitItemTest=new PlacesToVisitItem("un certain lieu", "une certaine date", "un certain budget", "un certain commentaire");
	}
	
	@Test
	public void testLieu() {
		 PlacesToVisitItemTest.setListLieu("un lieu génial");
		 assertEquals("un lieu génial", PlacesToVisitItemTest.getListLieu());
	}

	@Test
	public void testDate() {
		 PlacesToVisitItemTest.setDate("une date géniale");
		 assertEquals("une date géniale", PlacesToVisitItemTest.getDate());
	}
	
	@Test
	public void testBudget() {
		 PlacesToVisitItemTest.setBudget("un budget parfait");
		 assertEquals("un budget parfait", PlacesToVisitItemTest.getBudget());
	}
	
	@Test
	public void testCommentaire() {
		 PlacesToVisitItemTest.setCommentaire("un merveilleux commentaire");
		 assertEquals("un merveilleux commentaire", PlacesToVisitItemTest.getCommentaire());
	}
	
	@Test
	public void testId() {
		 PlacesToVisitItemTest.setId(3);
		 assertEquals(3, PlacesToVisitItemTest.getId().intValue());
	}
}