package A_replit;

import java.util.Scanner;

public class question97_equals_java_python {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println();
	String sentence = scan.nextLine();
    int java =0;
     int python = 0;
    
    for (int i = 0; i < sentence.length()-3; i++)
        if (sentence.substring(i,i+4).equals("java"))
            java++;
    for (int i = 0; i < sentence.length()-5; i++)
        if (sentence.substring(i,i+6).equals("python"))
            python++;
    
    //boolean B = java == python ? true : false;
    //System.out.println(B);
    boolean b = java == python;
    if (java == python) {
       System.out.println(true);
    } else {
    	System.out.println(false);
    }
    
    
	
}
}
