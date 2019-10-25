package A_replit;

public class question169_Method_with_String4_word_count {
	
	public static void main(String[] args) {
		wordCount("abc","cde");
		
	}

	
	public static int wordCount (String words) {
		
		int wordCount = 0;
		String result = "";
		
		for (int i =0; i <words.length(); i++) {
			if (words.length()==i) {
				wordCount++;
				
			}
		}
		
		
		
		
		
		
		return wordCount;
	}
	
}
