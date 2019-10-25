package day23_Arrays;

import java.util.Scanner;

public class arrays_practice {
	public static void main(String[] args) {
		
		String student1 = "Ibrohim";
		String student2 = "Zuleyha";
		String student3 = "Elina"; /// .....
		
		String [] Allstudents = {"Ibrohim", "Zuleyha" , "Elina"};
		Allstudents [0] = "Maurfjon";
	//	Allstudents [3] = "Muhtar"; // Arrays size is fixed
		
		System.out.println(Allstudents.length); // 3
		
		// init the size only without giving value : 
		int [] array = new int [4]; // we havent given the values to the array
		// this array can contain four values, its length is 4
		
		System.out.println(array.length); // 4
		System.out.println(array[0]); // 0
		System.out.println(array [1]); // 0
		System.out.println(array[2]); // 0
		
		// give values to the array : 
		array [1] = 100;
		System.out.println(array[1]); // 100
		array[0] = 200;
		System.out.println(array[0]); // 200
		
		//array[5] = 500;
		// System.out.println(array[5]); // error out of bound .,, arrays size is fixed
		
		
		int [] array2;
	// 	System.out.println(array2[0]); // error....array size MUST be init.
		
		Scanner scan = new Scanner (System.in);
		int [] Inputs = new int [5]; // in this array we can store 10 elements, highest number of index is : 9
		
		for (int i = 0; i < Inputs.length; i++) {
		System.out.println("Enter a number");
		Inputs [i] = scan.nextInt();
		}
		
		for (int i = 0; i < Inputs.length; i++) {
			System.out.print(" "+Inputs[i]);
		}
		
		String [] AllStudentsNames = new String [358] ;
		AllStudentsNames = new String[1000]; // increased the array 
		// this new Keyword in array is used to give the size of the array only
		
		
		
		
		
		
		
		
		
		
	}

}
