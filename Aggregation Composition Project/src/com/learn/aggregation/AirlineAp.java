package com.learn.aggregation;

public class AirlineAp {

	public static void main(String[] args) 
	{
		Pilot p = new Pilot("Raju");
		Airline ar = new Airline("FastAir",p);
		ar.Operations();
		
		ar=null;
		ar.Operations();
	}

}
