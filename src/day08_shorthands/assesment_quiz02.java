package day08_shorthands;

public class assesment_quiz02 {
public static void main(String[] args) {
	
// question01 
	int ivar = 100;
	double dvar = 200;
	float fvar = 300;
	
	// ivar = fvar; // float > int
    fvar = ivar; // !no compiles
    dvar = fvar; // !false . double > float
   // fvar = dvar; // !can . double > float
    dvar = ivar ; //   int < double
    dvar = ivar; //    double > int
    
    
    // question 2
	
    String str1 = "Result A"+1+2;
  //                 "Result A12"
    System.out.println(str1);
  //   String str2 = "Result A"+ 7 - 2;
   // System.out.println(str2);
    
    String str3 = "Result A"+7*2;
    //             "Result A" + 14
    //              "ResultA14";
    
    System.out.println(str3);
    
    String str4 = "Result A"+8%2;
    //            "Result A"+0
    //            "ResultA0" 
    System.out.println(str4);
 
    System.out.println("Result A"+(1+2));
    //                 "Result A3"
    
    System.out.println("Result A"+(1)+(2)); // Result A12
    
    // question 4 
    
    long L = 30L;
    long L2 = (byte)L; // !can't == can
    System.out.println(L2); // 30
    
    // question 5
    double J, K, P =10;
    System.out.println(P);
    
  //  J = K, // local variable MUST be initialized before use == !false
  //   K = P;
    
    System.out.println(9/0);
    
    //question 6
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
}
