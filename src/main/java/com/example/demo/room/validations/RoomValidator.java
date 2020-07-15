package com.example.demo.room.validations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.room.bean.RoomBean;

@Service
public class RoomValidator {
	private static final Logger log = LoggerFactory.getLogger(RoomValidator.class);
	public boolean validateUserForEmptyData(RoomBean bean) {
		
		if ((bean.getAddress()==null)||(bean.getCity()==null)||(bean.getCost()==null)||(bean.getGender()==null)) {
			System.out.println("Empty room...");
			log.info("Registration room returns Empty data...");
			log.debug("Registration room returns Empty data...");
			return false;
		} else {
			System.out.println("Non Empty...");
			log.info("All fields are present...");
			log.debug("All fields are present...");
			return true;
		}
		
	}

}
