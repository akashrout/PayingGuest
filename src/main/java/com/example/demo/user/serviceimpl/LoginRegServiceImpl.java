package com.example.demo.user.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.bean.RegistrationBean;
import com.example.demo.user.entity.RegistrationEntity;
import com.example.demo.user.repo.UserRepository;
import com.example.demo.user.reqresptransform.UserRequestTransformer;
import com.example.demo.user.service.LoginRegService;

@Service
public class LoginRegServiceImpl implements LoginRegService {
	private static final Logger log = LoggerFactory.getLogger(LoginRegServiceImpl.class);
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean isUserNamePresent(String username) {
		if (userRepository.findById(username).isPresent()) {
			System.out.println("User is present...");
			return true;
		} else {
			System.out.println("User is not present...");
			return false;
		}

	}

	@Override
	public boolean isValidLoginDetails(String username, String password) {

		Optional<RegistrationEntity> entity = userRepository.findById(username);
		if (username.equals(entity.get().getUsername()) && (password.equals(entity.get().getPassword()))) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public RegistrationEntity createUser(RegistrationBean registrationBean) {
		// TODO Auto-generated method stub
		log.info("Entering Create User...");
		log.debug("Entering Create User...");
		RegistrationEntity entity = UserRequestTransformer.getUserEntity(registrationBean);
		log.info("Saving User details to DB...");
		log.debug("Saving User details to DB...");
		userRepository.save(entity);
		return entity;
	}

	@Override
	public RegistrationEntity getUserByName(String username) {
		RegistrationEntity registrationEntity =userRepository.getUserByName(username);
		return registrationEntity;
	}

}
