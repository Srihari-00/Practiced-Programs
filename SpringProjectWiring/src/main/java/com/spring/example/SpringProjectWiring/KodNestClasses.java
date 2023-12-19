package com.spring.example.SpringProjectWiring;

public class KodNestClasses 
{
	Trainer tr;

	public KodNestClasses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KodNestClasses(Trainer tr) {
		super();
		this.tr = tr;
	}

	public Trainer getTr() {
		return tr;
	}

	public void setTr(Trainer tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "KodNestClasses [tr=" + tr + "]";
	}
	

}
