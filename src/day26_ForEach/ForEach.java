package day26_ForEach;
import java.util.Arrays;

public class ForEach {
public static void main(String[] args) {
	
	/*
	 For each loop :
	  used to access the value in a collection of values,
	 its a loop thats already been iterated. for each loop can Never be infinite loop
	 
	 syntax of for each loop :
	 for (DataType VariableName) : ArrayName) {
	 
	  
	 
	 */
	  int [] arr = {1,2,3,4,5};
	  for (int i = 0; i < arr.length; i++) {
		  
		  System.out.print(arr[i]);
	  }
	 System.out.println();
	  System.out.println("===============");
	  for (int each : arr ) {
		  System.out.print(each);
		  
	  }
	  System.out.println();
	  
	  String [] str1 = {"A","B","C","D","E","F"};
	  for (String values : str1) {
		  System.out.print(values);
	  }
	System.out.println();
	  char [] ch = {'z','x','y','c','a','b'};
	  Arrays.sort(ch);
	  for (char charzzz  : ch) {
		 System.out.print(charzzz); 
	  }
	  System.out.println();
	  
	  System.out.println("==========");
	  int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,20};
	  for (int varname : arr1) {
		  if (varname%2==0) 
		  System.out.print(varname+" "); // even numbers
	  }
	  
	  System.out.println();
	 
	  
	  for (int varname : arr1) {
		  if (varname%2!=0) 
		  System.out.print(varname+" "); // odd numbers
	  }
	  
	
	
	
	
	
	
	
	
	
}
}
