package A_replit;

import java.util.Scanner;

public class question68_verify_contains {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
	System.out.println();
		String word= input.nextLine();
		String sentence = input.nextLine();
		
		boolean matching = sentence.contains(word);
		
		if (matching) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
