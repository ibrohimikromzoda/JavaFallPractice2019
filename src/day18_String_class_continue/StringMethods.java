package day18_String_class_continue;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		/*
		 indexOf (str): return the index number of the first
		 character in the given String as an int value
		 */
		
		String A1 = "Batch 12 is a great batch";
		
		int num = A1.indexOf("g");//17
		System.out.println(num);
		
		int num2= A1.indexOf("at "); //16 
		System.out.println(num2);
		
		String B1 = "today is tuesday, today we hace class in the afternoon";
		
		int n1 = B1.indexOf("ter"); //47
		System.out.println(n1);
		
		
		String Address = " 79025 Jones Branch Dr, Mclean, VA 22003 ";
		int begin = Address.indexOf(", ")+2;
		int end = Address.indexOf(", V");
		
		String cityName = Address.substring(begin, end);
		System.out.println(cityName);
		
		String email= "RandomEmails@gmail.com";
		int begin2 = email.indexOf("@")+1;
		int end2 = email.indexOf(".com");
		String emailType = email.substring(begin2, end2);
		System.out.println(emailType);
		
		/*
		 lastIndexOf() :returns the last occurred 
		 character index number as and Int Value
		 */
String str ="ABCDABCD";
        
        int n2 = str.indexOf("B");//1
        int n3 = str.lastIndexOf("B"); //5
        System.out.println(n2);
        System.out.println(n3);
        
        String myEmail ="Myemail.school@coldmail.edu";
        int Begin = myEmail.indexOf("@");
        int End = myEmail.lastIndexOf(".");
        
        String EmailType= myEmail.substring(Begin , End);
        System.out.println( EmailType );
		
		
		
	}

}
