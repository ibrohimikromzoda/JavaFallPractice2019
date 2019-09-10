package day07_Uninary_ShortHand;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		/*
		 + : positive
		 - : negative 
		 ++ : increment 
		 - - : decrement 
		 
		 for + & -
		 
		+ - ===> -
		- + ==> -
		- - ===> +
		+ + ===> +
		
		 
		 
		 */
		
		int a =10;
		int b = -10;
		System.out.println(b);
		
		int c = +b; // + (-10) ==> -10
		System.out.println(c);
		
		int d = -c; // - (-10) ==> 10
				System.out.println(d);
				
		int f = -(10);
		System.out.println(f);
		
		/* increment : increases the value by 1.
		  increment are : 
		  1  Pre increment : operator is placed before the variable
		      increses value by 1 immediatly
		
		 decrement : decreases the value by 1.
		*/
		
		int num1 = 100; // 100
		int num2 = ++num1; // ++ (101) = 102
		System.out.println(++num2); //  
		
		// post increment : operator is placed after the variable
		// post increment : use the current value , then increased by 1
		 int IntNum = 100;
		 System.out.println(IntNum++); // 100
		 System.out.println(IntNum); // 101
		
		 int IntNum2 = IntNum++; // 
		 //    IntNum2 = 101
		 System.out.println(IntNum2);
		 System.out.println(IntNum); // 102
		 
		 int x = 100;
		 int y = x++ - 1;
		 // y = 100 -1;
		 System.out.println(y);
		
		// decrement : decreses the value by 1
		 // pre - decrement  : operator is placed before the valye 
		 // decrement decreseas the value by 1  immediatly
		 int z= 100;
		z --;
		 System.out.println(z); // 99
		 
		 // post - decrement : operator is placed after the variable 
		 // it will pass the current value , then decreased by 1
		 
		 int Y = 95;
		 System.out.println(Y --); //95
		 System.out.println(Y); // 94
		 
		 int T = 25;
		 System.out.println(++T); //26
		 System.out.println(--T); //25
		 
		 int P = 50; // 49
		 P = --P+ P++ + P-- + P++;
		 // pre    post  post   post
		 // 49  +  49   +  50 + 49
		 // 98+50+49= 197
		 
		 System.out.println(P); ; //197
		
		 
		 short Snum = 4;
		 int R = Snum *4 - Snum--;
		 //        16  - 4 = 12
		 System.out.println(R);//12
		 System.out.println(Snum); //3
		 
		 
		 int W = 1; // 0
		 W = - W-- + W++ / -W -- * --W;
		//     post   post   post   pre
		 //    - 1  +  0   / - 1  * - 1
		 //    - 1 + 0 * - 1
		 //    - 1 + 0
		 //    - 1
		 System.out.println(W);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
