package A_replit;

import java.util.Arrays;
import java.util.Scanner;

public class question118_reverse_array {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println();
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    
		    for(int i =0; i <  nums.length/2;  i++) {
		    	int temp = nums[i];
	            nums[i] = nums[nums.length-(i+1)];
	            nums[nums.length-(i+1)]= temp;
	    }
	    
	  
	   System.out.println(Arrays.toString(nums));
		    
		
	}

}
