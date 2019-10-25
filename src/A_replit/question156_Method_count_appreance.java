package A_replit;

public class question156_Method_count_appreance {
	
	public static void main(String[] args) {
		count_appearance(arr);
		
		
		
	}
	 
	public static int  count_appearance(String[] arr,String t) {
		
	
    
	int count = 0;
    for (int i = 0; i<arr.length; i++) {
        if(arr [i].contentEquals(t)) {
            count++;
        }
    }
    return count;

	}
}

