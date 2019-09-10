package day05_quizes;

public class Concatenation {
	
	/*
	 String : represents the sequences of characters, used for storing text.
	 
	 String values are surrendered by a double quote
	 
	 Concatenation : combining, linking things together. ==> creates a string value achived
	 by using + operator we can concat any value to String
	 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
	 String str = "any text goes here "; 
	 System.out.println(str);
	 
	 String str2 = "1";
	 System.out.println(str2);
	 
	 System.out.println("Hello World");
	 
	 String Hello = "Hello World";
	 System.out.println(Hello);
	 
	 
	 String myName = "Cybertek" +" School";
	 System.out.println(myName);
	 
	 String Year = "This is " + "2019";
	 System.out.println(Year);
		
	
	 // example :
	 
	 String name = "Ibrohim";
	 
	 System.out.println("My name is " + name);
	 
	 
	 /*
	  cucumber is 3 $
	  tomato is 3 $
	  
	  */
	 
	 int cucumber = 3; int tomato = 5;
	 System.out.println("Cucumber is $"+cucumber); // cucumber is $3
	 System.out.println("Tomato is $" + tomato);  // tomato is $5
	 
	 
	 String newstr = "100"+10;
	 System.out.println(newstr);
	 
	 System.out.println(1+2+3); //6
	 System.out.println("1"+2+3); //"12"+3 ==> 123
	 
	//  System.out.println("1"+1-3); // "11" - 3 
	 System.out.println("Batch12"+1+2); // "Batch121" + 2 => batch1212 
	 
	 System.out.println(2-1+1+"4"); // 1+1+"4" = 2+"4"; => 24;
	 
	 System.out.println("Batch12"+ (1+2)); // "Batch12" + 3 ==> batch 123
	 
	 System.out.println(1+"123"+4+5); // "1123" +4+5 => 112345
	 
	 System.out.println("123"+ (4+5)); //1239
	 
	 System.out.println(1+("1"+2)); // 112
	                    // 1 +"12" => 112
	 
	 
	 System.out.println(1+ "123"+ (4+5));
	         //          "1123" + 9 ==> 11239
	 
	 System.out.println(4+3- (9+3));
	 
	        //         7-12 = -5
	 
	 System.out.println((1+2)+"3");
	 
	 // System.out.println((1+2)- "3");
	               //        3 - "3"  doesnt compile if its negative
	 
	 String BookName = "I like the book called \"'  Game of Thrones\'";
	 System.out.println(BookName);
	 
	 String MyInfo = "My name is : \n\tCybertek";
	 System.out.println(MyInfo);
	 
	 System.out.println('3'+3);
	 
	  //                51 + 3 ==> 54  // ASCII TABLE
	 
	 
	 System.out.println("3"+'3'); // if we concat char to string, char is concated string.
	 
	                   // "3"+3
	 
	 System.out.println(12+'3'); // if we concat char to number, 
	 //  representive number  will be concated 
	 
	 System.out.println(2+3); // 5
	 System.out.println("2"+3); //23
	 
	 System.out.println('7'+3);
	 //                 55+3
	 
	 System.out.println('7'+"3"); // 73
	 
	 System.out.println('7'+9); // 64
	 
	 
	 
	 
	 
	 
		
	}

}
