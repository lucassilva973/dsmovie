package com.pootb2.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pootb2.dsmovie.entities.Score;
import com.pootb2.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
