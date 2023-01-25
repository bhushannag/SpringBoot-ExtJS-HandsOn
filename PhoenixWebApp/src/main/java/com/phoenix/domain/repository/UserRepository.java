package com.phoenix.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phoenix.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findById(int userId);
	
	User findByEmail(String email);
}
