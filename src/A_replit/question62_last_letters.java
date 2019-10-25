package A_replit;

import java.util.Scanner;

public class question62_last_letters {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter");
		
	  String word = input.next();
	  
	  System.out.println(word.substring(0, 1)+""+(word.substring(word.length()-1)));
	 
	 //  System.out.println (word.charAt(0)+word.charAt(4));
		
	}

}
