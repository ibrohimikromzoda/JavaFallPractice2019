package A_replit;

import java.util.Scanner;

public class question179MethodswithString_reverse {
	
	public static void main(String[] args) {
		reverse("ibrohim");
		
	}
	public static String reverse (String input) {
		
		String reverse = "";
		
		for (int i = input.length()-1; i >=0; i--) {
			reverse+= input.substring(i, i+1);
		}
		System.out.println(reverse);
		
	
  return "reverse";
}
}