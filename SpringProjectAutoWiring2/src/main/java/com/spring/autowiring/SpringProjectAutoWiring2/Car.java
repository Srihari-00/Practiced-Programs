package com.spring.autowiring.SpringProjectAutoWiring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car
{
	@Autowired
	@Qualifier("d3")
	Driver dr;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Driver dr) {
		super();
		this.dr = dr;
	}

	public Driver getDr() {
		return dr;
	}

	public void setDr(Driver dr) {
		this.dr = dr;
	}

	@Override
	public String toString() {
		return "Car [dr=" + dr + "]";
	}
	

}
