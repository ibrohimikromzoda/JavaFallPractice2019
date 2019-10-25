package day18_String_class_continue;

import java.util.Scanner;

public class String_methods_boolean {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
	/*
	 isEmpty(); check if the String is empty
	 returns boolean expression
	 */
		
		String str = "Cybertek";
		 boolean R1 = str.isEmpty(); // false
		 System.out.println(R1); //false
		
		String str2 = "";
		if (str2.isEmpty()) {
			System.out.println("its empty String");
		} else {
			System.out.println("its not empty");
		}
		/*
		 equals(str): checks if the two String face
		 values are equal or not, then returns boolean expression
		 equal ==> true    !equal ==> false
		  */
		
		String A1 = "Cybertek";
		String A2 = new String ("Cybertek");
		System.out.println(A1==A2); // false (two different location)
		
		boolean R2= A1.equals(A2); // true
		System.out.println(R2);
		
		System.out.println("java".equals("Java"));// fasle cuz of case sensitivity
		
		/* 
		 equalsIgnoreCase(str) checks if the two String face
		 values are equal or not, then returns boolean expression
		 Case sensitivity does not matter
		 */
		String s1 = "JAVA";
		String s2 = new String ("java");
		System.out.println(s1==s2); // false different location
		System.out.println(s1.equals(s2)); // false, case sensitivity
		System.out.println(s1.equalsIgnoreCase(s2));// true
		
		/*
		 contains (str): checks if the str is containted in String 
		 or not, then it returns boolean expression
		 contained ==>  true          !contained ==> false
		 */
		
		String name = "Muhtar";
		 boolean Result =   name.contains("good guy"); //false
        System.out.println(Result);
        
        String name2 = "Marufjon";
        System.out.println(name2.contains ("m")); // false, case sensitivity
        
        /*
         startWith "str); checks if the String is started
         with str or not then returens boolean expression
         
         startedwith ==> true       !startedwith ==> false
         */
        
        String Today = "Java";
         boolean Result2  = Today.startsWith("J");// true
         System.out.println(Result2); // true
         
         String names = "Cybertek School is a great place to learn java";
         System.out.println(names.startsWith("Cybertek School")); //true
         
         /*
          endWith(str) : checks if the String is ended with given
          str or not, then returns boolean expression
          
          endedwith ==? true       !endedwith ==> false
          
          */
         
         String B1 = "Muhtar";
         System.out.println(B1.endsWith("r") ); // true
         System.out.println(B1.endsWith("M") ); // false
         
        
        
        
        
        
        
        
        
        
        
        
}
}