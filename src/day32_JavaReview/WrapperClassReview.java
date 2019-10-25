package day32_JavaReview;

public class WrapperClassReview {
	
	/* 
	    primitives                      Wrapper classes java.lang
	       byte                              Byte
	       short       auto-boxing           Short
	       int       ===========>            Integer
	       long                               Long
	       float           un-boxing           Float
	       double        <===========         Double
	       boolean                            Boolean
	        char                              Character
	 
	 
	        Wrapper class vs primitives :
	     default values : 
	       primitives  : byte, short, int, long ==> 0
	                     float, double ==> 0.0
	                     boolean ==> false
	                     char ==> space
	       All Wrapper class : null
	     2.  Wrapper class only accepts its own primitive values
	     3. wrapper classes have method, primitives don't
	     4. wrapper class takes object, primitives takes values
	     
	     
	     
	     methods : Max_values, Min_values, parse methods, valueof methods.
	                 max_value: returns the maximum value of the data type
	                 min_value : returns the minimum value of the data type
	                 parse method: converts String to primitives
	                 value of method: converting String to wrapper class
	       
	       Auto-boxing : assing the primitives to wrapper class
	       un-boxing : assing the wrapper class to primitives
	 
	 */
	  public static void main(String[] args) {
		  
		  int a = 10;
		  Integer b = 10; // Integer only accepts int primitves values
		  byte c = 20;
		  //Integer b2 = c;// Integer only accepts int primitves values
		  
		  long L = b; // Integer is within range of long
		  
		  boolean result = 9 > 0+1;
		  Boolean result2 = result; // auto - boxing
		  
		  boolean result3 = result2; // un- boxing
		  
		  boolean result4 = result2; // none
		  
		  boolean result5 = result3; // none
		  
		  /*
		   methods : 
		           max_value
		           min_value
		           parse method
		           value of methods
		   */
		
		  int max = Integer.MAX_VALUE;
//	      int max2 =  Double.MAX_VALUE; //  int != double
	        System.out.println(max -1);
	        
	        System.out.println( Double.MAX_VALUE ); 
	        System.out.println( Byte.MAX_VALUE );  // 127
	        
	        
	        byte min  = Byte.MIN_VALUE;  // -128
	        int min2 = Short.MIN_VALUE;  // 
	        System.out.println(min);
	        System.out.println(min2);
	        
	        
	        
	    //parse methods:    returns primitves, ignores the  the case sensitivity
	        short s1 = Short.parseShort("1234");
	        System.out.println(s1 +1 );
	        
	        double d1 = Double.parseDouble( "78.5"); //none
	        Double d2 = Double.parseDouble( "78.5"); //auto-boxing
	        
	        
	            boolean r1 = Boolean.parseBoolean("lunch") ; //none, 
	            System.out.println(  r1  );
	        
	    // Value of methods : retunrs wrapper class, ignores case sensitivity
	            
	         Integer num=Integer.valueOf("123"); // none
	         System.out.println(num);
	         
	         int num2 = Integer.valueOf("123"); // un-boxing
	         
	        byte num3 = Byte.valueOf("12");
	        
	      boolean R1 = Boolean.valueOf("True"); //un-boxing
	      System.out.println(R1);
	      
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	        
	}

}
