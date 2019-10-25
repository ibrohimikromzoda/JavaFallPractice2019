package A_replit;

import java.util.Scanner;

public class quesiton86_catanddogs {
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner (System.in);
		
		int countOfCats = 0;
	    int countOfDogs = 0;
	  
	    String word = input.next();
	    for (int i = 0; i < word.length() -2; i++)
	        if (word.substring(i,i+3).equals("cat"))
	        	countOfCats++;
	    
	    for (int i = 0; i < word.length()-2; i++)
	    	if (word.substring(i,i+3).equals("dog"))
	    		countOfDogs++;
	      
	   
	        boolean b = countOfCats ==countOfDogs ? true : false;
	        System.out.println(b);
	       
	        
	    
	      
		
	}

}
