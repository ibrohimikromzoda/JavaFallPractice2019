package A_replit;

import java.util.Scanner;

public class question90_countJava {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println();
	String word = input.nextLine();
	
	int count = 0;
	
	for (int i = 0; i < word.length() - 3; i++) 
		if (word.substring(i, i + 4).equals("java")) 
		  count++;
	
	
	
		System.out.print(count);
 
	
	
	}
}

