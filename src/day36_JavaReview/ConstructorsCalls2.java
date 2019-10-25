package day36_JavaReview;

public class ConstructorsCalls2 {
	
	 public ConstructorsCalls2() {
	        //   this();   // constructor cannot call it self
	        
	        this(true);  // constructor cannot contain it self
	        
	        System.out.println("default");
	        
	    }
	    
	    public ConstructorsCalls2(boolean a) {
	        // this( true );  // constructor cannot call it self
	        
	    //  this();
	    //  this(false);   // constructor cannot call it self
	        
	        System.out.println("boolean");
	        
	    }
	    
	    
	    public ConstructorsCalls2(String name) {
	    //  this("Hello");    constructor cannot call itself
	        
	        this('A');  // boolean   default   char
	        
	        // ConstructorCalls2();  // constructor canno be called by constructorName
	        System.out.println("String");     // String
	        
	    }
	    
	    public ConstructorsCalls2(char ch) {
	        this();  //  boolean  default
	    //  this("Hello");  // constructor cannot contain it self
	        System.out.println("Char");
	        
	    }
	    
	    
	    public static void main(String[] args) {
	        
	    	ConstructorsCalls2 obj = new ConstructorsCalls2( "Hello");
	        
	        
	    }
	

}
