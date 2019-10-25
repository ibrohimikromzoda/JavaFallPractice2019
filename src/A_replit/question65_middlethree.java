package A_replit;

import java.util.Scanner;

public class question65_middlethree {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println ("Enter your word");
	    String word = scan.next();
	   
	    
	    if (word.length()==5) {
	    	System.out.println(word.substring(1, 4));
	    } else if (word.length()==7){
	    	System.out.println(word.substring(2, 5));
	    } else {
	    	System.out.println("invalid");
	    }
	    
	    
		
	}

}
