package com.projet.placestovisit;



public class PlacesToVisitItem {
	
	public String listLieu;
	private String date;
	private String budget;
	private String commentaire;
	private Integer id;
	public static int index = 0;
	
	public PlacesToVisitItem() {
		this.id = index ++;
	}

	public PlacesToVisitItem(String listLieu, String date, String budget, String commentaire) {
		super();
		this.listLieu = listLieu;
		this.date = date;
		this.budget = budget;
		this.commentaire = commentaire;
		this.id = index;
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

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}