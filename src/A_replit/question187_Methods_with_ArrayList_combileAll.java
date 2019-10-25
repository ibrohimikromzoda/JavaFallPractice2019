package A_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class question187_Methods_with_ArrayList_combileAll {
	
	public static void main(String[] args) {
		
		ArrayList<String> w1 = new ArrayList<>(Arrays.asList("a","b","c"));
		ArrayList<String> w2 = new ArrayList<>(Arrays.asList("d","e","f"));
		
		combileAL(w1,w2);
		System.out.println(combileAL(w1,w2));
		
		
	}
	
	public static ArrayList<String> combileAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		
		ArrayList<String> result = new ArrayList<>();
		
		result.addAll(wordList1);
		result.addAll(wordList2);
	
		
		return result;
	}


}