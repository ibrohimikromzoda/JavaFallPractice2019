package day43_JavaRecap;

public class EncapsulationShortCut {
	
	
	private int age =10;
	private int id =20;
	private int number = 30;
	
	
	
	/*
	 shortcuts for getter and setter:
	 	1. declare private datas
	 	2. right click -> source -> Genrate getters and setters
	 	3. select the instance variables you wanna generate getters and setters with
	 	4. click generate button
	 	
	 */
	
	
	public int setAge (int age) {
		return age;
	}
	
	public void getAge (int age) {
		this.age = age;
	}
	
	
	
	public int setID (int id) {
		return id;
	}
	
	public void getID (int id) {
		this.id=id;
	}
	
	public int setNumber (int number) {
		return number;
	}
	
	public void getNumber (int number) {
		this.number=number;
	}
 
}
