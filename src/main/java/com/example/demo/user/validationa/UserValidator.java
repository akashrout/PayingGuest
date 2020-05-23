package com.example.demo.user.validationa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.entity.RegistrationEntity;
import com.example.demo.user.service.LoginRegService;

@Service
public class UserValidator {

	private static final Logger log = LoggerFactory.getLogger(UserValidator.class);

	@Autowired
	private LoginRegService loginRegService;

	public boolean isUserNamePresent(String username) {

		if (loginRegService.isUserNamePresent(username)) {
			log.info("User alreaady present...");
			log.debug("Username already present...");
			return true;
		} else {
			log.info("User not present...");
			log.debug("Username not present...");
			return false;
		}

	}

	public boolean validateUserForEmptyData(RegistrationEntity entity) {
		System.out.println("Validator: "+entity);
		if ((entity.getUsername() == null) || (entity.getRole() == null) || (entity.getReg_email() == null)
				|| (entity.getReg_name() == null) || (entity.getReg_gender() == null) || (entity.getPassword() == null)
				|| (entity.getProfile_pic() == null) || (entity.getReg_contact() == null)) {
			System.out.println("Empty Data");
			log.info("Registration user returns Empty data...");
			log.debug("Registration user returns Empty data...");
			return false;

		} else {
			System.out.println("Non Empty");
			log.info("All fields are present...");
			log.debug("All fields are present...");
			
			return true;

		}
	}

}
