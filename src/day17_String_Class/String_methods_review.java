package day17_String_Class;

import java.util.Scanner;

public class String_methods_review {
	public static void main(String[] args) {
		
		/*
		 1.String is an object
		 there are two ways we can create String class object:
		 1.String literals
		   String str = "Cybertek";
		   2.by using "new" keyword :
		   String str = new String (Cybertek);
		   Java Heap : a memory location where all the 
		   objects will be saved at
		   
		   String pool : located in JAva Heap Memory,
		   its very special memory location for String literals
		   
		   every time if the String object is created by literals
		   the object will be saved at String pool
		   
		   every time if the String object is created using 
		   "new" keyword that object will be saved at Heap memory
		   out side String pool
		   
		   2. String is immutable :
		   cannot be modified
		   3. String represents the sequences of characters:
		   each character in the String, has index number starts from 0
		   String str ="Cybertek";
		   index num:   01234567
		   
		   length : 8
		   highest index num: length() -1
		   		 */
		
		Scanner input = new Scanner (System.in);
		
		String str1 = "Hello Javengers";
		String str2 = "Hello Javengers";
		boolean R1 = str1 == str2;// true
		System.out.println(R1);
		
		String str3 = new String("Hello Javengers");
		String str4 = new String("Hello Javengers"); //false
		boolean R2= str3 == str4;
		System.out.println(R2);
		
		boolean R3 = str1 == str3;
		System.out.println(R3); // false ( two different memory location)
		
		/*
		 Methods:
		 1.concat, length, charAt, toUpperCase, toLowerCase
		 
		 concat (str) : it takes string, and combines the two strings it
		 and it returns it as new String Value
		 */
		String a = "Cybertek";
		a.concat("School"); // "Cybertek School
		System.out.println(a);
		a = a.concat(" School"); // a = "Cybertek School"
		
		System.out.println(a);
		
		String A = "hello", B = "hello "; // cuz of space (after hello)
		System.out.println(A==B); // false
		
		String C = "Hello", D = "hello"; // capital letter
		System.out.println(C==D); // false, case sensitivity

		
		/*
		 length(); it returns the total number of characters as an int value
		 
		 */
		
		String longname = "IBROHIM";
		int num = longname.length();
		System.out.println(num);
		/*
		 charAt(indexNum): it returns the character of the index number
		 as a char value
		 */
		String name1 = "Muhtar";
		//index:       012345
		char ch = name1.charAt(5);
		System.out.println(ch);//r, index 5 is r
		
		/*
		 toUpperCase(): converts the String value to Upper case, and returns
		 it as New String Value
		 */
		
		String name2 = "cybertek";
		name2.toUpperCase();
		System.out.println(name2);
		
		name2 = name2.toUpperCase(); //CYBERTEK
		System.out.println(name2);
		
		String name3 = "IBROHIM";
		name3.toLowerCase();
		System.out.println(name3);
		
		name3 = name3.toLowerCase(); // ibrohim
		System.out.println(name3);
		
		/*
		 trim(); it's used for removing the unsued spaces
		 returns a New String Value
		 */
		
		String s1 ="              hello";
		s1.trim();
		System.out.println(s1);
		s1 = s1.trim();
		System.out.println(s1);
		
		String s2 = "Cybertek       School";
		s2 = s2.trim();
		System.out.println(s2);
		
		String s3 = "     ";
		s3 = s3.trim();
		System.out.println(s3);
		
		String s4 = "         Cybertek     School";
		s4= s4.trim();
		 System.out.println(s4);
		 
		 /*
		  substring(beginning index);
		  it created sub value of the String from the beginning index
		  till the last index
		  returns it as a New String Value
		  */
		 String Str = "Cybertek School";
		 //            0123456789
		 
		 Str = Str.substring(9); //School
		 System.out.println(Str);
		 
		 String Address = "Mclean VA 22000";
		 //                0123456789...
		 String zipcode = Address.substring(10);
		 System.out.println(zipcode);
		 
		 /*
		  substring(beginning index , ending index);
		  it creates the sub value of the String from the 
		  beginning index till ending index (endinf index num
		  will be  excluded) then retuns it as a New String Value
		  
		  */
		 String Name = "Hello Cybertek School";
		 //             0123456789........
		  Name = Name.substring(6, 14); // "Cybertek"
		     System.out.println(Name);
		     
		     String fullName = "Cybertek School Batch12";
		     //                 0123456789
		     String middleName = fullName.substring(9,14); //School
		     System.out.println(middleName);
		 
		     
		 
		
	}

}
