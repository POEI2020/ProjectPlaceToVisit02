package com.projet.placestovisit;

import org.springframework.web.servlet.view.RedirectView;

public class PlacesToVisitItem {
	
	public String listLieu;
	public String date;
	public String budget;
	public String description;
	public Integer id;
	public static int index = 0;
	
	public PlacesToVisitItem() {
		this.id = index ++;
	}

	public PlacesToVisitItem(String listLieu, String date, String budget, String description, Integer id) {
		super();
		this.listLieu = listLieu;
		this.date = date;
		this.budget = budget;
		this.description = description;
		this.id = index;
	}
	

	public String Element() {
		return Element();
	}
	
	public String getlistLieu() {
		return listLieu;
	}

	public void setlistLieu(String listLieu) {
		this.listLieu = listLieu;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}