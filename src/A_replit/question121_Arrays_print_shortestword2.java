package A_replit;

import java.util.Arrays;
import java.util.Scanner;

public class question121_Arrays_print_shortestword2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		String [] words = { scan.next(),scan.next(),scan.next(),
			    scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),
			    scan.next(),scan.next()};
		
		  String smallest = words[0];
			    
			    for (int i =1; i < words.length; i++) {
			      if (words[i].length() < smallest.length()) {
			    	  smallest = words[i];
			        
			      }
			     
			    }

		  System.out.println(smallest);
	}

}
