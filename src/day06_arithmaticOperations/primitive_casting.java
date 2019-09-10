package day06_arithmaticOperations;

public class primitive_casting {
	
	public static void main(String[] args) {
		
		/*
		 casting : converting larger primitive to smaller size
		 
		 //implicit casting we cast only smaller primitives to larger primitivie
		  * explicit casting vice versa, we cast larger primitives to smaller primitives
		 
		 datatype variablename = (datatype) value
		 castings : explicit & implicit
		 
		 primitives : byte, short, int, long, float, double.
		 
		*/
		
		int a = 128;
		byte b= (byte)a; // explicit casting 
		System.out.println(b);
		
		double decimalnum = 10.5;
		float floatnum = (int) decimalnum; // double > float
		
       // floatnum = 10;
		
		System.out.println(floatnum);
		
		long longnum = 300L;
		//int  intnum = (int) longnum;
		int  intnum = (int) longnum;
		System.out.println(intnum);
		
		// implicit casting : 
		
		byte bytenum = 100;
		int intnum2 = bytenum;
		    // same with : 
		int intnum3 = (int) bytenum;
		
		short shortnum = 100;
		long longnum2 = shortnum;
		 // same with : 
		
		long longnum3 = (long) shortnum;
		
		// explicit casting practices :
		
		double LargestNumber = 100.8765; 
        
        byte ByteValue = (byte) LargestNumber;
        //                      100  
        
        float FloatValue = (float) LargestNumber;
        //                      100.8765F
        
        float FloatValue2 = (int) LargestNumber;
        float FloatValue3 = (byte) LargestNumber;  
        //                          100.0
        
        float FloatValue4 = (short) LargestNumber;
        float FloatValue5 = (long) LargestNumber;
        
        
        System.out.println(FloatValue);  // 100.8765
        
        float floatnum6 = 500.67F;
        
        int mynumber = (short) floatnum6;
                                // 500
        System.out.println(mynumber);
        
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
         // int num1 100, num2 = 200, num3 = 300;
        
        boolean result;
       // System.out.println(result); // local variables must be initialize
        
        char character1 = 'A';
        System.out.println(character1);
        
        boolean result1, 
                result2, 
                result3;
        
       // System.out.println(result1);
        
        
		
		
		
	}

}
