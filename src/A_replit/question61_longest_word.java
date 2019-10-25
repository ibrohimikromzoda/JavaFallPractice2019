package A_replit;

import java.util.Scanner;

public class question61_longest_word {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter");
		String word1 = input.next();
	    String word2 = input.next();
	    
	    int n1 = word1.length();
	    int n2 = word2.length();
	    
	    if (n1 > n2) {
	     
	      System.out.println(word1);
	    } else {
	      
	      System.out.println(word2);
	    }
		
		
		
	}

}
