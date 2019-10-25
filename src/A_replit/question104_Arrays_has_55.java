package A_replit;

import java.util.Scanner;

public class question104_Arrays_has_55 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println();
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	    boolean result;
	     for (int i =0; i < nums.length-1; i++) {
	       if (nums[i]==5 && nums [i]==5) {
	         System.out.println (true);
	       break;
	       } else {
	         System.out.println (false);
	         
	       }
	     }
		
		
	}

}
