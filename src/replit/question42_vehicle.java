package replit;

import java.util.Scanner;

public class question42_vehicle {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter vehicle's year:");
	int vehicleYear = input.nextInt();
	
	if (vehicleYear == 1995 && vehicleYear <= 1998) {
		System.out.println("Your vehicle needs to be recalled!");
	} else if (vehicleYear <= 2001 && vehicleYear <=2002) {
		System.out.println("Your vehicle needs to be recalled!");
	} else if (vehicleYear <= 2004 && vehicleYear <=2006) {
		System.out.println("Your vehicle needs to be recalled!");
	} else if (vehicleYear <=2015 && vehicleYear <=2017) {
		System.out.println("Your vehicle needs to be recalled!");
	} else {
		System.out.println("Your vehicle is fine, enjoy!");
	}
	
}
}
