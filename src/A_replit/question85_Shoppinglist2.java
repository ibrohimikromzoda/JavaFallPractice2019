package A_replit;

import java.util.Scanner;

public class question85_Shoppinglist2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		
		for (int count = 1; count <= 10; count++) {
			
		
	  System.out.println("Enter Item "+count+" and its price:");
	  String item = input.next();
	  double price = input.nextDouble();
	  
	 System.out.println("Add one more iten?");
	 String answer = input.next();
	 
	 if (answer.equalsIgnoreCase("no")) {
		// String shoppingListReport = "Item "+item+" "+count+" and its price "+price;
		 
		 String shoppingListReport = "Item"+count+""+item+"Price:"+price+","+"Item"+count+""+item+"Price"+price;
		 double totalPrice = price+price;
		
		 System.out.println("Total price: "+totalPrice);
		 break;
	 }
	
     
	 
	 
	  
	  
	  
		
		
		
		
	}

}
}