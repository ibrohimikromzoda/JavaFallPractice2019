package Day04_variables2;

public class quiztests {

	public static void main(String[] args) {
		
		
		//System.out.println(bNum); //  java applications are executed from top to bottom
		byte bNum = 127; // byte range  : -128 to 127
		
	//	byte bNum2 = 126.5; // byte only takes whole numbers
		
	//	short sNum2 = 1000;
	//	short sNum = 126.5; // short only takes whole numbers
		
		//bNum = sNum2; //  short is greater than byte
		
	//	sNum2 = bNum; // sNum2 = 127;
	//	System.out.println(sNum2);
		
		//short = sNum3 = 127;
		// byte bNum5 = sNum3; // short > byte
		
	int intNum = 100;
	//int intNum2 = 100.5; // int takes whole numbers only
	
	System.out.println(intNum); // 100
		
		// byte ByteNum = intNum; // int > byte
	// 	short ShortNum = intNum; // int > short
	
	short shortNum2 = 105;
	intNum = shortNum2; // intNum = 105
	
	System.out.println(intNum); // 105
	
	long longNum = 100l;
	long longNum2 = 100L;
	
	// byte byteNum3 = longNum;
	// short shortNum3 = 1000l;
   //  int IntNum3 = 100L;        long > int , byte, short
	
	byte a = 10;
	int b = 30;
	short c = 40;
	
	long longnumber = a;
	long longnumber2 = b;
	long longnumber3 = c;
	
	// float : 
	
	float floatnum = 10.5f;
	float floatnum2 = 20.5F;
	
	short a1 = 10;
	byte b1 = 20;
	short c1 = 30;
	int d1 = 40;
	
	float floats1 = a1;
	float floats2 = b1;
	float floats3 = c1;
	float floats4 = d1;
	
	System.out.println(floats1); //10.0;
	
	// double : takes all the whole and decimal numbers
	
	double doublenum1 = 10L; //long is smaller than double
	double doublenum2 = 10.5F;
	
	
	// boolean : 
	boolean result = true;
	boolean result2 = false;
	
	boolean  result3 = 9 >10;
	System.out.println(result3);
	
	// char : takes character , char values MUST be declared within single quote
	
	char character1 = 'A';
	System.out.println(character1); // character : A
	
	// char character2 = A;
	// char character3 = 'AA'; only a single character can be declared.
	
	// all the characters have representives number;
	
	char charvalue = 98;
	System.out.println(charvalue); // gives character
	
	int num3 = 'B';
	System.out.println(num3); // 66
	
	float fnum = 'B';
	System.out.println(fnum); //66.0
	
	byte bvalue = 'B';
	System.out.println(bvalue); // 66
	
	// float :
	
	 float fnum2 = 5.5F; // 5.5
	 float fnum3 = 5;   // 5.0
	 
	 
	 char specialchar = 55000;
	 System.out.println(specialchar);
	 
	 // practices :
	  
	 /*
	  8, 9, #, @, 8,5, 5,5F;
	  128, 40000, 9>10, true, false
	  
	 */
	  //8 :
	 
	 byte Bnum = 8; short snum= 8; int inum = 8;
	 long lnum = 8; float Fnum = 8; double dnum = 8;
	 char character = '8';
	 
	 System.out.println(Bnum);
	 System.out.println(snum);
	 System.out.println(inum);
	 System.out.println(lnum);
	 System.out.println(Fnum);
	 System.out.println(dnum);
	 System.out.println(character);
	 
	 
	 // # & @ :
	 char character2 = '#';
	 char character3 = '&';
	 char character4 = '@';
	 
	
	
	
	
	
	
	
	
	
	
		
	}
}
