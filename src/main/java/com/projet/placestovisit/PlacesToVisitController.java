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

@Controller
public class PlacesToVisitController {
	
	
	List<PlacesToVisitItem> placesToVisitItems = new ArrayList<PlacesToVisitItem>();
	private int index = 0;
	
	
	@GetMapping("/MyPlacesToVisit.html")
	public ModelAndView getPlacesList() {
		
		String viewName = "myPlacesToVisit";
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("placesToVisitItems", placesToVisitItems);
		model.put("numberOfPlaces", placesToVisitItems.size());
		return new ModelAndView(viewName, model);
	}
	
	
	
	@GetMapping("/placesToVisitItemForm.html")
	public ModelAndView showPlacesToVisitItemForm(@RequestParam(required=false) Integer id) {
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		PlacesToVisitItem placesToVisitItem = findPlacesToVisitItemById(id);
		if (placesToVisitItem == null) {
			model.put("placesToVisitItem", new PlacesToVisitItem());
		} else {
			model.put("placesToVisitItem", placesToVisitItem);
		}
		return new ModelAndView("placeToVisitItemForm" , model);
	}
	
	private PlacesToVisitItem findPlacesToVisitItemById(Integer id) {
		for (PlacesToVisitItem placesToVisitItem : placesToVisitItems) {
			if (placesToVisitItem.getId().equals(id)) {
				return placesToVisitItem;
			}
		}
		return null;
	}
	
	
	
	
	@PostMapping("/placesToVisitItemForm.html")
	public ModelAndView submitWatchlistItemForm(PlacesToVisitItem placesToVisitItem) {
		
		placesToVisitItem.setId(index++);
		placesToVisitItems.add(placesToVisitItem);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/MyPlacesToVisit");
		
		return new ModelAndView(redirectView);
	}
		
	
}
