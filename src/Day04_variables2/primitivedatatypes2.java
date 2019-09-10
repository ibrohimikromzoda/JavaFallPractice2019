package Day04_variables2;

public class primitivedatatypes2 {
 public static void main(String[] args) {
	
/*
 Primitives : byte, short, int, long, float, double, boolean, char.
 
 	 boolean : takes only true or false results
 	 
 	 char : declared with in the single quote ' ' ; single character only.
 	  ' ' is a MUST when you give character as value.
 	 
 	 
 */
	 
	 boolean result = true;
	 boolean result2 = false;
	 boolean result3 = 9>3;
	 
	 System.out.println(result);
	 System.out.println(result2);
	 System.out.println(result3);
	 
	 // char : 
	 
	 char char1 = 'a';
	 System.out.println(char1);
	 
	 char char2 = '9';
	 char char3 = '#';
	 
	 
	 
	 // char with numbers
	 
	 char char4 = 67; // only time we use '' for char is when we are declaring single character
	 
	 // prints the character thats corresponding to 67 from ASCII table
	 
	 System.out.println(char4);
	 
	 char char5 = 'C'; // prints the character as it's
	 System.out.println(char5);
	 
	 char char6 = '{';
	 System.out.println(char6);   
	 
	                              // char : takes single characters or numbers/
                                   // all single characters MUST be declared within  single quote ' '.
	                              // char values came from ASCII table;
	                              // example ; char char 1 = 'a';
	                                //  char char 2 = 97; // from ASCII table the 97th character is a.
	                              // char1 and char2 both prints a ;
	  char char7 = 123;  
	 
	System.out.println(char7); // prints the character that has the number of 123 from ASCII table
	
	// initializing char to other primitives; byte, short, int ,long, float, double.
	 char mychar1 = 'b';
	 int myint = mychar1; // the number that represents b is initialized to the int
	 
	 System.out.println(myint); // 98
	 
	 
	// byte mybyte = mychar1; // char memory is 2 byte, bytes memory is 1 bytes.
	 byte mybyte2 = 'b'; // b's corresponding number is 98
	 System.out.println(mybyte2);
	 
	// short shortnum = mychar1; // char's memory is could be bigger than short, range is greater than short
	 short shortnum2 = 'b'; // b's corresponding number is 98 from ASCII talbe
	 
	 System.out.println(shortnum2);
	 
	 long longnum = mychar1; // long's memory is 8 bytes
	 long longnum2 = 'b'; // 98 
	 System.out.println(longnum);
	 
	 float floatnum = mychar1 ;
	 float floatnum2 = 'b';
	 System.out.println(floatnum2); // 98.0
	 
	 double doublenum = mychar1;
	 double doublenum2 = 'b';
	 System.out.println(doublenum2); // 98.0
	 
	                                  // java is case sensitive : A does not equal to a
	                                   // char value can be assigned to : byte, short, int, float, double.
	                                   // byte a = 'a';
	                                 // short b = 'b';
	                                 // int c = 'c';
	                                 // long d = 'd;
	                                 // float f = 'f' ;
	                                 // double e = 'e';
	 char mycharvalue = 36000;
	 System.out.println(mycharvalue);
	 
	
	 
	 
	 
	 
	 
}
}
