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

/*
	@GetMapping("/PlacesToVisitItemForm.html")
	public ModelAndView showPlacesToVisitItemForm(@RequestParam(required = false) Integer id) {
		Map<String, Object> model = new HashMap<String, Object>();
		PlacesToVisitItem placesToVisitItem = findPlacesToVisitItemById(id);
		if (placesToVisitItem == null) {
			model.put("placesToVisitItem", new PlacesToVisitItem());
		} else {
			model.put("placesToVisitItem", placesToVisitItem);
		}
		return new ModelAndView("PlacesToVisitItemForm", model);
	}

	private PlacesToVisitItem findPlacesToVisitItemById(Integer id) {
		for (PlacesToVisitItem placesToVisitItem : placesToVisitItems) {
			if (placesToVisitItem.getId().equals(id)) {
				return placesToVisitItem;
			}
		}
		return null;
	}
	*/
	@GetMapping("/PlacesToVisitItemForm.html")
	public ModelAndView showWatchlistItemForm() {
		System.out.println("1");
		
		String viewName = "placesToVisitItemForm";
		System.out.println("2");
		
		Map<String,Object> model = new HashMap<String,Object>();
		System.out.println("3");
		
		model.put("placesToVisitItem", new PlacesToVisitItem());
		System.out.println("4");
		
		return new ModelAndView(viewName,model); 
	}
	

	@PostMapping("/PlacesToVisitItemForm.html")
	public ModelAndView submitPlacesToVisitItemForm(PlacesToVisitItem placesToVisitItem) {

		System.out.println("5 " + placesToVisitItems);
		
		placesToVisitItem.setId(index++);
		placesToVisitItems.add(placesToVisitItem);
		
		System.out.println("6 " + placesToVisitItems);

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/MyPlacesToVisit.html");
		
		System.out.println("7 " + placesToVisitItems);

		return new ModelAndView(redirectView);
	}
	
	
	@GetMapping("/MyPlacesToVisit.html")
	public ModelAndView getPlacesList() {
		
		System.out.println("8 " + placesToVisitItems);
		String viewName = "myPlacesToVisit";
		Map<String, Object> model = new HashMap<String, Object>();
		
		System.out.println("9 " + placesToVisitItems);

		model.put("placesToVisitItem", placesToVisitItems);
		model.put("numberOfPlaces", placesToVisitItems.size());
		
		System.out.println("10 " + placesToVisitItems);
		
		return new ModelAndView(viewName, model);
	}

}
