package com.example.spring_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
