package com.spring.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.db.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
