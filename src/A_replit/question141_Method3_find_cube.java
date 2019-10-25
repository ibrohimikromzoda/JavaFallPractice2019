package A_replit;

import java.util.Scanner;

public class question141_Method3_find_cube {
	
	public static void cube () {
		Scanner input = new Scanner (System.in);
		System.out.println("enter your number");
		int a = input.nextInt();
		a = (a*a*a);
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		cube();
		
	}

}
