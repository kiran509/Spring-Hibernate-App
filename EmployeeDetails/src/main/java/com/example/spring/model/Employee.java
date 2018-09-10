package com.example.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Employee")
public class Employee implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long phoneNumber;
	private String fname, lname, password, address, email;
	private String uname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String name) {
		this.fname = name;
	}


	public String getLname() {
		return lname;
	}

	public void setLname(String name) {
		this.lname = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String name) {
		this.uname = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long number) {
		this.phoneNumber = number;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
