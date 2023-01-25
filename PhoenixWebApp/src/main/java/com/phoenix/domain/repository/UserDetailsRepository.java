package com.phoenix.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phoenix.domain.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{
}
