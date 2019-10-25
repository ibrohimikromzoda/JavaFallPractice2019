package day29_RuturnMethods;

public class SystemExit {
	
	public static void main(String[] args) {
		
		method1();
		//System.out.println(number());
		System.out.println("Done");
		
		
	}
	
	public static void method1() {
		System.out.println("hello word");
		System.exit(0);
	}
	
	public static int number() {
		if (8 < 9) {
			System.exit(0); // exits all the java execution
		}
		return 5;
	}

}
