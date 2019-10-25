package A_replit;

import java.util.Scanner;

public class question108_Arrays_split_email {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		String email = input.nextLine();

		if (email.contains("@") && !email.replaceFirst("@", "").contains("@")) {
			String[] arr = email.split("@");
			System.out.println("Email id: " + arr[0]);
			System.out.println("Email domain: " + arr[1]);
		} else {
			System.out.println("invalid email");
		}

	}

}
