package replit;

import java.util.Scanner;

public class school_grades {
	public static void main(String[] args) {
		
	
	// School Grades
	 
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Welcome to the Grader!");
	System.out.println("Please enter subject name number 1 and score for this subject");
	String math = scan.next();
	double grade1 = scan.nextDouble();
	
	System.out.println("Please enter subject name number 2 and score for this subject");
	String biology = scan.next();
	double grade2 = scan.nextDouble();
	
	System.out.println("Please enter subject name number 3 and score for this subject");
	String english = scan.next();
	double grade3 = scan.nextDouble();
	
	System.out.println("Please enter subject name number 4 and score for this subject");
	String chemistry = scan.next();
	double grade4 = scan.nextDouble();
	
	System.out.println("Please enter subject name number 5 and score for this subject");
	String music = scan.next();
	double grade5 = scan.nextDouble();
	
	double average = (grade1+grade2+grade3+grade4)/4;
	System.out.println("Summary: "+math+"-"+grade1+", "+biology+"-"+grade2+", "+english+"-"+grade3+", "+chemistry+"-"+grade4+", "+music+"-"+grade5);
	System.out.println("Your average score is: "+average);
	System.out.println("Thank you for using Grader!");
	System.out.println("Goodbye!");
	
	

}
}