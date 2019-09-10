package day09_review;

public class Task03_biggerNumber {
public static void main(String[] args) {
	
	
	int n1 = 100;
	int n2 = 200;
	int n3 = 300;
	
	if (n1>n2 && n1 > n3) {
		System.out.println("Number 1 is bigger "+n1);
	}
	else if (n2>n1 && n2 > n3) {
		System.out.println("Number 2 is bigger "+n2);
	}
	
	else if (n3>n1 && n3 > n2) {
		System.out.println("Number 3 is bigger "+n3);
	}
	
	
}
}
