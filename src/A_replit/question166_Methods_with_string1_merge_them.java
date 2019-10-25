package A_replit;

public class question166_Methods_with_string1_merge_them {
	
	 public static void main(String[] args) {
		 String one = "java";
		 String two = "selenium";
		 System.out.println(mergeStrings(one,two));
		
	}
	
	public static String mergeStrings(String one, String two) {
		
		String result = "";
		
		for (int i = 0; i < one.length() || i < two.length(); i++) {
			if (i < one.length()) {
				result+=one.charAt(i);
			}
			if (i < two.length()) {
				result+= two.charAt(i);
			}
		}
		
		
		
		return result;
	}

}
