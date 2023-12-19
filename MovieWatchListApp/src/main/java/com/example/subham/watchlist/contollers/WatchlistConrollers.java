package com.example.subham.watchlist.contollers;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.subham.watchlist.Entity.movie;
import com.example.subham.watchlist.service.movieServices;

@RestController
public class WatchlistConrollers {

	@Autowired
	movieServices services;
	
	//For getting the watchListform link
	 @GetMapping("/watchlistItemForm")
	 public ModelAndView showWatchListForm(@RequestParam(required = false) Integer id) {
	        String viewname = "watchlistItemForm";
	        Map<String, Object> model = new HashMap<>();
	        if(id==null) {
	          model.put("watchlistItem", new movie());
	          }
	        else {
	        	model.put("watchlistItem", services.getById(id));
	        }
	        return new ModelAndView(viewname, model);
	    }
	 
	 //for getting movie in the watchList
	 @PostMapping("/watchlistItemForm")
	 public ModelAndView submitMovie(@Valid  @ModelAttribute("watchlistItem")movie movie1,BindingResult bingingresult) {
		 if(bingingresult.hasErrors()) {
			 return new ModelAndView("watchlistItemForm");
		 }
		 Integer id=movie1.getId();
		 if(id==null) {
		 services.create(movie1);
		 }else {
			 services.update(movie1,id);
		 }
		 RedirectView rd=new RedirectView();
		 rd.setUrl("/watchlist");
		 return new ModelAndView(rd);
	 }
	
	 //for getting watchListS
	 @GetMapping("/watchlist")
	 public ModelAndView getWatchlist() {
		 String viewname="watchlist";
		 Map<String,Object> model=new HashMap<>();
		 List<movie> movieList=services.getAllmovies();
		 model.put("movierows", movieList);
		 model.put("noofmovies", movieList.size());
		 return new ModelAndView(viewname,model);
	 }
}
