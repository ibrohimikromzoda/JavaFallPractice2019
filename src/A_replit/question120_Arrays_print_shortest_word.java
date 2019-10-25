package A_replit;

import java.util.Arrays;
import java.util.Scanner;

public class question120_Arrays_print_shortest_word {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println();
		String[] words = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
		
		String myShort = words[0];
		
		
		
        
        for(String Shortest : words) {
        
        if(Shortest.length() < myShort.length())
        myShort = Shortest;
        }
        System.out.println(myShort);
        

}
	}