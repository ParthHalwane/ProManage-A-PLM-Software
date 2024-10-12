package com.promanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promanage.modal.User;

public interface UserRepository extends JpaRepository<User,Long>{
	User findByEmail(String email);
}
