package day30_WrapperClass_Array_List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> nameList = new ArrayList<>();
	
	// add methods : 
	            nameList.add("Homayra");
	            nameList.add("Apple");
	            System.out.println(nameList);
	
	  Scanner scan = new Scanner (System.in);
	
	  // create an ArrayList called studentNames
	  // create scanner object scan
	
	  ArrayList<String> studentNames = new ArrayList<>();
	  
	  while (true) {
		  
	  
	  System.out.println("Please enter names");
	  String name = scan.nextLine();
	  studentNames.add(name);
	   System.out.println("Do you want to add another name?");
	   String answer = scan.nextLine().toLowerCase();
	   
	   if (!(answer.equals("yes")|| answer.equals("no"))) {
		   System.out.println("Invalid");
		   break;
	   }
		   
	   
	   if (answer.equals("no")) {
		   break;
	   }
	
	
	  }
	
	  System.out.println(studentNames);
	
	
	
	
	
	

}
}