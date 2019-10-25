package A_replit;

import java.util.Scanner;

public class question24 {
	public static void main(String[] args) {
		
	
	
	 // QUESTION 24
	 
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Welcome to the patient portal!");
	System.out.println("Please enter your personal information");
	System.out.println();
	
	
	System.out.println("Enter your first name");
	String name = scan.nextLine();
	
	
	System.out.println("Enter your last name");
	String lastname = scan.nextLine();
	
	System.out.println("Enter your email");
	String email = scan.nextLine();
	
	
	System.out.println("Enter your street");
	String street = scan.nextLine();
	
	
	System.out.println("Enter your city");
	String city = scan.nextLine();
	

	System.out.println("Enter your state");
	String state = scan.nextLine();
	
	System.out.println("Enter your zip code");
	int zip = scan.nextInt();
	
	System.out.println("Enter your work phone number");
	long workphone = scan.nextLong();
	
	System.out.println("Enter your personal phone number");
	long personalphone = scan.nextLong();
	
	System.out.println("Enter your age");
	int age = scan.nextInt();
	
	System.out.println("Enter your height");
	double height = scan.nextDouble();
	
	System.out.println("Enter your weight");
	double weight = scan.nextDouble();
	
	System.out.println("Are you married?");
	boolean result = scan.nextBoolean();

	
	System.out.println("Patient personal information");
	System.out.println("Full name: "+name+ ","+lastname);
	System.out.println("Address: "+street+","+city+","+state+zip);
	System.out.println("Contacts: work phone number - "+workphone+","+"personal phone number - "+personalphone+","+"email:"+email);
	System.out.println("Age: "+age);
	System.out.println("Height: "+height);
	System.out.println("Weight: "+weight+" pounds");
	System.out.println("Married?: "+result);



}
}
