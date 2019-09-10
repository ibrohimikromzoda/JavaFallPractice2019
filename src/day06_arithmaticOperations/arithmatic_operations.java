package day06_arithmaticOperations;

public class arithmatic_operations {
	public static void main(String[] args) {
		
		/*
		 + : addition, adds two numbers together
		 - : subtraction, subtracts a number
		 * : multiplication , multiplies
		 / : devision , devides;
		  % : reminder, returns the remainder from the division
		  
		  
	*/
		int a = 100;
		int b = a - 400; // -300;
		System.out.println(b);
		
		int c = a +b; // 100 + - 300 = -200
		System.out.println(c);
		
		
		int x = 3, y =5, z = x*y;
		System.out.println(z); //15
		
		double length = 100, width = 10, area = length*width;
		System.out.println(area);
		
		System.out.println(3 + 5 + 4 - 2); //10
		
		//double resultnum = 9/0; // denominator cannot be zero
		//System.out.println(resultnum);
		
		double number1 = 10.0/3;
		
		double number2 = 10/3; // 3.0
		
		
		System.out.println(number1);
		
		int output = 12+6/3;
		System.out.println(output);
		
		System.out.println(5+2*4); // 13
		System.out.println(5+4*4); // 13
		
		System.out.println(10/2-3);  //2
		System.out.println(8+12 *2); //32
		System.out.println();
		// % :  returns the remainder
        /*
                10/3   ==> 3 with rmainder of 1
                12/5   ==> 2 with remainder : 12  - 5*2  = 2 
                
                20/3  ==> 6   :   20 - 6 * 3 =2
                20394 / 3600 ==> 5665 :  20394 - 5665 * 3600
               
         */
        
        int result1 = 10%3;  // 1
        
        System.out.println( result1 );
        
        System.out.println( 12%5 );  //2
        
        
       
        
        /*
         
         20, 45, 65, 67 , 68 
          even: can be devided by 2 without a remainder
          odd: devided by 2, will have remainder
         
         
         */
        
        int Number20 =  20 % 2;  // even
        int Number45 = 45 % 2;   // odd
        int Number65 = 65 % 2;   // odd   ( 65 -  32 * 2  ) = 1
        
        System.out.println( Number65 );
        
        
        System.out.println( 4 + 17 % 2 -1 );  // 4
        //                  4 + 1 -1  = 4 
        
        
        System.out.println( 6 - 3*2 + 7 -1);
        
        System.out.println(  6 * 3 / 2);   // 9
        
    /*
      first come first serve, except for VIP
            VIP: % , / , *
            
            highest : () ,  % / *
      
     */
        
        System.out.println(  1 + 2 - 2 + 3  );  //4 
        System.out.println(  1 + 2 -  ( 2 + 3 )  );  //4
        //                      1+2 -  5  = -2
        
        
        System.out.println( 3 + 4 * 4 + 5 * (4 + 3)    );
        //                  3 + 4 * 4 + 5 * 7
        //                  3 + 16 + 35
        //                  19 + 35 = 54
        
        
        
//      %: 
        
        
       
        
        System.out.println(  10 % 4 );
        //   10/4 ==> 2 with remainder of  ( 10 - 2*4 ) =2
        
        
        System.out.println(  4 + 17  %  2 - 1 );
        //                   4 + 1 -1  = 4
        
        double percentage = 10/1000; // 10% 0.1
        
        
        
		
		
		
		
		
		
		
		
		
		
	}

}
