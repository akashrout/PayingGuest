package com.example.demo.user.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class RegistrationEntity.
 */
@Entity
@Table(name = "registration")
public class RegistrationEntity {

	/** The id. */

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;

	/** The reg uname. */
	@Id
	@Column(name = "username")
	private String username;

	/** The reg password. */
	@Column(name = "password")
	private String password;

	/** The reg name. */
	@Column(name = "name")
	private String reg_name;

	/** The reg dob. */
	/*
	 * @Column(name = "dob") private String reg_dob;
	 */

	/** The email. */
	@Column(name = "email")
	private String reg_email;

	/** The reg gender. */
	@Column(name = "gender")
	private String reg_gender;

	/** The reg contact. */
	@Column(name = "contact")
	private String reg_contact;

	/** The role. */
	@Column(name = "role")
	private String role;

	/** The profile pic. */
	@Lob
	@Column(name = "profile_Picture", columnDefinition = "mediumblob")
	private byte[] profile_pic;

	/**
	 * Instantiates a new registration entity.
	 */
	public RegistrationEntity() {
		super();
	}
	
	
	

	/**
	 * Instantiates a new registration entity.
	 *
	 * @param username the username
	 * @param password the password
	 * @param reg_name the reg name
	 * @param reg_email the reg email
	 * @param reg_gender the reg gender
	 * @param reg_contact the reg contact
	 * @param role the role
	 * @param profile_pic the profile pic
	 */
	public RegistrationEntity(String username, String password, String reg_name, String reg_email, String reg_gender,
			String reg_contact, String role, byte[] profile_pic) {
		super();
		this.username = username;
		this.password = password;
		this.reg_name = reg_name;
		this.reg_email = reg_email;
		this.reg_gender = reg_gender;
		this.reg_contact = reg_contact;
		this.role = role;
		this.profile_pic = profile_pic;
	}




	/**
	 * Instantiates a new registration entity.
	 *
	 * @param id          the id
	 * @param username    the username
	 * @param password    the password
	 * @param reg_name    the reg name
	 * @param reg_email   the reg email
	 * @param reg_gender  the reg gender
	 * @param reg_contact the reg contact
	 * @param role        the role
	 * @param profile_pic the profile pic
	 */
	public RegistrationEntity(Long id, String username, String password, String reg_name, String reg_email,
			String reg_gender, String reg_contact, String role, byte[] profile_pic) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.reg_name = reg_name;
		this.reg_email = reg_email;
		this.reg_gender = reg_gender;
		this.reg_contact = reg_contact;
		this.role = role;
		this.profile_pic = profile_pic;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the reg name.
	 *
	 * @return the reg name
	 */
	public String getReg_name() {
		return reg_name;
	}

	/**
	 * Sets the reg name.
	 *
	 * @param reg_name the new reg name
	 */
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}

	/**
	 * Gets the reg email.
	 *
	 * @return the reg email
	 */
	public String getReg_email() {
		return reg_email;
	}

	/**
	 * Sets the reg email.
	 *
	 * @param reg_email the new reg email
	 */
	public void setReg_email(String reg_email) {
		this.reg_email = reg_email;
	}

	/**
	 * Gets the reg gender.
	 *
	 * @return the reg gender
	 */
	public String getReg_gender() {
		return reg_gender;
	}

	/**
	 * Sets the reg gender.
	 *
	 * @param reg_gender the new reg gender
	 */
	public void setReg_gender(String reg_gender) {
		this.reg_gender = reg_gender;
	}

	/**
	 * Gets the reg contact.
	 *
	 * @return the reg contact
	 */
	public String getReg_contact() {
		return reg_contact;
	}

	/**
	 * Sets the reg contact.
	 *
	 * @param reg_contact the new reg contact
	 */
	public void setReg_contact(String reg_contact) {
		this.reg_contact = reg_contact;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Gets the profile pic.
	 *
	 * @return the profile pic
	 */
	public byte[] getProfile_pic() {
		return profile_pic;
	}

	/**
	 * Sets the profile pic.
	 *
	 * @param profile_pic the new profile pic
	 */
	public void setProfile_pic(byte[] profile_pic) {
		this.profile_pic = profile_pic;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "RegistrationEntity [id=" + id + ", username=" + username + ", password=" + password + ", reg_name="
				+ reg_name + ", reg_email=" + reg_email + ", reg_gender=" + reg_gender + ", reg_contact=" + reg_contact
				+ ", role=" + role + ", profile_pic=" + Arrays.toString(profile_pic) + "]";
	}

}
