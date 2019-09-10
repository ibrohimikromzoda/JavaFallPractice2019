package day12_swtich_statement;

public class SwtichStatement {
public static void main(String[] args) {
	
	/*
	 Swtich statement does the similiar thing like multi - brach if statement
	 
	 swtich (Expression) {
	 case CaseValue1 :
	             statements1
	             statements2
	             break;
	             
	             case CaseValue1 :
	             statements1
	             statements2
	             break;
	             
	             default ; 
	             statement ;
	             
	             we can have as many cases as we want in switch statement
	             we can only have 1 default section in a switch statement
	             break : closing statement => exist the switch statement
	             
	             if there no break in switch :
	             code will continue to run until exist the switch statement
	             
	             case order does not matter,
	             
	            after break statement we should not give any extra statement
	 
	 }
	 */
	
	
	int score = 2;
	if (score ==1) {
		System.out.println("1"); // MUST give boolean expression
	} else if (score==2) {
		System.out.println("2");
	} else {
		System.out.println("Invalid");
	}
	
	
	
	switch (score) { // MUST give an expression : data
	case 1:
		System.out.println("1");
		break;
		
	case 2:
		System.out.println("2");
		break;
		default:
			System.out.println("Invalid");
			break;
	}
	
	
	String str = "Java";
	switch (str) {
	
	
	case "C#":
		System.out.println("C# programming language");
		break;
		// System.out.println("C# programming language"); // case was closed
		
	case "Python":
		System.out.println("Python programming language");
		
	default : // else
		System.out.println("Invalid");
		
	}
		
		char grade = 'A';
		switch (grade) {
		
		case 'B':
			System.out.println("Passed with B");
			
		case 'C':
			System.out.println("Passed with A");
			
		default :
			System.out.println("Failed");
			
			// switch statement only exit when there is break in statement
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
}
