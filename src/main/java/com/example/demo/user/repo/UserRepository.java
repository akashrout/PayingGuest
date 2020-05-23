package com.example.demo.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.user.entity.RegistrationEntity;

public interface UserRepository extends JpaRepository<RegistrationEntity, String> {
	@Query("select registrationEntity from RegistrationEntity registrationEntity where username=:username")
	public RegistrationEntity getUserByName(String username);

}
