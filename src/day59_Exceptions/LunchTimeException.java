package day59_Exceptions;

public class LunchTimeException extends Exception {

	
	public LunchTimeException() {
		super("It's lunch time");
		System.out.println("Time to Stop the class, lets go home");
	}
}
