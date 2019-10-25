package day25_Array_continue;

import java.util.Arrays;

public class ArrayMethods {
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1);
		
		
		int [] arr = {1,2,3};
		System.out.println(arr);
		
		/*
		  to print entire array : we need to convert the array to String
		     Arrays.toString(VariableName) used for converting single dimenstional arrays
		     to a String.
		     Arrays class: Utility of all the arrays, 
		     
		     
		     Arrays class is  presented in "java.util" package
		     Arrays utilities :
		     Arrays.toString(variablName) : it converts an array( single dimensionl)
		      to String value
		     
		     ex:
		     int [] arr = {1,2,3,4};
		     String str [] = Arrays.toString(arr);
		     
		     Arrays.sort(variableName): sorts the values of array in Ascending order.
		     ex:
		     int [] arr = {5,4,3,2,1};
		     Arrays.sort(arr);
		     arr ==> {1,2,3,4,5};
		     
		     String [] = arr {"D", "B", "C"};
		     Arrays.sort(arr)
		     arr ==> {"B", "C","D"};
		     
		     String methods: 
		     split (str) : split the String by given value and returns it as String array:
		     ex : String words = "Java is fun";
		            String [] arr = words.split(" ");
		            arr ==> {"java", "is", "fun"};
		            
		            toCharArray(): returns the String value as char array:
		            
		            ex : String str = "Java";
		            char [] ch = str.toCharArray();
		            arr==> {'J', 'a', 'v', 'a"};
		     
 		     
		 */
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		String [] names = {"Elvira" , "Bibish", "Tural", "Daulet", "Hakan"};
		System.out.println(names[0]);
		System.out.println(names); //hashcode
		System.out.println(Arrays.toString(names));
		
		/*
		 Arrays.sort (varibaleName) :
		  sort of values of the array in acsending order (smallest to largest)
		 */
		
		int [] numbers = {9,8,100,3000,4,5,6};
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort (numbers); // sorts all the values of the array in 
        // sort method does : numbers = [4, 5, 6, 8, 9, 100, 3000]

		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Maximum: "+numbers[numbers.length-1]);
		System.out.println("Minimum "+numbers[0]);
		
		String [] nameLists = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi"};
		Arrays.sort(nameLists); // alphabetical order (from ASCII table)
		
		System.out.println(Arrays.toString (nameLists));
		
		char [] ch = {'0','9','8','5','3','2','1'};
		
		Arrays.sort(ch);
		System.out.println(Arrays.toString (ch));
		
		int [] nums = {2000,90,89,78,65,5555,444, -5};
		
		Arrays.sort (nums);
		
		System.out.println(Arrays.toString (nums));
		System.out.println("Minumum number: "+nums[0]);
		System.out.println("Maximum number: "+nums[nums.length-1]);
		System.out.println("Second max" +nums[nums.length-2]);
		System.out.println("Second minumum number: "+nums[1]);
		
		
		
		 /*
	     write aprogram that can print the arrays in Decsending order (largest to smallest)
	     
	     */
	    int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
	        Arrays.sort(MyNumbers);
	                // MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
	        //                        0   1   2   3   4    5      6
	        
	        System.out.println( Arrays.toString(MyNumbers) );
	    
	        String result ="[";
	        for(int i = MyNumbers.length-1; i  >= 0; i--) {
	            
	             result += MyNumbers[i] +", " ;
	            
	        }
	                System.out.println();
	                
	        result = result.substring(0, result.length()-2)+"]"; 
	                
	                System.out.println(result);
	    
	                
	    int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
	        Arrays.sort(arr2);  //  array will be sorted in Acsending order
	    //  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
	        //        0  1   2    3   4    5     6
	        
	        int[] Decedning = new int[arr2.length];
	        /*
	            Decedning[0] = arr2[6];
	            Decedning[1] = arr2[5];
	            Decedning[2] = arr2[4];
	            Decedning[3] = arr2[3];
	            Decedning[4] = arr2[2];
	            Decedning[5] = arr2[1];
	            Decedning[6] = arr2[0];
	        */
	        
	        int z=0;
	        for(int i = arr2.length-1; i >=0; i-- ) {
	            Decedning[ z ] = arr2[i];
	            z++;
	        }
	        
	        System.out.println( "Acsending order: "+ Arrays.toString(arr2));
	    
	        System.out.println("Descedning order: "+Arrays.toString(Decedning));
	                
	                
	                
		
		
		
		
		
	}

}
