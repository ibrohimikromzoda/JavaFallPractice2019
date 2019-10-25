package Assignments;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		
	
	
	Scanner scan = new Scanner (System.in);

	System.out.println("Enter two words please: ");
	String word1 = scan.nextLine();
	String word2 = scan.nextLine();

	String result = "";
	result = word1.concat(word2).concat(word2).concat(word1);

	System.out.println(result);

}
}