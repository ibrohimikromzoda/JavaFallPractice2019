package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class exxx {
	/*
	  write a return method that accepts a char array and sorts it in descending order
	  write a return method that accepts a String array and sorts it in descending order
	 */

	public static void main(String[] args) {
     String [] names = {"Ibrohim","Lola","Zaynab"};
     names = SortDe(names);
     System.out.println( Arrays.toString( names ) );
    
     
	
	}
	public static String [] SortDe  (String []arr) {
		
		Arrays.sort(arr);  // ascending order
        String[] arr2 = new  String[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                arr2[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return arr2;
	}
	
		
	}


