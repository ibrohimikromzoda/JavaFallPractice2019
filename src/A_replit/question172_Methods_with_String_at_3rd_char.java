package A_replit;

public class question172_Methods_with_String_at_3rd_char {
	
	public static void main(String[] args) {
		at3("longword","foo");
		System.out.println(at3("longword","foo"));
		
		
	}
	
	public static String at3 (String target, String word) {
		return target.substring(0, 3) + word + target.substring(3);
	}

}
