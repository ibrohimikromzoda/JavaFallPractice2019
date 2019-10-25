package day24_JavaRecap;

import java.util.Scanner;

public class Arrays_practice {
	public static void main(String[] args) {
		
		/*
		 ask user to enter give numbers, then find the sum of those five numbers;
		 */
		
		int [] numbers = new int[5];
		
		Scanner scan = new Scanner (System.in);
		
		for (int i =0; i <numbers.length; i++) {
			System.out.println("Enter a number");
			numbers[i]=scan.nextInt();
			
			
		}
		int sum = 0;
		for (int i =0; i <numbers.length; i++) {
			System.out.print(numbers[i]+" ");
			sum +=numbers[i];
		}
		System.out.println(sum);
		
		System.out.println();
		
		/*
		 find the longest name
		 */
		
		String [] names = {"Seyfo", "Asiya", "Myra", "Keteryna", "Daulet,", "Ibrohim Ikromzoda Mirzoali","pneumonoultramicroscopicsilicovolcanoconiosis"};
		
		String longestName ="";
		
		int max = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > max) {
				max = names[i].length();
				longestName = names[i];
			}
		}
		System.out.println(max);
		System.out.println(longestName);
		
		
		
	}

}
