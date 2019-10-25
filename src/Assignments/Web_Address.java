package Assignments;

import java.util.Scanner;

public class Web_Address {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		String URL;
		String domain = "";
		String extension = "";
		
		boolean start, end;
		
		System.out.println("Please enter web address");
		URL = input.nextLine();
		
		start = URL.startsWith("www.");
		end =  URL.endsWith(".com") || URL.endsWith(".net") || URL.endsWith(".edu") || URL.endsWith(".org") || URL.endsWith(".gov")
				|| URL.endsWith(".net");
		
		if (start) {
			if (end) {
				int extension1 = URL.length()-3;
				extension = URL.substring(extension1);
				int at = URL.lastIndexOf(".");
				domain = URL.substring(4, at);
				
			} else {
				System.out.println("Invalid URL");
			}
			System.out.println("Domain: "+ domain);
			System.out.println("Extension: "+extension);
			
			input.close();
		}
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
