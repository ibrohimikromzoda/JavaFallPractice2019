package day10_ifstatement;

public class multi_brach_ifstatement {
public static void main(String[] args) {
	
	/*
	 
	 if-else  if-else :
	 if (condition1) {
	 // A ==> if condition is true
	  }
	  else if (condition2) {
	  // B ==> if condition is false and condition2 is true
	   }
	   { else {
	   // C ==> if condition 1 and condition2 are both false
	    }
	    
	    
	    
	    if statement by itself:
                if( condition ){
                    // some codes
                }
            codes within if block gets executed if the condition is true
        if & else statement: we use them when there are more than two possibilities
                if( condition ){
                        // A
                        //if block only gets executed if the condition is true
                } 
                else {
                    // B
                    // else block only gets executed if the condition is false
                }
            if condition true -> A
            if condition is false -> B
        multi-branch if statement: we use them when tehre are more than two possibilities
                if(condition1){
                        //A
                } else if(condition2){
                        //B
                }else{
                    // C
                }
            if condition1 is true ==>A
            if condition1 is false abd condition2 is true ==> B
            if condition1 and condtion2 both are false ==> C

	 
	*/
	
	
	
	if (false) {
		System.out.println("if block");
	}
	else if (false) {
		System.out.println("else if block");
	}
	else {
		System.out.println("else block");
	}
	
	/*
	 task 01:
	 90 <= grade ==> A
	 80 <= grade <90 ==> B
	 70 <== grade <80 ==> C
	 60 <== grade <70 ==> D
	 else ==> F
	 
	 */
	
	int grade = 100;
	
	if (grade >= 90) {
		System.out.println("You got A");
	}
	
	else if (grade <  90 &&  grade >= 80) {
		System.out.println("You got B");
	}
	
	else if (grade <  80 &&  grade >= 70) {
		System.out.println("You got C");
	}
	
	else if (grade <  70 &&  grade >= 60) {
		System.out.println("You got D");
	}
	else {
		System.out.println("You Failed F");
	}

	
	// task 02
	// write a program that :
  // 1. 0 -12 ==> good morning
  // 2. 12 -15 == > good afternoon
//  3. 15 - 23 ==> good night

     
 int hours = 12;
if (hours >=0 && hours < 12) {
	System.out.println("Good morning");
}
	else if (hours > 12 && hours <= 15) {
		System.out.println("Good afternoon");
	}
	else if (hours > 15 && hours <= 23) {
		System.out.println("Good night");
	}
	else {
		System.out.println("Noon");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
}
