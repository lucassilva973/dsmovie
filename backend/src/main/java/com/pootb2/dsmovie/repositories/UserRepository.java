package com.pootb2.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pootb2.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
