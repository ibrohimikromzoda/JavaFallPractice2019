package Assignments;

import java.util.Scanner;

public class Middle_Character {
	public static void main(String[] args) {
		
		
		
Scanner scan = new Scanner (System.in);
		
		int a, b;
		String word;
		
		System.out.println("Enter a word:");
		word = scan.nextLine();
		
		if(word.length()%2 == 0) {
			a = (word.length())/2;
			System.out.println(word.substring(a-1, a+1));
		}else {
			b = word.length()/2;
			System.out.println(word.substring(b, b+1));
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
