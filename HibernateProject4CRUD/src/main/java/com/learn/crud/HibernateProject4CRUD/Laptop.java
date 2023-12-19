package com.learn.crud.HibernateProject4CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop 
{
	@Id
	int lap_id;
	String brand;
	int cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Laptop [lap_id=" + lap_id + ", brand=" + brand + ", cost=" + cost + "]";
	}

	public Laptop(int lap_id, String brand, int cost) {
		super();
		this.lap_id = lap_id;
		this.brand = brand;
		this.cost = cost;
	}
	public int getLap_id() {
		return lap_id;
	}
	public void setLap_id(int lap_id) {
		this.lap_id = lap_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}