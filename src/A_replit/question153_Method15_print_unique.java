package A_replit;

import java.util.Scanner;

public class question153_Method15_print_unique {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println();
    int size = scan.nextInt();
    String[] words = new String[size];
    for(int i=0; i < size; i++){
      words[i] = scan.next();
    }
    printUniqueWords(words);
  }
  
  public static void printUniqueWords(String[] words){
    //WRITE YOUR CODE HERE
	  for (int i =0; i < words.length; i++) {
	      String cur = words[i];
	      boolean unique = true;
	      for (int j = 0; j < words.length; j++) {
	        if (words[j].equals(cur) && i != j) {
	          unique = false;
	          break;
	        }
	      }
	      if (unique) {
	        System.out.println(cur);
	      }
	
	
	  }
  }
}
