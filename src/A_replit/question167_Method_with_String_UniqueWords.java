package A_replit;

import java.util.Arrays;
import java.util.Collections;

public class question167_Method_with_String_UniqueWords {
	
	
	public static void main(String[] args) {
	    //test your code
		
	    System.out.println( unique("spoon") ) ;
	  }
	  
	  public static String unique(String str) {
		  String unique ="";

		  for (int i = 0; i < str.length(); i++) {
			  if (!unique.contains (str.substring(i,i+1))) {
				  unique+=str.substring(i,i+1);
				  
			  }
		  }
            return unique;
            
		  }
	  }
	 


