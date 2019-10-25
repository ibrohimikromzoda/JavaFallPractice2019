package A_replit;

import java.util.Scanner;

public class question103_arrays_reverse {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		String sentence = input.nextLine();
		String [] arr= sentence.split(" ");
       
       for (int i = arr.length-1; i > 0 ; i--) {
           System.out.print(arr[i]+" ");
       }
       System.out.print(arr[0]);
	    
		
	}
	
        
      
}
