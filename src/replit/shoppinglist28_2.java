package replit;

import java.util.Scanner;

public class shoppinglist28_2 {
	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Item1, count and its price:");
		 String item1 = scan.next();
		 int count1 = scan.nextInt();
		double price1 = scan.nextDouble();
		
		
		
		
		System.out.println("Enter Item2, count and its price:");
		 String item2 = scan.next();
		 int count2 = scan.nextInt();
		double price2 = scan.nextDouble();
		
		
		System.out.println("Enter Item3, count and its price");
		 String item3 = scan.next();
		 int count3 = scan.nextInt();
		double price3 = scan.nextDouble();
		
		
		if (count1 > 0 ) {
			System.out.println(count1*price1);
		} else if (count2 >0) {
			System.out.println(count2*price2);
		} else if (count3 >0) {
			System.out.println(count3*price3);
		}
		 
		 System.out.println("Item1: " +item1+ " Price: "+ price1+ "Item2: " + item2 + " Price:" + price2 + " Item3 " +item3 + " Price: " + price3);
		*/
		Scanner scan = new Scanner(System.in);
	    
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
	  
	     
	    

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
