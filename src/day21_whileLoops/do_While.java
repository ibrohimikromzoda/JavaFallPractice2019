package day21_whileLoops;

public class do_While {

	public static void main(String[] args) {

		/*
		 * do - while : do {
		 * 
		 * statements;
		 * 
		 * } while (condition);
		 * 
		 * compiler executes the do block first and then check the condition, if the
		 * condition is true then it keeps executes, other wise exit the loop.
		 * 
		 * do - while loop's body gets executed at least once, regardless of condition
		 * 
		 * while vs do while:
		 * 
		 * while loop never executes if condition if the condition is false.
		 * 
		 * do - while gets executed one time if the condition is false
		 * do while loop ==> Just do it at least once
		 * break: exits the switch statement and loop
        forcefully exits the loop 
		 */

		/*
		 * int x = 1; while (x <= 100) { if (x%2==0) { System.out.println(x+" "); //
		 * with WHILE } x++; }
		 */

		boolean A = false;

		while (A) {
			System.out.println("Hello");
		}

		do {
			System.out.println("Hello");
		} while (A);

		int x = 1;
		do {
			if (x % 2 == 0) {
				System.out.println(x + ""); // WITH DO WHILE
			}
			x++;
		} while (x <= 100);

		do {
			System.out.println("hello world");
			break;

			// System.out.println("hello Cybertek"); // it was already out of loop at line
			// 49
		} while (true);

	}

}
