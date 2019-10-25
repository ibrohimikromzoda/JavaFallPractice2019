package day36_JavaReview;

public class ConstructorReview {
	
	 public ConstructorReview() {
	        
	        System.out.println("default constructor");
	    }
	 
	
	    
	    public ConstructorReview(int a) {
	        
	        System.out.println("Constructor with argument int: "+a);
	        
	    }
	   
	    
	    
	    public static void main(String[] args) {
	        
	        
	    	ConstructorReview obj = new ConstructorReview(); 
	        
	    //  ConstructorsReveiw obj2 = new ConstructorsReveiw("Batch 12"); 
	                            // the constructor with arg of String is not exist
	        
	    	ConstructorReview obj2 = new ConstructorReview(10); 
	    	
	    	
	    	
	        
	        
	    }


}
