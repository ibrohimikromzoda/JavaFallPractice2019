package day28_JavaRecap;

import java.util.Arrays;

public class warmUp1 {
	
	/*
	warm Up:  
	    1. write a method that can convert km to miles
	    
	    1km = 0.612 miles
	    2. write a method that can convert gallons to litters
	    1G = 3.75L
	    
	     3. write a method that can print out the array in Descending order
     */
	
	public static void SortDes(int [] array) {
		// array = {10,8,99,0,-1};
		Arrays.sort(array); //  array = {-1,0,8,10,99}
		for (int i = array.length -1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
	}
	
	
	
	
	
	
	public static void GalonstoLiters (long galons) {
		double litters = galons * 3.75;
		System.out.println(galons+" Galon equals to "+litters+ " litters");
	}
	
	
	

	
	public static void main(String[] args) {
		KmtoMiles(1700);
		GalonstoLiters(15);
		int [] arr = {0,-1,1000,2000,5000};
		SortDes(arr);
		
		
		
	}
	
	public static void KmtoMiles (double km) {
		double miles = km*0.612;
		System.out.println(km+" km equals to miles "+miles+" miles");
		
	}
	  


}
