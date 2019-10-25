package A_replit;

import java.util.Scanner;

public class question95_Get_Sandwich {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println();
		String word = input.next();
	     int count = 0;
		   
		   for (int i =0; i < word.length()-4; i++) {
			   if (word.substring(i,i+5).equals("bread")) {
				   count++;
				  
			   }
			   
		   }
		   
		   
		   if (count >=2) {
			   word = word.substring(word.indexOf("bread")+5, word.lastIndexOf("bread"));
			   System.out.println(word);
		   }
		   else {
			   System.out.println("nothing");
		   }
		
		
		
	  
	   

	}
	}


