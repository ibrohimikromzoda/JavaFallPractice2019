package A_replit;

import java.util.Scanner;

public class question_80_online_book_merchant {
	public static void main(String[] args) {

		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if ((isPremiumCustomer) && (nbooksPurchased >= 5 && nbooksPurchased < 8)) {
			System.out.println(++freeBooks);
		} else if ((isPremiumCustomer) && (nbooksPurchased >= 8)) {
			System.out.println((++freeBooks) * 2);
		} else if (!(isPremiumCustomer) && (nbooksPurchased >= 7 && nbooksPurchased < 12)) {
			System.out.println(++freeBooks);
		} else if (!(isPremiumCustomer) && (nbooksPurchased >= 12)) {
			System.out.println((++freeBooks) * 2);
		} else {
			System.out.println(freeBooks);
		}

	}
}