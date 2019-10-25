package A_replit;

import java.util.Scanner;

public class question149_Methods_add_to_array {

	public static void add_to_r(int[] arr, int n) {
		// create new array with one more position.
		int i;
		int[] new_r = new int[arr.length + 1];
		for (i = 0; i < new_r.length - 1; i++) {
			new_r[i] = arr[i];
			System.out.println(new_r[i]);
		}
		new_r[i] = n;
		System.out.println(new_r[i]);
	}

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println();
		int size = inp.nextInt(), n = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		add_to_r(arr, n);

	}

}
