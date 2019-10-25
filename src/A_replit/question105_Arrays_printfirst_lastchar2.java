package A_replit;

import java.util.Arrays;
import java.util.Scanner;

public class question105_Arrays_printfirst_lastchar2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println();
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		for (int i = 0; i < words.length; i++) {
			words[i]=""+words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
			 
		}
		System.out.println(Arrays.toString(words));
		 
	}
}
