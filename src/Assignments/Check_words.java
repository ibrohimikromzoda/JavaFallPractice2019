package Assignments;

import java.util.Scanner;

public class Check_words {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		
		System.out.println("Enter 3 words:");
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		String word3 = input.nextLine();
		
		int a=word1.length();
		int b=word2.length();
		int c=word3.length();
		
		if(a==b && a==c) {
			System.out.println("All words are same length");
		}else if(a==b || a==c || c==b) {
			System.out.println("Not Same nor Different length");
		}else {
			System.out.println("All different length");
		}
		
		
			
			
		
		
		
	}
	}
