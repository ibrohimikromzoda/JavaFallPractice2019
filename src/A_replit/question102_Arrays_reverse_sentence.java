package A_replit;

import java.util.Scanner;

public class question102_Arrays_reverse_sentence {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        String sentence =  input.nextLine();
        
       
        String [] arr= sentence.split(" "); 
        String separator=" "; 
        for (int i = arr.length-1; i > 0 ; i--) { 
            System.out.println(arr[i]);
            
        }
        System.out.print(arr[0]); 
		
	}

}
