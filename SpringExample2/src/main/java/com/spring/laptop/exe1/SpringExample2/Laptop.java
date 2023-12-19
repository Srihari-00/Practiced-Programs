package com.spring.laptop.exe1.SpringExample2;

public class Laptop 
{
	int serialNo;
	String brand;
	int price;
	public Laptop() {
		super();
	}
	
	@Override
	public String toString() {
		return "Laptop [serialNo = " + serialNo + ", brand = " + brand + ", price = " + price + "]";
	}

	public Laptop(int serialNo, String brand, int price) {
		super();
		this.serialNo = serialNo;
		this.brand = brand;
		this.price = price;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
