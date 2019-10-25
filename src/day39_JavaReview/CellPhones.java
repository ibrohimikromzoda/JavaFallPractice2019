package day39_JavaReview;

public class CellPhones {
	
	/*
	 
	 */
	String brand;
	double price;
	String color;
	double screensize;
	String model;
	
	public CellPhones() { // set up default values for attributes of the 

		brand = "iPhone";
		model = "10";
		screensize = 5.8;
		color = "White";
		price = 700;
		
		
	}
    public CellPhones (String brand, double price, String color, double screensize, String model) {
    	this.brand=brand;
    	this.price = price;
    	this.color = color;
    	this.screensize = screensize;
    	this.model=model;
    }
    
	public void call(long PhoneNumber ) {
		System.out.println(brand+" "+model+" "+" is calling..."+PhoneNumber);
	}
	
	public void SendMessage(long PhoneNumber) {
		System.out.println("Sending Messages to "+PhoneNumber);
	}

	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
	}
	
}
