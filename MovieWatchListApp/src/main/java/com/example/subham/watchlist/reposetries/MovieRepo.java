package com.example.subham.watchlist.reposetries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.subham.watchlist.Entity.movie;

@Repository
public interface MovieRepo extends JpaRepository<movie, Integer>{

}
