package day34_Constructors;

import java.util.ArrayList;

public class warmup {
	
		/*
		 Warm up:
    1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
    2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
    3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
    4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
    5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)

		 */
	
	public static void main(String[] args) {

		//task1
	String a =	RemoveDup("defdef"); // "abc"
	System.out.println(a);
	System.out.println(RemoveDup("abadabaac")); // another option to run
	// task2
	int count = count ("aabccdabcdaaaaa", "a");
	System.out.println(count);
	System.out.println(count ("aabccdabcdaaaaa","a"));
	
	// task3
	System.out.println(frequency("abcabcabccc"));
	
	//task4
	ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(-100);
    list.add(20);
    list.add(0);
    list.add(30);

int maxnum = maximum(list);  // 30
System.out.println(maxnum);

//task05
int minnum  = minimum(list); //0
System.out.println(minnum);
	
		
	}
	
	
	   // task1
		public static String RemoveDup (String str) {
			String result = "";
			for (int i =0; i < str.length(); i++) {
				if (! result.contains(str.substring(i, i+1))) {
					result += str.substring(i, i+1);
				}
			}
			
			
			return result;
			
		}
		//task2
		public static int count (String str1, String str2) {
			//                     abab         a
			String result = "";
			int count  = 0; // to count how many time b is appeared in a 
			
			while ( str1.contains(str2)) {
				count++;
				str1 = str1.replaceFirst(str2, "");
			} 
			/*
			 if(a.substring(i, i+ b.length()).equals(b)) {
                count ++;         another way to do
			 */
			
			
			return count;
		}
		//task3
	    public static String frequency (String str) {
		       //                     abcabcabc ==> a3b3c3
		  
		  
		  String nonDup = RemoveDup(str); // "abc"
		  String result = ""; // to store the expected result
		                                                          
		  for (int i =0; i < nonDup.length(); i++) {
			  
		  int count = count(str,""+nonDup.charAt(i));
		  result += ""+nonDup.charAt(i)+count;
		  }
		  
		  
	    	
	    	
		  
		  
		  
		  return result;
	  }
        //task4
	    public static int maximum (ArrayList<Integer> list) {

	    	
	    	int max = Integer.MIN_VALUE;
	    	
	    	for (int each : list) {
	    		if (each > max) {
	    			max = each;
	    		}
	    	}
	    	
	    	
	    	
	    	
	    	
	    	return max;
	    }
	    //task5
	    public static int minimum (ArrayList<Integer> list) {
           int min = Integer.MAX_VALUE;
	    	
	    	for (int each : list) {
	    		if (each < min) {
	    			min = each;
	    		}
	    	}
	    	
	    	
	    	
	    	
	    	
	    	return min;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
