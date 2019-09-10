package day15_Scanner;
import java.util.Scanner;
public class Scannerclass {
public static void main(String[] args) {
	// import all the classes from Java.util
	
	/*
	 Topic: 
	 
            1. Scanner class
            2. String class & String manipulations
Scanner class: used for reading user inputs
        
            Scanner class is presented in "java.util" package
            in order to use scanner, we MUST import it from its package:
                                    import java.util.Scanner;
                 // imports scanner class only from the java.util' package 
            the import statement MUSt be placed between class and pckage:
                            package A;
                                import java.util.Scanner;
                            publi class B{  }
            wild import: 
                            import java.util.*;
            // imports all the classes within "java.util" package
            Decleration of scanner class:
                        Scanner variableName = new Scanner(System.in)
                        variableName: can reference an object of scanner class
                        new Scanner(System.in): creates an object from the scanner class
            Scanner methods:
                        variableName.nextByte():
                                        returns the user input as byte value
                        variableName.nextShort():
                        returns the user input as short value
                        
                        variableName.IntNext();
                        returns the user input as int value
                        
                        variableName.nextLong(); 
                        returns the user input as long value
                        
                        variableName.nextBoolean();
                        returns the user input as float value
                                                
                          variableName.nextDouble);
                        returns the user input as double value                       
                        
                        variableName.nextLine();
                        returns the entire user input as String value                         
                        
                        
                        String class:
        
        1. String is an object
                    there are two ways to create object from String class:
                                1. String literals:
                                                String str = "Cybertek";
                                2. by using "new" keyword:
                                    String str = new String("Cybertek")
                    when the String object is created by String literals, that object will be saved at String pool (String pool does not take duplicates)
                    when the String object is created by using "new" keyword. the object will be saved at java heap memory (not within the String pool)
                    heap memory : the place where all the objects are store at
                    String pool : located in heap memory, stores all string literals' objects 
                    every time when we use new keyword, compiler will create a new object in java Heap memory
                    
                    2. String object represents the sequences of characters : ==> "ABCADWAD"
                    each character in String  has its own index number stars from 0
                    
                    String str = "Cybertek"
                       index number : 01234567
                       
                    3.String is immutable : 
                    once you declare it you cannot modify it
                    
                    String methods :
                    charAt (indexnum)
                    

                        
      */
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the byte value");
	byte num = input.nextByte(); // returns the user input as byte
	
	System.out.println("Enter the short value");
	short num2 = input.nextShort(); // returns the user input as short
	
	System.out.println("Enter the value");
	          int num3= input.nextInt(); // returns the user input as int
	          
	          System.out.println("Enter a value");
	          long num4 = input.nextLong(); // returns the user input as long
	          
	          System.out.println("Enter a boolean value");
	          boolean result = input.nextBoolean(); // returns the user input as boolean
	          
	          System.out.println("Enter float value");
	          float num5 = input.nextFloat(); // returns the user input as float
	          
	          System.out.println("Enter double number");
	          double num6 = input.nextDouble(); //returns the user input as double
	          
	          System.out.println("Enter your first name");
	          String str = input.nextLine();
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
}
}
