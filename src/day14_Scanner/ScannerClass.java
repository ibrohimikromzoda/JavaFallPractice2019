package day14_Scanner;
import java.util.Scanner;
public class ScannerClass {
public static void main(String[] args) {
	
	
	/* Scanner : its class that provides the methods to get user inputs
	// Scanner class presented in package "java.util" package
	// 
	// import java.util.Scanner; 
	// this imports Scanner class only from java.util package
	// import java.util.*; 
	*/ // this imports all  the class from Java.util package

    
      /*  Scanner input = new Scanner(System.in);  // decleration
        
        System.out.println("Enter a Byte Value 1");
            byte byteNum =  input.nextByte(); 
                // only allows user to enter byte value
            
    System.out.println("You have entered: "+byteNum);
    
    System.out.println("Enter another Byte Value");
        byte byteNum2 = input.nextByte();
        
        System.out.println("You have entered: "+byteNum2);
        
System.out.println("Addition is: "+ (byteNum +byteNum2) );
        
	
	
	Scanner input = new Scanner(System.in);
    System.out.println ("Enter 3 numbers");
     int intNum1 = input.nextInt();
     int intNum2 = input.nextInt();
     int intNum3 = input.nextInt();
     System.out.println ("Sum of numbers "+(intNum1+intNum2+intNum3));
     
	
Scanner s = new Scanner(System.in);
    System.out.println("Enter your grade");
    
    int grade = s.nextInt();
    
    if (grade > 90) {
      System.out.println ("excellent");
    } else if (grade > 70 && grade < 90) {
      System.out.println ("good");
    } else if (grade > 60 && grade <70) {
      System.out.println ("pass"); 
    } else {
      System.out.println ("fail");
    }
      
      */
	
Scanner time = new Scanner(System.in);

  int intputSeconds, hours, minutes, seconds;
    
    System.out.println ("Enter seconds:");
    
    intputSeconds = time.nextInt();
    
    hours = intputSeconds / 3600;
    minutes = intputSeconds % 3600 /60;   
    seconds = intputSeconds % 60;
    
    
    System.out.println(hours +" hours, "+ minutes +" minutes, " +" and"+ seconds +" seconds ");
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
     
}

}