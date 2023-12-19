package com.learn.aggregation;

public class AirlineApp {

	public static void main(String[] args)
	{
		Pilot p = new Pilot("Raju");
		p.fly();
		Airline ar = new Airline("FastAir",p);
		ar.Operations();
	}

}
