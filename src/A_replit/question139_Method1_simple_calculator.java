package A_replit;

import java.util.Scanner;

public class question139_Method1_simple_calculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		 System.out.println ("enter first number: ");
		int a = input.nextInt();
		 System.out.println ("enter second number: ");
		int b = input.nextInt();
		plus(a,b);
		
		
		
	}
	
	
	
	public static void plus(int a, int b){
	     
	    
		
	   
	   
	    System.out.println ("result: "+(a+b));
	  }

}
