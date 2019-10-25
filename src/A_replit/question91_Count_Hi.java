package A_replit;

import java.util.Scanner;

public class question91_Count_Hi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println();
		String word = input.nextLine();
		int count = 0;
		
		
		for (int i = 0; i < word.length()-1; i++) 
			if (word.substring(i, i+2).equals("hi")) 
				
			
			count++;
		
         System.out.println(count);
	}
}
