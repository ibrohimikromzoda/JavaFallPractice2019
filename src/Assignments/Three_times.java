package Assignments;

import java.util.Scanner;

public class Three_times {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter your input");
		
		String word1 = input.next();
		
		
		char ch1 = word1.charAt(0);
		
		
		char ch2 = word1.charAt(1);
		
		
		System.out.println(ch1+""+ch2+""+ch1+""+ch2+""+ch1+""+ch2);
		
		
		
	}

}
