package com.pootb2.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pootb2.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
