package A_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class question192_Methods_with_arraylist_timestwo {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>
		(Arrays.asList(1,2,3,4));
		timesTwo(nums);
		
		
	}
	
	public static void timesTwo(ArrayList<Integer> nums) {
		for (int each : nums) {
			System.out.println(each*2);
		}
		
		
		
	}

}
