package Assignments;

import java.util.Scanner;

public class Unique_characters {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		String word = "mama";
		String result = "";	
		
		
		for (int i = 0; i < word.length() - 1; i++) {
			if (result.contains(word.substring(i, i + 1))) {
				result += word.substring(i, i + 1);
				System.out.println(result);
			}
		}
		System.out.println(result+ " ");
		
		
		
		
	}

}
