package day18_String_class_continue;

import java.util.Scanner;

public class warmUp2 {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	/*
	 Enter your name
	 mUhTaR
	 Enter your lastname
	 cYBerTeK
	 
	 output : Muhtar Cybertek
	 */
	
	System.out.println("Etner your first name");
	
	String firstname = input.nextLine();
	String lastname = input.nextLine();
	
	firstname = firstname.substring (0,1).toUpperCase()
			+ firstname.substring(1).toLowerCase();
	
	
	
	
	lastname = lastname.substring (0,1).toUpperCase()
			+ lastname.substring(1).toLowerCase();
	String fullname = firstname +" " +lastname;
	System.out.println(fullname);
	
	
	
	
	
}
}
