package com.projet.placestovisit;

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

public class PlacesToVisitItem {
	
	public String listLieu;
	public String date;
	public String budget;
	public String commentaire;
	public Integer id;
	public static int index = 0;
	
	public PlacesToVisitItem() {
		this.id = index ++;
	}

	public PlacesToVisitItem(String listLieu, String date, String budget, String commentaire, Integer id) {
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