package day15_Scanner;
import java.util.Scanner;
public class task03 {
	public static void main(String[] args) {
		
		
		// Write a program that ask user to unter first name and last name. and display will show full name
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your first name");
		
		String firstname = input.next();
		
		System.out.println("Enter your last name");
		
		String lastname = input.next();
		
		String fullname = lastname+ " "+ firstname;
		
		System.out.println("Your full name is "+fullname);
		
		input.close (); // gets rid of warning of the scanner class
		
	}

}
