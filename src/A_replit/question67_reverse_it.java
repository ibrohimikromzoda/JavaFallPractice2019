package A_replit;

import java.util.Scanner;

public class question67_reverse_it {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter");
		String word = input.next();
		
		
		if (word.length() == 5) {
			for (int i = word.length()-1; i >= 0; i--) 
				System.out.print(word.substring(i, i + 1));
			
		} else if (word.length() < 5) {
			System.out.println("Too short!");
		} else {
			System.out.println("Too long!");
		}
			
		
    
		
			
			
		}
	   
        
        
}
	


