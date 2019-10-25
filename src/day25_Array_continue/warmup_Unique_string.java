package day25_Array_continue;

public class warmup_Unique_string {
public static void main(String[] args) {
	
	
	/*
    
    2. Write a program that can print out the unique values from  String Array
    
     */
    
        
        String[] arr = { "A", "A", "A" , "A", "B", "C", "C", "d", "c"};
         // index:        0     1    2    3    4
        
        
    for(int j = 0; j < arr.length; j++) {
            
            int count = 0;  
            for(int i=0; i < arr.length; i++) {
                if( arr[i].equals( arr[j] )  ) {
                    count++;
                }
            }
            
            if(count == 1) {
                System.out.println( arr[j] );
            }
            
        }
        
    
       
	
}
}
