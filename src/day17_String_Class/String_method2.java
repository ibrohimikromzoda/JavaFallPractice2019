package day17_String_Class;

public class String_method2 {
	public static void main(String[] args) {
		
		/*
		 replace(old char, new char) :
		 replaces all the old char values with the given
		 new char value in the String and returns it
		 as a New String Value
		 */
		
		String str1 = "Java is Fun Programming language";
		str1 =str1.replace('a', 'e');
		System.out.println(str1);
		
		/*
		 replace (old str, new str):
		 replace all the old str values with the given
		 new str values and returns it
		 as a New String Value
		 */
	
	String str2 = "Today is gonna be a great day to learn Java Java";
	str2 = str2.replace("Today", "Tomorrow");
	System.out.println(str2);
	
	str2 = str2.replace("Java","" ); // "" removes it
	System.out.println(str2);
	
	/*
	 replaceFirst(old str, new str);
	 it replaces the first occurred old str with the new str
	 in the String and returns it as a New String Value
	 
	 */
	String s1 = "Java is fun, Java is good";
	s1 = s1.replaceFirst("Java", "Python");
	System.out.println(s1);
	
	s1 = s1.replaceFirst("is good", "iS Good");
	System.out.println(s1);
	
	String s2 = "Java is programming language, Java is Java";
	s2 = s2.replace("Java is Java", "C# is Java");
	System.out.println(s2);
	
	

}
}