package A_replit;

import java.util.Scanner;

public class question92_factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
	  int  num = scan.nextInt();
	  long fact = 1;
	    
	    for (int i = 1; i <= num; i++) {
	    	
	    
	    fact *= i;
	}  
	    System.out.println(fact);
	    
	      
	

}
}