package Assignments;

import java.util.Scanner;

public class Devide_without_devision {
	public static void main(String[] args) {
		
		int result = 0;
		int c;
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter your first digit");
		int a = input.nextInt();
		System.out.println("Enter your second digit");
		int b = input.nextInt();
		
		c = a+b;
		while (c>b) {
			c=c-b;
			result++;
		}
		System.out.println("The answer is: "+result);
		
	}

}
