package day59_Exceptions;

public class NoBreakTimeException extends RuntimeException {
	
	public NoBreakTimeException() {
		
		super("Too much break have occured in java course");
		System.out.println("There is no break till we get job done");
	}

}
