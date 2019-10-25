package A_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class question188_Method_arrayList_removeAll {
	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
		removeAll(words,"hi");
		
	}

	
	public static void removeAll(ArrayList<String> wordList, String wordTarget) {
   
		ArrayList<String> words = new ArrayList<>();
		 
		for (int i =0; i < wordList.size(); i++) {
			if (wordList.contains(wordTarget)) {
				wordList.removeAll(Arrays.asList(wordTarget));
				words.addAll(wordList);
				System.out.println(words);
			}
			
		}
		
		
		 

	}
}
