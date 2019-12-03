package day59_Exceptions;

public class TestCustomException {
	
	public static void main(String[] args) throws LunchTimeException {
		
	  //throw new NoBreakTimeException();
		//throw new RuntimeException("Thereis arun time exception");
		
		
		boolean StudentAskedForBreak = true;
		
		if (StudentAskedForBreak) {
			throw new NoBreakTimeException();
		} else {
			System.out.println("Continue the class");
		}
		
		try {
		throw new NoBreakTimeException();
	} catch (NoBreakTimeException e ) {
		System.out.println("It has to be a break time, No more java");
	}
		
		//throw new Exception("123123");
		
		
		throw new LunchTimeException();

	}
	
	
	
	
}
