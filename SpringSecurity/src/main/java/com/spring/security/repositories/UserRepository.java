package com.spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.models.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmail(String Email);
}
