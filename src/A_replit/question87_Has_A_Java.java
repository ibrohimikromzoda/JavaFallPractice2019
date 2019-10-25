package A_replit;

import java.util.Scanner;

public class question87_Has_A_Java {

	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println();
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.contains("java")){
	      if(word.substring(0,1).equals("j")){
	      System.out.println("true");
	      }else if(word.substring(1,2).equals("j")){
	        System.out.println("true");
	      }else {
	        System.out.println("false");
	      }
	    }
	    else {
	      System.out.println("false");
	    }
   
			
	    
	    
	  }
	}

