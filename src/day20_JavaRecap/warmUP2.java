package day20_JavaRecap;

import java.util.Scanner;

public class warmUP2 {
	public static void main(String[] args) {
		
		// 4. write a program that asks user to enter number 5 times:
           //  1. find the sum of those 5 inputs
		
		Scanner input = new Scanner (System.in);
		
		
	
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			
			
		System.out.println("Enter your digit");
		
		 int num = input.nextInt();
		 
		 sum += num;
		 System.out.println("Sum of "+sum);
		
		
	   
	   
	   
	}

}
}