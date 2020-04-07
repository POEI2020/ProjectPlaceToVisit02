package com.projet.placestovisit;

public class PlacesToVisitItem {
	
	private String listLieu;
	private String date;
	private String budget;
	private String description;
	private Integer id;
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
		this.id = id;
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