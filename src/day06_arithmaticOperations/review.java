package day06_arithmaticOperations;

public class review {

	public static void main(String[] args) {
		
		int num1 = 46;
		int num2= 90;
		int sum = num1+num2;
		System.out.println(+num1+"+"+num2+"="+sum);
		
		
		//F=9*C/5+32   from C to F
		
		 /*int myCelcius = 20;
	      float myFahrenheit = (myCelcius * 9) / 5 +32;
	      System.out.print("Fahrenheit = " +myFahrenheit);
	      
	      System.out.println();
	    */ 
		  /// From F to C
		
		int myfahrenheit = 66;
		int mycelcius = (myfahrenheit - 32 ) * 5 / 9;
		
		System.out.println("Celcius = "+mycelcius);
		
		
		
		float km = 1.609344f;
		
		int mile = 25;
		
		System.out.println("Kilometers = "+km*mile);
		
		
		float radius = 5.5f;
		
		 float perimeter = 2* radius;
		float area = radius * radius;
		System.out.println("Perimeter = "+perimeter);
		System.out.println("Area ="+area);
		
		float width = 4.5f;
		float height = 7.9f;
	    float area1 = width * height;
		System.out.println("The area of rectangle is = "+area1) ;
		
		
		int myint = 70;
		int myint1 = 85;
		int myint2 = 100;
		
		int average = (myint+myint1+myint2) / 3;
		System.out.println("The average number is  = "+average);
	
		int pies =10, people = 4;
		double piesperson;
		piesperson = pies/people;
		System.out.println(piesperson);
		
		

		
		
		
		
	}
}
