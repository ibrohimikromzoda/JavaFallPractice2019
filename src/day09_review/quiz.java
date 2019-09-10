package day09_review;

public class quiz {
	
	public static void main(String[] args) {
		
		//quiz kahoot 1
		
		boolean a = !!!!!false;
		//           !!!!true
		//            !!! false
		//             !! true
		//              ! false
		  //              true
		System.out.println(a); // true
		System.out.println(!!true); // true
		
		// question 2
		boolean result = !false != ("Batch12" != "Best batch ever");
		//                 true   != true
		//                   false
	      System.out.println(result);
				
				
				// question03 
				int x = 100;
		double y = x+= 100/20; // x =105, y = 105
		 //      x=x+(100/20)  = 105
		//     y = 100 += 5; ==> 105
	   
		System.out.println(x);
		
		System.out.println(105.0 > 105); // false
		System.out.println(105.1 >105); // true
		
		
		// question 4
		
		boolean A = 128 > '9' || 128 == 127;
		             // true  ||    false
		System.out.println(A); // false
		
		// question 6 ;
		boolean stupidOperators = 10 >= 20 && 'a' > 'b';
		//       //               false  &&   false ==>    // false
		System.out.println(stupidOperators);
		
		// question 7
		
		int num1 = 9999999;
		int num2 = 10;
		
		System.out.println(num1*num2 /10 %num1);
		              //       9999999 % 99999999 = 0
		
		// question 9
		int z = 100;
		// System.out.println("z > 100 is :" +H); H is not defined before this line 
		boolean H = z >100; // false
		
		// question 10 
		System.out.println(5+7 + "8");
		
		//                 12+"8" = 128
		
		System.out.println("8"+5+7);
		//                 "85"+7 ==> 875
		System.out.println(5+7 +"8"+5+7);
		//                    12+"8"+5+7
		//                     "128"+5+7
		//                       12857
		
		System.out.println(5+7 +"8"+(5+7)); // 12812
		
		//question 11
		
		System.out.println(1+11+"3" == "123");
		//                    12+"3" == "123"
		//                      "123" == "123" ==> true
		
		// question 12
		
		int numA = 100;
	       numA+= 300;  //400
	       System.out.println(numA++ + " "+numA);
	       //                   400        401
	       
	       //question 13
	       
	       
	       int B = 100; // local variables must be initialized
	      //  int C = B++ + ++B +C + B-- - --B -B; // without initializing C is compile error
	       System.out.println(B);
		
	       // question 14
	       
	       System.out.println(( 10*2)/ (5*4) * (1000 / 10 %1000/10 %100)); // 0
	       //                        20/20 *1000 / 10 %100
		                          //     1000/10 % 100
	       //                       100% 100
	        //    
		
		
		
		
		
		
		
		
	}

}
