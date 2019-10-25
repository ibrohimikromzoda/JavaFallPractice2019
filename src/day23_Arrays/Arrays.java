package day23_Arrays;

public class Arrays {
public static void main(String[] args) {
	
	/*
	  a variable that we can store multuple values
	 regular variable : int a = 10; can only have one value
	 
	 Arrays: 
	 int [] variableName = {10, 20, 30, 40};
	 dataType variableName
	 
	 each values (Elements) in an array have their own 
	 index numbers:
	 
	  int [] variableName = {10, 20, 30, 40, 50};
	  index num :    0   1   2   3   4
	  
	  to retrieve the data of the array:
	  VariableName [indexNumber of data] :
	  
	  VariableName[3] ==> 40
	  VariableName[0] ==> 10
	  
	  Array is immutable, and arays size is fixed
	  
	  Arrays size must be ini there are two ways we can init arrays size :
	  1.giving values : int [] a = {1,2,3};
	  2. giving the size only : 
	      int [] a = new int [lengthNumber]
   
	   
	   */
	 
	 /*
    Arrays:
    
    */
// int a = "a";
   
   int[] arr = { 1,  2 };
   
   String[] names = { "Nigar" ,"Sumeyya", "Madina", "Juline" } ;
   //                  0          1        2          3
   
   System.out.println(  names[0]  );
   System.out.println(  names[1]  );
   
   String str1 = names[2] ;
   String str2 = names[3] ;
   
   System.out.println( str1 );
   System.out.println( str2 );
   
   //  System.out.println(names[4]);
   
   double[] myArray = { 1, 2, 3, 4, 5, 8, 0,  2};
   // index:            0  1  2   3  4  5  6  7
   
   for(int i=0; i < 8; i++ ) {
       System.out.print(  myArray[i] +"  ");
   }
   System.out.println();
   
// length of Array:        
   String str="ABC";
       int A = str.length();
       System.out.println(A);  // 3
       
       
       
int[] Numbers = { 12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

       int B = Numbers.length;  // 14
           System.out.println(B);
           int HighestIndexNum = Numbers.length - 1;  // 13
           
       System.out.println( HighestIndexNum );
   
       for(int i=0; i < Numbers.length; i++ ) {
           int s1 =  Numbers[i];
           System.out.print( s1 +" " );
       }
       
       System.out.println();
       
   
       char[]  myChars1 = {'A','B','C','D'};
       int HighestIndexNum1 =  myChars1.length;
       System.out.println(HighestIndexNum1); // 4
       
       char[]  myChars2 = {'A','B','C','D'};
       int HighestIndexNum2 =  myChars2.length -1;
       System.out.println(HighestIndexNum2);  // 3
       
	
	
	
	
	
	
	
	
	
	
	
	
}
}
