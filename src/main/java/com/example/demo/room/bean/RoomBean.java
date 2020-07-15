package com.example.demo.room.bean;

import javax.persistence.Column;

// TODO: Auto-generated Javadoc
/**
 * The Class RoomBean.
 */
public class RoomBean {

	/** The id. */
	private Long id;

	/** The username. */
	private String username;

	/** The address. */
	private String address;

	/** The city. */
	private String city;

	/** The locality. */
	private String locality;

	/** The maxpeople. */
	private String maxpeople;

	/** The gender. */
	private String gender;

	/** The rooms. */
	private String rooms;

	/** The ac. */
	private String ac;

	/** The wifi. */
	private String wifi;

	/** The food. */
	private String food;

	/** The cost. */
	private String cost;

	/** The status. */
	private String status;

	/**
	 * Instantiates a new room bean.
	 */
	public RoomBean() {
		super();
	}

	/**
	 * Instantiates a new room bean.
	 *
	 * @param id the id
	 * @param username the username
	 * @param address the address
	 * @param city the city
	 * @param locality the locality
	 * @param maxpeople the maxpeople
	 * @param gender the gender
	 * @param rooms the rooms
	 * @param ac the ac
	 * @param wifi the wifi
	 * @param food the food
	 * @param cost the cost
	 * @param status the status
	 */
	public RoomBean(Long id, String username, String address, String city, String locality, String maxpeople,
			String gender, String rooms, String ac, String wifi, String food, String cost, String status) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
		this.city = city;
		this.locality = locality;
		this.maxpeople = maxpeople;
		this.gender = gender;
		this.rooms = rooms;
		this.ac = ac;
		this.wifi = wifi;
		this.food = food;
		this.cost = cost;
		this.status = status;
	}
	
	
	

	public RoomBean(String username, String address, String city, String locality, String maxpeople, String gender,
			String rooms, String ac, String wifi, String food, String cost, String status) {
		super();
		this.username = username;
		this.address = address;
		this.city = city;
		this.locality = locality;
		this.maxpeople = maxpeople;
		this.gender = gender;
		this.rooms = rooms;
		this.ac = ac;
		this.wifi = wifi;
		this.food = food;
		this.cost = cost;
		this.status = status;
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
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the locality.
	 *
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * Sets the locality.
	 *
	 * @param locality the new locality
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * Gets the maxpeople.
	 *
	 * @return the maxpeople
	 */
	public String getMaxpeople() {
		return maxpeople;
	}

	/**
	 * Sets the maxpeople.
	 *
	 * @param maxpeople the new maxpeople
	 */
	public void setMaxpeople(String maxpeople) {
		this.maxpeople = maxpeople;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the rooms.
	 *
	 * @return the rooms
	 */
	public String getRooms() {
		return rooms;
	}

	/**
	 * Sets the rooms.
	 *
	 * @param rooms the new rooms
	 */
	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	/**
	 * Gets the ac.
	 *
	 * @return the ac
	 */
	public String getAc() {
		return ac;
	}

	/**
	 * Sets the ac.
	 *
	 * @param ac the new ac
	 */
	public void setAc(String ac) {
		this.ac = ac;
	}

	/**
	 * Gets the wifi.
	 *
	 * @return the wifi
	 */
	public String getWifi() {
		return wifi;
	}

	/**
	 * Sets the wifi.
	 *
	 * @param wifi the new wifi
	 */
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	/**
	 * Gets the food.
	 *
	 * @return the food
	 */
	public String getFood() {
		return food;
	}

	/**
	 * Sets the food.
	 *
	 * @param food the new food
	 */
	public void setFood(String food) {
		this.food = food;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "RoomBean [id=" + id + ", username=" + username + ", address=" + address + ", city=" + city
				+ ", locality=" + locality + ", maxpeople=" + maxpeople + ", gender=" + gender + ", rooms=" + rooms
				+ ", ac=" + ac + ", wifi=" + wifi + ", food=" + food + ", cost=" + cost + ", status=" + status + "]";
	}
	
	

}
