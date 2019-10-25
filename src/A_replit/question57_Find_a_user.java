package A_replit;

import java.util.Scanner;

public class question57_Find_a_user {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter full name");
		String fullname = input.nextLine();
		
		if (fullname.equalsIgnoreCase("Max Payne") || fullname.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User Found!");
			
		} else {
			System.out.println("Not Found!");
		}
		
		
		
	}

}
