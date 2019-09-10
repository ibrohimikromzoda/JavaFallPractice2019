package day09_review;

public class Review {
	
	/*
	 relational :
	 > : greater X=10 Y=9 : only return when x > y
	 >= : greater  than or equal   true : either greater or equal
	 < : less than   X=10 Y=9 : only return when y < x
	 <= : less than equal  true : either less or equal 
	 == : equal             x = 10, y = 10,  true :  x==y
	 != : not equal      x = 9,  x = 10,  true x != y
	 
	 
	 
	 logical operators :
	 && : true : if both condition are true
	 || : true : as long as one condition is true
	 
	 
 */
	
	public static void main(String[] args) {
		
		System.out.println('Z' > 'A'); // true (ASCII table ) 
		
		System.out.println('Z' >= 'A'); // true
		
		System.out.println('a' >= 'A'); // true
		
		System.out.println('a' < 'A'); // false
		
		char ch1 = 123;
		System.out.println(ch1);
		
		System.out.println('A' <= 'A'); // true
		System.out.println('A' <= 'a'); // true
		//                   65 <= 97 //  true
		
		System.out.println( false == false); // true
		
		System.out.println(!(false != true)); // false
		//                   !true  ==> false
		
		
		System.out.println(true == true && false !=true); // true
		//                  true         &&  true ==> true
		
		System.out.println(true != true  || false == true);
		//                    false      || false ==> false
		
		System.out.println( "Monday" == "Funday" || true == !false);
        //          false            ||    true  ==> true
		/*
		
		 
		byte x = 10; int y =10;
		System.out.println(x==y); // for primitives yes
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
