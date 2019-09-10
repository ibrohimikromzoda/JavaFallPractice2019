package day15_Scanner;
import java.util.Scanner;
public class task01 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
    System.out.println ("Enter 3 numbers");
     int intNum1 = input.nextInt();
     int intNum2 = input.nextInt();
     int intNum3 = input.nextInt();
     System.out.println ("Sum of numbers "+(intNum1+intNum2+intNum3));
	
}
}
