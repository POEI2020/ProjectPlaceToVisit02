package com.projet.placestovisit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlacesToVisitItemFormTest {

	PlacesToVisitItem PlacesToVisitItemTest;
	
	@Before
	public void init() {
		
		PlacesToVisitItemTest=new PlacesToVisitItem("un certain lieu", "une certaine date", "un certain budget", "une certaine description", 2);
	}
	
	@Test
	public void testLieu() {
		 PlacesToVisitItemTest.setlistLieu("un lieu génial");
		 assertEquals( PlacesToVisitItemTest.getlistLieu(), "un lieu génial");
	}

	@Test
	public void testDate() {
		 PlacesToVisitItemTest.setDate("une date géniale");
		 assertEquals( PlacesToVisitItemTest.getDate(), "une date géniale");
	}
	
	@Test
	public void testBudget() {
		 PlacesToVisitItemTest.setBudget("un budget parfait");
		 assertEquals( PlacesToVisitItemTest.getBudget(), "un budget parfait");
	}
	
	@Test
	public void testDescription() {
		 PlacesToVisitItemTest.setDescription("une merveilleuse description");
		 assertEquals( PlacesToVisitItemTest.getDescription(), "une merveilleuse description");
	}
	
	@Test
	public void testId() {
		 PlacesToVisitItemTest.setId(3);
		 assertEquals( PlacesToVisitItemTest.getId().intValue(), 3);
	}
}