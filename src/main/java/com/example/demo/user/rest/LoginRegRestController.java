package com.example.demo.user.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Status;
import com.example.demo.user.entity.RegistrationEntity;

@RestController
@RequestMapping("/user")
public class LoginRegRestController {
	
	@PostMapping("/registration")
	public ResponseEntity<RegistrationEntity> ctrateuser(@RequestBody RegistrationEntity entity){
		
		System.out.println("Values are: "+entity);
		return new ResponseEntity(new Status("Unable to create. Some fields are missing "), HttpStatus.CONFLICT);
	}

}
