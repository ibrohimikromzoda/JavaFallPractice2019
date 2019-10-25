package A_replit;

import java.util.Scanner;

public class question89_repeat_separator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println();
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		
		
	    for (int i = 1; i <= count-1; i++) {
	    	System.out.print(word+separator);
	    }
	    System.out.println(word);

	}

}
