package com.example.demo.user.service;

import com.example.demo.user.entity.RegistrationEntity;

// TODO: Auto-generated Javadoc
/**
 * The Interface LoginRegService.
 */
public interface LoginRegService {
	
	/**
	 * Checks if is user name present.
	 *
	 * @param username the username
	 * @return true, if is user name present
	 */
	public boolean isUserNamePresent(String username);
	
	/**
	 * Checks if is valid login details.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if is valid login details
	 */
	public boolean isValidLoginDetails(String username,String password);
	
	public RegistrationEntity createUser(RegistrationEntity entity);
	
	public RegistrationEntity getUserByName(String username);

}
