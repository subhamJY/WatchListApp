package com.example.subham.watchlist.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.subham.watchlist.Entity.movie;
import com.example.subham.watchlist.reposetries.MovieRepo;

@Service
public class movieServices {

	@Autowired
	MovieRepo repo;
	
	public void create(movie movie1) {
		repo.save(movie1);
	}
	
	public List<movie> getAllmovies(){
		return repo.findAll();
	}
}
