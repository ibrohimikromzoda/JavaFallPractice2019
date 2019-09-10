package day15_Scanner;
import java.util.Scanner;
public class task02 {
	public static void main(String[] args) {
		/*
		 Write a program that shows the biggest number of 3 values using ternary
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter nun1");
		
		double num1 = input.nextDouble();
		
System.out.println("Enter nun2");
		
		double num2 = input.nextDouble();
		
System.out.println("Enter nun3");
		
		double num3 = input.nextDouble();
		
		double largest = (num1 > num2 && num1 > num3) ? num1
				: (num2>num1 && num2 >num3) ? num2
						: num3;
		System.out.println("Largest number is "+largest);
		
	}

}
