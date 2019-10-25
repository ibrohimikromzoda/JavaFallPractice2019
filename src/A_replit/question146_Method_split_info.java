package A_replit;

import java.util.Arrays;
import java.util.Scanner;

public class question146_Method_split_info {
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.println();
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
		
			//your code here
			
			String [] info1 = info.split(",");
			System.out.println("person name: " + info1[0] + " last name: " + info1[1] + " age: " + info1[2]);
			
			
			
			
		
		}//end person
	  

}
