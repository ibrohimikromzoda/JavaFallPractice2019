package A_replit;

import java.util.Scanner;

public class question108_Print_Triangle {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.println();
		int n = input.nextInt();
		
		
		
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			 System.out.println();

		}
		   
		
	}

}
