package com.example.subham.watchlist.contollers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.subham.watchlist.Entity.movie;
import com.example.subham.watchlist.service.movieServices;

@RestController
public class WatchlistConrollers {

	@Autowired
	movieServices services;
	
	 @GetMapping({"/watchlistItemForm"})
	    public ModelAndView showWatchListForm() {
	        String viewName = "watchlistItemForm";
	        Map<String, Object> model = new HashMap<>();
	        
	            model.put("watchlistItem", new movie());
	        return new ModelAndView(viewName, model);
	    }
	
	
}
