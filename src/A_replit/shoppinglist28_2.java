package A_replit;

import java.util.Scanner;

public class shoppinglist28_2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Item1, count and its price:");
		      String item1 = scan.nextLine();
		       int count1 = scan.nextInt();
		       double price1 = scan.nextDouble();
		       
		       System.out.println("Enter Item2, count and its price:");
		       scan.nextLine();
		       String item2 = scan.nextLine();
		       int count2 = scan.nextInt();
		       double price2 = scan.nextDouble();
		       
		       System.out.println("Enter Item3, count and its price:");
		       scan.nextLine();
		       String item3 = scan.nextLine();
		       int count3 = scan.nextInt();
		       double price3 = scan.nextDouble();
		       double totalPrice = (price1 * count1) + (price2 * count2) + (price3 * count3);
		       
		       
		       if (count1 == 0) {
		           String report = "Item2: " + item2 + " Price: " + (price2 * count2) + ", " + "Item3: " + item3 + " Price: "
		                   + (price3 * count3);
		           System.out.println(report);
		       } else if (count2 == 0) {
		           String report = "Item1: " + item1 + " Price: " + (price1 * count1) + ", " + "Item3: " + item3 + " Price: "
		                   + (price3 * count3);
		           System.out.println(report);
		       } else if (count3 == 0) {
		           String report = "Item1: " + item1 + " Price: " + (price1 * count1) + ", " + "Item2: " + item2 + " Price: "
		                   + (price2 * count2);
		           System.out.println(report);
		       }
		       System.out.println("Total price: " + totalPrice);
		
		
		
		/*
	    
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	   
	    
	    if (numberOfBedrooms ==1 ) {
	    	
	    	System.out.println("One Bedroom Selected set to starting price "+1100);
	    } else if (numberOfBedrooms==2) {
	    	System.out.println("Two Bedroom Selected set to starting price as 1850");
	    } else if (numberOfBedrooms==3) {
	    	System.out.println("Three Bedroom Selected set to starting price as 2550");
	    } else {
	    	System.out.println("No such Bedrooms available");
	    }
	     
	    if ( startingPrice == 1) {
	    	System.out.println(1100);
	    	
	    }
	     
	    System.out.println("Starting Price: "+startingPrice);
	  
	     */
	    

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
