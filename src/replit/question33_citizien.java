package replit;

import java.util.Scanner;

public class question33_citizien {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter current count for SeniorCitizien and nonSeniorCitiziens:");
		int seniorCitizien = input.nextInt();
		int nonseniourCitizien = input.nextInt();
		
		
		System.out.println("What is new citizien's age?");
		int age = input.nextInt();
		if (age >= 65) {
			seniorCitizien++;
			System.out.println("Senior Citizen");
		} else if (age<=65)  {
			nonseniourCitizien++;
			System.out.println("Non-Senior Citizen");
		}
		
		System.out.println("New seniorCitiziens count "+seniorCitizien);
		System.out.println("New nonSeniorCitizens count "+nonseniourCitizien);
		
		
		
	}

}
