package A_replit;

import java.util.Arrays;

public class question170_Methods_with_String_clean_string {
	
	public static void main(String[] args) {
		 String [] array ={"one two three","two"};
	     String str ="";
	     System.out.println(str);
	    
	  }
	
	 public static String clean (String text ,String badWord) {

		 String text1 = text.replace(badWord, "");
	      
	      return text1;
	  

}
}