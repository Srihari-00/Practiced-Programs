package com.spring.autowiring.SpringProjectAutoWiring;

public class Person 
{
	Mobile mob;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Mobile mob) {
		super();
		System.out.println("Using Constructor");
		this.mob = mob;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		System.out.println("Using Setter method");
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [mob=" + mob + "]";
	}
}