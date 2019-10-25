package A_replit;

import java.util.Scanner;

public class question184_Method_with_String_palindrome {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Race car"));
		
		
				
		
		
	}
	public static boolean isPalindrome(String check) {
		
		 String new1 = "";
		   String check1 = check.toLowerCase().replaceAll(" ","");
			   
			   for (int i = check1.length()-1; i >= 0 ; i --) {
			     new1 += check1.charAt(i);
			   }
			  
			    if ( new1.equals(check1)) {
			      return true;
			      
			    } return false;
		
}
	/*
	  public static boolean isPalindrome(String check) {
    
    
    String reversed = "";
    boolean result; 
    
    for (int i = check.length()-1; i >= 0; i--) {
      reversed += check.substring(i, i+1);
    }
    
    reversed = reversed.replace(" ", "");
    if (check.equalsIgnoreCase(reversed)) {
     result = true;
    }
    else {
     result = false;
    }
    
    return result;
    
  }
	 */


}
