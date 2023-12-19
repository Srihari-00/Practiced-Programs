package com.kodnest.methods;

public class Methods {

	public static void main(String[] args)
	{
		String s1 = "KodNest Technologies Pvt Ltd";
		System.out.println(s1);//KodNest Technologies Pvt Ltd
		System.out.println(s1.toUpperCase());//KODNEST TECHNOLOGIES PVT LTD
		System.out.println(s1.toLowerCase());//kodnest technologies pvt ltd
		System.out.println(s1.startsWith("Kod"));//true
		System.out.println(s1.startsWith("Nest"));//false
		System.out.println(s1.endsWith("Ltd"));//true
		System.out.println(s1.endsWith("Pvt"));//false
		System.out.println(s1.contains("Tech"));//true
		System.out.println(s1.contains("Java"));//false
		System.out.println(s1.indexOf('T'));	//8
		System.out.println(s1.indexOf('o'));	//1
		System.out.println(s1.lastIndexOf('o'));//15
		System.out.println(s1.indexOf('z'));	//-1
		System.out.println(s1.charAt(9));		//e
		System.out.println(s1.substring(8));	//Technologies Pvt Ltd
		System.out.println(s1.substring(8,18));	//Technologi

		

	}

}
