package A_replit;

public class question186_Methods_with_string_extract_num {
	public static void main(String[] args) {
		
		System.out.println(extractNum("aa2aa3"));
	}
	
	public static String extractNum (String s) {
		
		String result = "";
		
		for (int i =0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				result+=ch;
			}
		}
		
	return result;
	}
}
