package A_replit;

import java.util.Scanner;

public class question101_arrays_printfirstandlastchar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1));
		}

	}

}
