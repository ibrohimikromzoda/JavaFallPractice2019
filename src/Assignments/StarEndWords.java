package Assignments;

import java.util.Scanner;

public class StarEndWords {
	
	public static void main(String[] args) {
		
		
		Scanner input  =  new  Scanner (System.in);
		String word1, word2, firstLetter= "", lastLetter="";
		int a, b;
		
		System.out.println("Enter two words with 5 letters each:");
		word1 = input.nextLine();
		word2 = input.nextLine();
		a= word1.length();
		b= word2.length();
		firstLetter = ""+word2.charAt(0);
		lastLetter =""+word1.charAt(4);
		
		if(a!=5 || b!=5) {
			System.out.println("Needs to be exactly 5 char length");
		}else if(firstLetter.equals(lastLetter)) {
			
			System.out.println(firstLetter);
			System.out.println(lastLetter);
			System.out.println("Fizz");
		}else {
			
			System.out.println("Buzz - did not match");
		}
			
		
		          
	}

	

}
