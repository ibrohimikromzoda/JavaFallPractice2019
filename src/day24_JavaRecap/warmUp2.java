package day24_JavaRecap;

public class warmUp2 {
	
	public static void main(String[] args) {
		
		/*
		 3. write a program that return the minimum value from an int array
         4. write a program that return the second minimum valye from an int array
		 */
		int[] arr = { 20, 200, 30, 40, 50, 500 };
        int min = 9999999; 
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] < min) {
        		min=arr[i];
        	}
        }
		System.out.println("Min num is: "+min);
		
		
		int[] arr1 = { 20, 200, 10, 40, 50, 500 };
        int secondmin = 999999; 
        
        for (int j = 0; j < arr1.length; j++) {
        	if (arr1[j] < secondmin && arr1[j] > secondmin) {
        		 secondmin = arr[j];
        	}
        }
		System.out.println("Min num is: "+secondmin);
		
	}

}
