package day48_MethodOverRiding;



class Credentials {
	
	final private String UserName="Cybertek";
	final private String PassWord = "12321";
	
	public String getUserName () {
		return UserName;
	}
	
	
	
	/*
	public void  setUserName (String UserName) {
		this.UserName=UserName;
		//final variables cannot be re-assigned
	}
	*/
	
}


class Holly {
	
	final public void printName() {
		System.out.println("Erhan");
	}
	
}







public class FinalKeyword extends Holly {
	/*
	@Override
	public void printName() {
		System.out.println("Madina");
		
		
	}
	*/
	final int AGE=20;
	
	public static void main(String[] args) {
		
		
		
		final String SSN = "123456";
		//SSN = "654321"; // final variables are constant and cannot be reassigned 
		System.out.println(SSN);
		
		final String DateOfBirth;
		                 
		                       
		//System.out.println(DateOfBirth); we must assign it immediatly
		
		FinalKeyword obj = new FinalKeyword();
	     System.out.println(obj.AGE);
		
		
		
	}
	
	final public static void add (int a, int b) {
		System.out.println(a+b);
	}

	
	final public static double add( double x, double y) {
		
		return x+y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
