package day30_WrapperClass_Array_List;

import java.util.ArrayList;

public class ArrayListClass {
	
	/*
	 ArrayList class :
	 1.presented in "java.util" package
	    import java.util.ArrayList
	    
	 2.ArrayList it doesn't support primitives
	 
	 3.In ArrayList we store Objects Only, all the
	 values in ArrayList are objects (none primitives)
	 
	 4. ArrayList's size is automatically adjusted which is (dynamic)
	  
	  Declaration of arrayList :
	    ArrayList<ClassType> variableName = new ArrayList <ClassType> ();
	 
	 5. ArrayList is ordered (index numbers)
	 
	 */
	
	public static void main(String[] args) {
		
		/*
		 Declaration of arrayList :
	    ArrayList<ClassType> variableName = new ArrayList <> ();
	    
	    ArrayList<ClassType> variableName = new ArrayList <ClassType> ();
	    
	    methods of arrayList :
	    add(value) : add values to arrayList. if the value is primitive, it will converts to wrapper class
		 
		  get (indexNum) - gets the specific values from ArrayList
		  
		  size (): returns the length (total number of values) from the arrayList
		  
		  clear (); clears the array, removes all the values out of from the array
		  
		 sorting Array:
		 Arrays.sort(VariableName) 
		  
		  Sorting the ArrayList: Collections.sort(VariableName);
		  collection class is presented in "java.util" package.
		  
		  						ArrayList versus Array : 
		  						
		  	1.Array's size is fixed, ArrayList size is dynamic.
		  	2.Array support both primitives and non primitives, 
		  	ArrayList does not support primitives.			
		  
		  
		 */
		
		 int [] array1 = new int [1];
		 
		 
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10); // auto-boxing
		list2.add(20);
		list2.add(30);
		// [10,20,30]
// index    0   1  2
		
		
		System.out.println(list2);
		System.out.println(list2.get(1)); // 20
		//System.out.println(list2.get(9)); // max num is 2 (out of range)
		
		
		System.out.println(list2.size()); // size is  3
		
		list2.clear(); // clear everything after this code
		
		System.out.println(list2); // []
		
		System.out.println(list2.size()); //size is 0
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
