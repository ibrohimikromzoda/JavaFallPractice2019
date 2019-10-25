package A_replit;

public class question143_Method5_simple_print_pattern {
	
	public static void printHollowRect() {
		
		
		

		for (int i = 0; i < 5; i++) 
		{
			if (i == 0 || i == 4) 
			{
				for (int j = 0; j < 5; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			if (i >= 1 && i <= 3) 
			{
				for (int j = 0; j < 5; j++) 
				{
					if (j == 0 || j == 4) 
					{
						System.out.print("*");
					} 
					else if (j >= 1 && j <= 5) 
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		
		printHollowRect();
		
	}

	
	/*
	 for (int z = 1; z <= 5; z++) {

			for (int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println();
	 */
}


  