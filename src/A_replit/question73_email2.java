package A_replit;

import java.util.Scanner;

public class question73_email2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		String email = input.nextLine();

		String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf("_"));
		String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("_") + 2).toUpperCase()
				+ email.substring(email.indexOf("_") + 2, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
		String topLevelDomain = email.substring(email.indexOf(".") + 1);
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topLevelDomain);

	}

}
