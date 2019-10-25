package day14_Scanner;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		
		/*
		 if (condition) ==> (Condition)?
		 else           ==>   :
		 else if(conditon) ==> : (Condition)?
		 
		 In ternary body we can only give a single value
		 Ternary MUST be initialized to a variable, Must return a value.
		 or printed out , because it returns a value
		 
		 () is not required in ternary
		 total number of ? and : has to be equal
		 
		 */
		
		int num = 0;
		
		
		if (false) {
			num = 100;
		
		} else 
			num = 50;
		
		 
		int n = (false) ? 100 : 50; // ternary returns a value
		int y = false ? 100 :50;
		
		
		System.out.println(num); // 50
		System.out.println(n); //50
		System.out.println(y); // 50
		
		
		String Schoolname ="";
		boolean Batch12 = true;
		
		if (Batch12) {
			Schoolname = "Cybertek";
		} else {
			Schoolname = "Invalid";
			}
		
		System.out.println (Batch12 ? "Cybertek" : "Invalid");
		String BestSchool = Batch12 ? "Cybertek" : "Invalid";
		System.out.println(BestSchool);
		
		 double d = 10;
         if(true) {
             d= 10.5;
         }
 
     double z = true ? 10.5 : 0;
     // in ternary, total number of ? and :  has to be equal
 
 
     double interestRate = 0;
     boolean GoodCredit = true;
 
     interestRate = GoodCredit == true ? 0.5 : 0.9 ;
     System.out.println(interestRate);
     /*
     
       char FinalGrade = 'A';
       String Group = "";
       
       
        Group =	FinalGrade == 'A'  ? "Early Bird" : FinalGrade == 'B' ?  "Group 1" 
        		: "Afte Group 1";
				System.out.println(Group);
		*/
     char FinalGrade = 'C';
     String Group = "";
     
		Group = FinalGrade == 'A' ? "Early Birds" 
				: FinalGrade == 'B' ? "Group 1"
                  : FinalGrade == 'C' ? "Group 2"			
		           : "After Group 2" ;
		System.out.println(Group);
		
		
		int score =80;
        char Finals =' ';
        
        if(score >= 90 && score <=100)
                Finals ='A';
        else if(score >= 80 && score <= 89)
                Finals = 'B';
        else if(score >=70 && score <= 79)
                Finals = 'C';
        else if(score>= 60 && score <= 69)
                Finals ='D';
        else if(score>=0 && score <= 59)
                Finals = 'F';
        else
            Finals = ' '; 
        
        
    Finals = (score >= 90 && score <=100) ? 'A'
               :(score >= 80 && score <= 89)? 'B'
                 :(score >=70 && score <= 79)? 'C'
                    :(score >=60 && score <= 69) ? 'D'
                      : (score>=0 && score <= 59) ? 'F'
                              : ' ';
		
		
		int n1 = 100, n2 = 300, n3 = 400;
		
		int max = (n1>n2 && n1>2) ? n1
				: (n2>n1 && n2 >n3) ? n2
				: n3;
		System.out.println(max);
		
		
		
		
		System.out.println("enter ur digits");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int imax;
		
		imax = (num1>num2) ? num1 
				: (num2 > num1) ? num2 : num2;
		System.out.println(imax);
		
		System.out.println("Enter number:");
		int x = input.nextInt();
	  int nums = input.nextInt();
	   int max1;
	   
	   
		
		 max1 = (x > nums) ? x
		 : (nums > x) ? nums : nums ;
		 System.out.println (max1);
	  
		
		
		
			
		
		
		
		
		
		

		
		
	}

	
}
