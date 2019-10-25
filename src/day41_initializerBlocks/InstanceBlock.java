package day41_initializerBlocks;

public class InstanceBlock {
	
	{
		System.out.println("instance block1");
	}
	
	{
		System.out.println("instance block2");
	}
	{
		System.out.println("instance block3");
	}
	
	 public InstanceBlock() {
		 System.out.println("Constructor");
	 }
        public static void main(String[] args) {
			
        	InstanceBlock obj1 = new InstanceBlock(); // ins cons
        	InstanceBlock obj2 = new InstanceBlock(); // ins cons
        	//InstanceBlock obj3 = new InstanceBlock(); // ins cons
        	
		}
}
