package com.example.subham.watchlist.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class ratingService {

	String apiUrl="https://www.omdbapi.com/?apikey=USE_YOUR_KEY_HERE&t=";
	
	public String getMovieRating(String title) {
		try {
			//the tamplate will add the name and api
			RestTemplate template=new RestTemplate();
			//it will add the apiurl with the title
			ResponseEntity<ObjectNode> response=template.getForEntity(apiUrl+title, ObjectNode.class);
			ObjectNode json=response.getBody();
			return json.path("imdbRating").asText();
		} catch (Exception e) {
			System.out.println("The movie name doesnot exist of the Api is down" + e.getMessage());
			return null;
		}
	}
}
