package A_replit;

import java.util.Scanner;

public class question74_SmSmessages {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		System.out.println();

		
		String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    
	    System.out.println("Sender: " + message.substring(message.indexOf("<")+1,message.indexOf(">"))) ;
	    System.out.println("Phone Number: " + message.substring(message.indexOf("[")+1,message.indexOf("]")));
	    System.out.println("Message body: " + message.substring(message.indexOf("{")+1, message.indexOf("}")));
	    

	}

}
