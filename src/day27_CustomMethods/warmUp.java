package day27_CustomMethods;

import java.util.Arrays;

public class warmUp {
public static void main(String[] args) {
	
	/*
    Warmup:
       1. create an int array called numbers that has length of 100
       2. assign 1~100 to the array' each indexes
       3. use for each loop to rpint out all the even numbers.
               MUst user continue statement
    */
	
	int [] nums;
	nums = new int [100];
	//   int i = 0;  i < 100; i ++  or this option
	for (int i = 1; i <= 100; i++) {
	/// nums [i] = i+1; or this option
		nums [i-1] = i; // each valie of "i"  will be assigned to the index of (i-1)
		// nums [0] = 1
		// nums [1] = 2
	}
	
	System.out.println(Arrays.toString(nums));
	
	for (int each : nums) {
		if (each%2!=0) {
			continue;
		}
		System.out.print(each+" ");
	}
	
}
}
