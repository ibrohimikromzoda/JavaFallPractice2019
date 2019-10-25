package A_replit;

import java.util.Scanner;

public class question66_merge_them {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println();
		String result = "";
		String word1 = input.next();
		String word2 = input.next();
		
		
		for (int i = 0; i < word1.length() || i < word2.length(); i++) {
			if (i < word1.length()) {
				result+=(word1.charAt(i)); 
			}
			if (i < word1.length()) {
				result+=(word2.charAt(i)); 
			}
			
		}
			
		System.out.println(result);
		
		
		
		//System.out.println("" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1)
		//	+ word1.charAt(2) + word2.charAt(2));
			   
		   
			   
		   
		}
		
		
		
		
	}


