package com.hibernate.exe2.HibernateProject2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike 
{
	//primary Key
	@Id
	int bikeId;
	String brand;
	String color;
	
	@OneToOne
	Student std;
	public Bike()
	{
		
	}

	public Bike(int bikeId, String brand, String color, Student std) {
		super();
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
		this.std = std;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}
	
}
