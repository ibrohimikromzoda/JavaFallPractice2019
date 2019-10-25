package day27_CustomMethods;

import java.util.Scanner;

public class VoidMethod_withArgument {
	
	/*
	 * methods with argument:
	 * 
	 * access-modifier specifier return-type name (parameter) {
	 * }
	 * 
	 * parameters : any data-type
	 */
	
	public static void main(String[] args) {
		//oddorEven(); // method was designed to take an argument or
		             //needs the argument in order to perform its task
	
       //oddorEven(8.5); // need to provide value can be assigned to the parameter of the methods
		oddorEven(50);
		
		int z = 100; // local variables MUST be init before we use it
		oddorEven(z); // variables z' value will be assigned to  parameter variable. 
	    //SumOfTwoNums();// not enough info was provided for the method to perform its task
		//SumOfTwoNums(10); // still not enough info
		SumOfTwoNums(10,20);
		
	}
	
	public static void SumOfTwoNums (int a, int b) {
		System.out.println("Sum of "+a+" and "+b+ " is: "+(a+b));
	}
	
	

	public static void oddorEven(int a) {
		
		if (a %2==0) {
			System.out.println(a+" Even number");
		} else {
			System.out.println(a+" Odd number");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
