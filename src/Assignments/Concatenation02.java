package Assignments;

import java.util.Scanner;

public class Concatenation02 {
	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);

String word1,word2, allword="", letterOne,letterTwo;
int lastLetter;
boolean checkLetter;

System.out.println("Enter two words");
word1 = input.nextLine();
word2 = input.nextLine();
lastLetter = word1.length() -1;
letterOne = word1.substring(lastLetter);
letterTwo = word2.substring(0,1);
checkLetter= letterOne.equals(letterTwo);


if(checkLetter) {
	word2 = word2.substring(1);
}

allword=word1.concat(word2);

System.out.println(allword);
		
	}

}
