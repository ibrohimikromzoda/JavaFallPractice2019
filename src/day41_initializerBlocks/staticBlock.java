package day41_initializerBlocks;

public class staticBlock {
	
	
	
	  public staticBlock() {
		  System.out.println("This is constructor");
	  }
	
	
	
	public static void main(String[] args) {
		 
		staticBlock ojb1=new staticBlock();
		staticBlock ojb2=new staticBlock();
		staticBlock ojb3=new staticBlock();
		staticBlock ojb4=new staticBlock();
		staticBlock ojb5=new staticBlock();
		
		System.out.println("Main method ");
		
		
		
	}
	static {
		System.out.println("static block 2");
	}
	
	
	static  {
		System.out.println("static block A");
		//System.out.println("static block B");
		
		}
	
	
}
