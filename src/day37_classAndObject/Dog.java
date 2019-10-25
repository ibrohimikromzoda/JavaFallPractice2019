package day37_classAndObject;

public class Dog {
	
	/*
	 Dog
	 Attribute / data :
	  breed, size, age, color, name, gender
	  
	  actions:
	  eat, sleep, bark,play.....
	 */

	  String Breed;
	  String Size;
	  byte Age;
	  String Color;
	  String Name;
	   char  Gender;
	   String Food;
	  
	  public  void getInfo() {
		  System.out.println(Breed +" "+Size+", "+Age+" years old, "+Color+", Gender is "+Gender+", Name is "+Name);
	  }
	
	  public void eat() {
		 System.out.println(Name +" is eating "+Food);
	  }
	  
	  public void play () {
		  System.out.println(Breed +" is playing");
	  }
}
