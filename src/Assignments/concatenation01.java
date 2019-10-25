package Assignments;

import java.util.Scanner;

public class concatenation01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter two words");
		String word1 = input.next();
		String word2 = input.next();
		
		System.out.println(word1.concat(word2));
		
		
	}

}
