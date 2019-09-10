package day17_String_Class;

import java.util.Scanner; // imports 1 class only

//import java.util.*; // it impots all the classes from java.util

public class warmUp {
	public static void main(String[] args) {
		
		/*
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first and last name");
		
		String firstname = input.nextLine();
		
		int n = firstname.length()  ;  
        System.out.println(n);
		
		System.out.println("Your full name has " +n+" character");
		*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your first name last name");
		String firstname = input.nextLine();
		String lastname = input.nextLine();
		String fullname = firstname.concat(" "+lastname);
		
		int num = fullname.length();
		System.out.println(num);
		System.out.println(fullname+ " contains " +num+ " characters");
		
		
		
	}

}
