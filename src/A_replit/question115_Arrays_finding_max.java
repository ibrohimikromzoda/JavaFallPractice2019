package A_replit;

import java.util.Scanner;

public class question115_Arrays_finding_max {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println();
		
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		String longestName="";
		
		int max = 0;
		for (int i = 0; i < words.length; i++) {
		  if (words[i].length() > max) {
		    max = words[i].length();
		    longestName = words[i];
		  }
		}
		
		System.out.println(longestName);
		
		
		

		

}
}
