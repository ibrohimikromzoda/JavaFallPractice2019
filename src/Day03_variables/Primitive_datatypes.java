package Day03_variables;

public class Primitive_datatypes {
	
	public static void main(String[] args) {
		
		/*
		 byte : we can assign integers that's no decimal (whole numbers) - 128 <= byte <= 127
		 short: we can only assign whole number. The range must be in -32768<= short <= 32767
		 int : you can only assign whole numbers. Must be in   -billion to - billion <= int <==  billion
		 long : we can only assign whole numbers, must be  in - 9223372036854775808 <= long <= 9223372036854775808
		 (at the end of value we can give l or L )
		 byte <short <int <long
		 */
		
	byte length= 3;
	System.out.println(length);
	
	byte width = 4;
	System.out.println(width);
	System.out.println(length*width);
	
	// byte length = 6; variables names is not unique.
	// byte 9num=100; variables names must start with a - z or A - Z
	// byte public = 10; //variable names cannot be java reserve words
	//byte myNum1 = -129; out byte' range
	// float : we can assign decimals. (must have f or F letter at the end)
	// double (used more often) : we can assign decimals.
	// float < double
	
	
	byte myNum2 = 127;
	
	// short num2 = &; we can only assign whole numbers
	
	// short num3 = 100000; out of range;
	
	int num4 = -1000000000;
	
	// 100,000,000
	
	int num5 = 1_000_000_000; // easier to read ( just like accounting
	
	long longNumber = 10l; 
	//int intNumber = 10l;
		
		byte byteNumber =10;
		short shortNumber = byteNumber;
		
		short shortNumber2 = 18;
		//byte byteNumber2 = shortNumber2; short is greater than byte
		
		int intNumber = -19876;
		long longnumber2 = intNumber; // long is greater than int
		// left side of the = has to be equal or greater than the right side (byte,short,int,long)
		
		short shortNumber3 = -30000;
		short shortnumber4 = shortNumber3;
		System.out.println(shortNumber3);
		
		//int exNum1 = 10.5;
		float exNum2 = 10.5F;
		float exNumb3 = 20.5f;
		
		double doubleNumber = 10.5;
		
		double doubleNumber2 = 30.5;
		//float floatNumber  = doubleNumber2; double datatype is larger than float data type.
		
		System.out.println("==============================");
		
		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("==============================");
		
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		
		double dNum = bNum;
		double dNum2 = sNum;
		double dNum3 = iNum;
		double dNum4 = lNum;
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
		
		
		
		
	}

}
