package A_replit;

import java.util.Scanner;

public class question88_Print_letters {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    
	    
	    
	  /*  
	    for(char ch= 'A';  ch <= 'Z'; ch++) {
            System.out.print(ch+"");
        }
        
	    for(char ch= start;  ch <= end; ch++) {
            System.out.print(ch+"");
        }
	   
	    */
	    
	    do {
	    	System.out.print(start);
	    	start++;
	    	
	    } while (start <=end);
	    
	    }
		
	}


