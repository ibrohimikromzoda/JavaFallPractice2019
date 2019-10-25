package day37_classAndObject;

public class Car {
	
	/*
	 car 
	 data/attribute 
	 model, Year, brand, color, price, mileage, VIN...
	 
	 actions:
	 start, driver, accelerate, stop, drift, brake, get ticket....
	 
	 */
	 
	
	
	String Model;
	int Year;
	String Color;
	double Price;
	long Mileage;
	String Brand;
	
	
	
	public void  drive () {
		
		System.out.println("Driving "+Brand);
	}
	
	public void start() {
		System.out.println(Brand+" is starting");
	}
	// 2020 Toyota Corolla. white, 10000$
	public void getInfo () {
		System.out.println(Year + " " +Brand+" "+Model+", "+Mileage+" miles"+", "+Color+", $"+Price);
	}

}
