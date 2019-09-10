package replit;

import java.util.Scanner;

public class blackjack_44 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("House = ");
	    System.out.println("Player = ");
	    int house = scan.nextInt();
	    int player = scan.nextInt();
	    
	    
	   /*
	    
	    if (player >= 21) {
	    	System.out.println("output: bust");
	    } else if (player > house) {
	    	System.out.println("output: player wins");
	    	
	    } else if (house ==player) {
	    	System.out.println("output: its a tie");
	    } else  {
	    	System.out.println("output: player loss");
	    }
	    */
	    
	    if (player>=21) {
	    	System.out.println("output: bust");
	    } else if (player > house) {
	    	System.out.println("output: player wins");
	    } else if (house ==player) {
	    	System.out.println("output: its a tie");
	    } else if (house > player) {
	    	System.out.println("output: player loss");
	    }
		
	}

}
