package day15_Scanner;
import java.util.Scanner;
public class StringInput {
public static void main(String[] args) {
	
	/*
	 next vs nextLine(); ==>
	 
	 	*/
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your first name");
	String firstname = scan.next();	
	//String firstname = scan.nextLine();
	
	
	System.out.println(firstname);
	
	System.out.println("Enter your last name");
	String lastname = scan.next();	
	//String lastname = scan.nextLine();
	
	
	
	System.out.println("First name is: "+firstname);
	System.out.println("Last name is: "+lastname);
}
}
