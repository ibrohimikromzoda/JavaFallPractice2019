package day20_JavaRecap;

import java.util.Scanner;

public class warmUP3 {
	
	public static void main(String[] args) {
		
		
		// 4. Write a program that asks user to enter number 5 times:
		// 1.Find the max mumber
		 
		
		Scanner input = new Scanner (System.in);
		
		
		int max = 0;
		
		for (int i = 1;  i<=5; i++) {
		
		
		System.out.println("Please a number");
		
		int inputNum = input.nextInt();
		
		if (inputNum > max) {
			max = inputNum;
			
			System.out.println("The max num is "+max);
		
		}
		}
	}
}
		
		
	
		
		
		
		
		
	


