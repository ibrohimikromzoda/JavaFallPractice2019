package A_replit;

import java.util.Scanner;

public class question100_Arrays_printing01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below. 
		//Create another loop for your solution!
		
	for (String each : arr) {
         System.out.print(each.substring(0,3) + "\n");
      }
			
		}
		
		    
				
			}
			
		
		
	


