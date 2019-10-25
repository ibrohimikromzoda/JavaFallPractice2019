package A_replit;

public class question189_Method_withString_finding_error_string {

	public static void main(String[] args) {
		
		String word = "error one two";
		isError(word);
		System.out.println(isError(word));
		
	}
	
	public static boolean isError (String word) {
		
		
		
			if (word.startsWith("error")) {
				return true;
			}
		
		return false;
	}
}
