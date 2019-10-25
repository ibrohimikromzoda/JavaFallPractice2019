package Day01_programming;

import java.util.Scanner;

public class Ibrohim {
 public static void main(String[] args) {
	
	 Scanner input = new Scanner (System.in);
	 
	 System.out.println();
	 String word = input.next();
	 
	 String rev ="";
	 
	 for (int i =word.length()-1; i >=0; i --) {
		 rev= rev+ word.substring(i, i+1);
			 
		 }
	 System.out.println(rev);
	 }
	 
}

