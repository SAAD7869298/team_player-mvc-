package com.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "player")
public class player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull(message = "Name is required")
	@Size(min = 2, message = "Name must be at least 2 characters")
	private String name;
	
	@NotNull(message = "Number is required")
	@Min(value = 1, message = "Number must be at least 1")
	@Max(value = 99, message = "Number must be less than or equal to 99")
	private int number;
	
	@NotNull(message = "Address is required")
	@Size(min = 4, message = "Address must be at least 4 characters")
	private String address;
	
	@NotNull(message = "Phone is required")
	@Pattern(regexp = "^[0-9]{11}$", message = "Phone must be a valid 11-digit number")
	private String phone;

	public player() {
	}

	public player(int id, String name, int number, String address, String phone) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
		this.phone = phone;
	}

	public player(String name, int number, String address, String phone) {
		this.name = name;
		this.number = number;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
