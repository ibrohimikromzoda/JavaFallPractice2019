package day07_Uninary_ShortHand;

public class quiz {
public static void main(String[] args) {
	
	// question 1
	int a = 30;
	//int b = (long) a;
	int b = (byte) a;
	System.out.println(b); // 30
	
	
	// question 3
	
	System.out.print("Result A"+0+1);
	// "Result A0"+1
	//  " Result A01"
	
	System.out.print(";Result B"+(1)+(2));
	// "ResultB12
	System.out.println();
	
	// question 5 
	float floatnum = 100.98765432f;
	short shortnum = (byte) floatnum; // 100
	System.out.println(shortnum);
	
	
	// question 6
	
	// byte bnum =200; // byte's max capacity is 127
	
	int numa = 200;
	int numb = 2;
	System.out.println(numa+numb-numa*numb+numa/numb);
	
  //                   200 + 2  -  400 + 100
	  //                202 - 400 + 100
	//                -198 + 100 = -98
	
	
	// question 7
	System.out.println((3+2)*2/3%2);
	      //             5 * 2/3%2
	      //              10 / 3% 2
	   //                 3% 2   // (3 - (2*1) = 2)
	    //                 1
	
	// question 8 
	
	//int num1 = 9, num2 = 0, num3 = num1/num2;
// 	System.out.println(num3);
	
	long Lnum = 3_000L;
	double dnum = (float)Lnum; // narrowing 
	int Inum = (short) dnum; // int, byte, short
	System.out.println(Inum % 1000); // 0
	
	
	// question 10 
	
	double result1 = 10/3;
	System.out.println(result1); // 3.0
	
	// question 12 
	
	String str = "10.5"; // string of text
	// int num = str;;  // string is not premitive
	
	// question 13
	
	int I1 = 10;
	int I2 = 20;
	int I3 = 30;
	I1=I1%5; // 10 %5 = 0  I1
	I2 = I1%5; // 20 %5 = 0 I2 = 0
	I3 = I1*I2; // I3 = 0;
	
	System.out.println(I1+" \t"+ I2+"\t"+ I3);

	
	
	
	

	
	
	
	
}
}
