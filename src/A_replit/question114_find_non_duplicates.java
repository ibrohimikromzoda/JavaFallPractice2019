package A_replit;

import java.util.Scanner;

public class question114_find_non_duplicates {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println();
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		
		for (int i = 0; i < nums.length; i++) {
			   int cur = nums[i];
			   boolean dub = true;
			   for (int in = 0; in<nums.length; in++){
			     if(nums[in] == cur && i != in){
			       dub = false;
			       break;
			     }
			   }
			   if (dub) {
			     System.out.println(cur);
			   }
			 }
			 
			 
			 int count = 0;
			   for ( int i = 0; i< nums.length; i++){
			     for ( int j = 0; j< nums.length; j++)
			     {
			       if( nums[i] == nums[j]){
			         count++;
			       }
			     }
			       if (count ==1){
			         System.out.print(nums[i]);
			       }
			       count =0;

			 
			   }
		
	    
	       

	}

}
