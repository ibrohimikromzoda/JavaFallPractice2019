package day24_JavaRecap;

public class arraysClass {
	
	public static void main(String[] args) {
		
		
		/*
		 Array decleration : 
		 1.DataType [] variableName = [value1,value2,value3,value4};
		 2.DataType variableName[] = [value1,value2,value3,value4};
		 Arrays does have index number, in order to
		  retrieve a value from an array: variableName [indexNum of Value]
		  
		  Arrays size is fixed, Arrays size MUST be init, there are two ways to init :
		  Arrays size :
		  1.By giving value:
		  	int [] arr = {1,2,3};
		  	it init the size and at the same time it give value to the index of array
		  	
		  2.BY new keyword:
		  	int [] arr = new int [size number];
		  	it init the ize of array ONLY, does not give any value
		  	
		             
		 */
		int a = 10;
		int [] arr = {10,20,30,}; // 1st type
		
		int arr2 [] = {10,20,30,}; // 2nd type
		
		char arr3 [] = {'A','B','C'};	
		
		String arr4 [] = {"Ibrahim", "Filiz", "Aysel"};
		//      index        0          1          2
		// String name = arr4[3]; index 3 is not exist
		String name = arr4[2];
		System.out.println(name);
		
		/*
		 initialize the size of array:
		 int [] arr = new int [size]
		 */
		
		int [] myNum = new int [5];
		System.out.println();
		
		for (int i = 0; i < myNum.length; i++ ) {
			System.out.println(myNum[i]);
		}
		
		/*
		 default values:
		 int, byte, short, long  ==> 0
		 double, float  ==> 0,0
		 boolean ==> false
		 char ==> space
		 */
		
		// assign values:
		int  ch [] = new int[3];
		ch[0] = 10;
		ch[1] = 20;
		ch[2] = 30;
	//	ch[3]= 40; //  compile error out of bond
		//System.out.println(ch[2]);
		
		
		
		for (int i = 0; i <ch.length; i++) {
			System.out.print(ch[i]+" "); // 10,20,30
		}
		
		System.out.println();
		
		ch = new int [4]; // reinitialized its size and pervious value of array are lost.
		
		for (int z = 0; z <ch.length; z++) {
			System.out.print(ch[z]+" ");
		} //  arrays size is fixed
		
		System.out.println();
		
		 // combine two warrays:
        int[] array1 = { 1,2, 3 ,9 }; 
        int[] array2 = { 4, 5, 6, 7 };
        
        int[] array3 =  new  int[ array1.length + array2.length ];
//now this array has enough capacity to contain all the elements of array1 and array2
           for(int i=0; i < array1.length; i++ ) {
                       array3[i] = array1[i];
                       // assigning all value of array1 to array3' first 3 indexs
           }
        
        for(int i =0; i < array2.length; i++) {
               array3[ i + array1.length]  = array2[i]; 
               // assigning all the values of array2 to array3' remaining index
        }
        
   
        for(int i=0; i < array3.length; i++) {
            System.out.print(array3[i]+" ");
        }
		
		
		
		
		
		
		
	}

}
