package day19_ForLopp;

public class tasks {
	public static void main(String[] args) {
		
		  // task01
        
	    //  for(int i = 1; i <= 10; i++) {
	    //      System.out.println("the square of "+ i + " is: " + (i * i) );
	    //  }
	        
	        
	        // task02  Write a program that displays each even/odd number 
		// in popup between 1 and 32
	        for(int i = 1; i <= 32; i++) {
	            
	            if(i %2 == 0) {
	                System.out.print(i+" ");
	            }
	            
	        }
	        System.out.println();
	        
	        
	        // task03: odd numbers
	        for(int i = 1; i <= 32; i++) {
	            
	            if(i %2 == 1) {
	                System.out.print(i+" ");
	            } 
	            
	            }
	        
	        System.out.println();
	        
	        String str = "Java";
	        //            0123
	        //  "avaJ"
	        String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	        
	        String Reversed ="";
	        for(int i = str.length()-1 ; i >= 0; i--) {
	            Reversed += str.charAt(i);
	        }
	        
	        System.out.println(Reversed);
	    
	        
	        

}
}
