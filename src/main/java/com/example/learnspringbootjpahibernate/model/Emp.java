package com.example.learnspringbootjpahibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
	@Id
	private Long id;
	private String name;
	private String experiance;
	
	public Emp() {
		
	}
	public Emp(Long id, String name, String experiance) {
		super();
		this.id = id;
		this.name = name;
		this.experiance = experiance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExperiance() {
		return experiance;
	}
	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", experiance=" + experiance + "]";
	}
}
