package day50_Abstraction;

public class Dog extends Animal {
	
	public Dog (char Gender, byte Age, String color, String NickName) {
		super(Gender, Age, color, NickName);
		
	}

	@Override
	public void Speak(String languge) {
		System.out.println("Nickname "+ " is speaking "+languge);
		
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname + " is speaking "+food );
		
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname +" is sleeps "+hour+" hours");
		
	}

	@Override
	public void Drink(String drinks) {
		System.out.println(Nickname+" drinks "+drinks);
		
		
	}

	
	// Dog obj = new Dog ('F', 6, "Black", "Rufas");
	
	

}
