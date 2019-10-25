package day27_CustomMethods;

public class practice {

	/*
	 Write a method that can remove duplicates from the String and prints out the result
	 
	 ex : aaaabbbbbcccccc
	 output : abc
	 */
	
	public static void main(String[] args) {
		RemoveDuplicates();
		
		
	}
	
     public static void RemoveDuplicates () {
    	 
    	 String str = "aaaabbbbcccc";
 		
 		String result = "";
 		
 		for (int i =0 ; i <str.length(); i++) {
 			if (! result.contains(str.substring(i, i+1) )) {
 				result +=str.substring(i, i+1);
 				
 			}
 		}
 		
 		System.out.println(result);
     }
}
