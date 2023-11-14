package com.example.learnspringbootjpahibernate.springdatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	private Long id;
	private String homeNo;
	private String city;
	private String country;
	
	public Address() {
		
	}
	public Address(Long id, String homeNo, String city, String country) {
		super();
		this.id = id;
		this.homeNo = homeNo;
		this.city = city;
		this.country = country;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", homeNo=" + homeNo + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
