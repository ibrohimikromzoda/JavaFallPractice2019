package day54_Polymorphism;
/*
 WarmUp:
    Create a class called Animal (Donot use abstraction for now):
                Actions: Talk()
    create sub classes of Animal class:
                1. Tiger:
                        Actions: Hunts()
                2. Octopus:
                        Actions: Swim()
        override super class' instance method Talk()
    create a class called Zoo:
            Create Arrays of Tiger
            Create Arrays of Octopu

 */

class Animal {
	public void Talk() {
		System.out.println("Animal is talking");
	}
}

class Tiger extends Animal {
     public void Hunt() {
	 System.out.println("Tiger is hunting");
	}
     public void Talk() {
    	 System.out.println("Tiger is talking");
     }
}

class Octopus extends Animal {
	public void Swim() {
		System.out.println("Octopus is swimming");
	}
	public void Talk() {
		System.out.println("Octopus is talking ==> gologolo");
	}
	
}

public class Zoo {
	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		Tiger[] Tigers = {tiger1, new Tiger()};
		
		
		Octopus octopus1 = new Octopus();
		Octopus[] octopus = {octopus1, new Octopus()};
		
		Animal        animal =         new Tiger();
//reeferencee type	//referenceName	   //object
		Animal animal2 = new Octopus();
		
		
		
		
		
		
	}

}
