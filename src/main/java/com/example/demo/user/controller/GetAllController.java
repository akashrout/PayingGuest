package com.example.demo.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.entity.RegistrationEntity;
import com.example.demo.user.repo.UserRepository;

@RestController
public class GetAllController {

	@Autowired
	private UserRepository UserRepository;

	@GetMapping("getall")
	public List<RegistrationEntity> getAll(RegistrationEntity registrationEntity) {
		System.out.println("Get all");
		List<RegistrationEntity> entities = UserRepository.findAll();
		return entities;
	}

}
