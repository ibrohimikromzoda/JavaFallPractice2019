package day47_JavaReview;


class Cinthya {
	
	public Cinthya (int a ) {
		this(5.5);
		// this("C");  one const can call only one
		System.out.println("A");
		//this(5.5); // u can not call after print statement
	}
	
	public Cinthya (double b) {
		//this(5.5); // can not call itself
       // this(10); can not contain itself ( which is 5.5 looping)
		System.out.println("B");
	}
	
	public Cinthya (String str) {
		System.out.println("C");
	}
	
	/*
	public Cinthya() {     1st option
		
	}
	*/
}




public class Constructors2 extends Cinthya {

	
	public Constructors2() {                       // 2nd option
		super(10);
		
	}
	
	public static void main(String[] args) {
		Constructors2 obj = new Constructors2();
	}

}
