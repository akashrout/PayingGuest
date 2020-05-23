package com.example.demo.room.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class RoomEntity.
 */
@Entity
@Table(name = "rooms")
public class RoomEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room_id")
	private Long id;

	/** The username. */
	@Column(name = "usernaame")
	private String username;

	/** The address. */
	@Column(name = "address")
	private String address;

	/** The city. */
	@Column(name = "city")
	private String city;

	/** The locality. */
	@Column(name = "locality")
	private String locality;

	/** The maxpeople. */
	@Column(name = "maxP")
	private String maxpeople;

	/** The gender. */
	@Column(name = "gender")
	private String gender;

	/** The rooms. */
	@Column(name = "rooms")
	private String rooms;

	/** The ac. */
	@Column(name = "ac")
	private String ac;

	/** The wifi. */
	@Column(name = "wifi")
	private String wifi;

	/** The food. */
	@Column(name = "food")
	private String food;

	/** The cost. */
	@Column(name = "cost")
	private String cost;

	/** The status. */
	@Column(name = "status")
	private String status;

	/**
	 * Instantiates a new room entity.
	 */
	public RoomEntity() {
		super();
	}

	/**
	 * Instantiates a new room entity.
	 *
	 * @param id        the id
	 * @param username  the username
	 * @param address   the address
	 * @param city      the city
	 * @param locality  the locality
	 * @param maxpeople the maxpeople
	 * @param gender    the gender
	 * @param rooms     the rooms
	 * @param ac        the ac
	 * @param wifi      the wifi
	 * @param food      the food
	 * @param cost      the cost
	 * @param status    the status
	 */
	public RoomEntity(Long id, String username, String address, String city, String locality, String maxpeople,
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
	 * @param id the id to set
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
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "RoomEntity [id=" + id + ", username=" + username + ", address=" + address + ", city=" + city
				+ ", locality=" + locality + ", maxpeople=" + maxpeople + ", gender=" + gender + ", rooms=" + rooms
				+ ", ac=" + ac + ", wifi=" + wifi + ", food=" + food + ", cost=" + cost + ", status=" + status + "]";
	}

	/**
	 * Sets the username.
	 *
	 * @param username the username to set
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
	 * @param address the address to set
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
	 * @param city the city to set
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
	 * @param locality the locality to set
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
	 * @param maxpeople the maxpeople to set
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
	 * @param gender the gender to set
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
	 * @param rooms the rooms to set
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
	 * @param ac the ac to set
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
	 * @param wifi the wifi to set
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
	 * @param food the food to set
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
	 * @param cost the cost to set
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
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
