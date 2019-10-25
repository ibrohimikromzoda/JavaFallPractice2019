package A_replit;

import java.util.Arrays;

public class question117_Arrays_copy_certain_values {

	public static void main(String[] args) {
    System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    
  }
  
  
  
  public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
    
	  String str = "";
	    for (String each: arr){
	      if (each.contains("e")) str += each + " ";
	    }
	    String[] fewValues = str.trim().split(" ");
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
  }
}
