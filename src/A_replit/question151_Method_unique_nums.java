package A_replit;

import java.util.Scanner;

public class question151_Method_unique_nums {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println();
		int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    
		//WRITE YOUR CODE HERE
		  for (int i = 0; i < nums.length; i++) {
			   int cur = nums[i];
			   boolean unique = true;
			   for (int j = 0; j<nums.length; j++){
			     if(nums[j] == cur && i != j){
			       unique = false;
			       break;
			     }
			   }
			   if (unique) {
			     System.out.println(cur);
			   }
			 }
	     
	           
	     
	   
	       
	       
	    	
	    
		
		
	}

}
