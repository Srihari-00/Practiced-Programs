package com.learn.aggregation;

public class Airline 
{
	String brand;
	Pilot p;
	Airline(String brand, Pilot p)
	{
		this.brand=brand;
		this.p=p;
	}
	
	void Operations()
	{
		System.out.println(brand+" is doing operations");
		p.fly();
	}

}
