package A_replit;

import java.util.Scanner;

public class question75_without_x_x {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println();
		String word = input.next();

		if (word.contains("X") || word.contains("x")) {
			System.out.println(word.replace("X", "").replace("x", ""));
		} else {
			System.out.println(word);
		}

		
		
	}

}
