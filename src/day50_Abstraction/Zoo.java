package day50_Abstraction;

public class Zoo {
	
	public static void main(String[] args) {
        Cat  Cleo  =  new  Cat('F', (byte)5 , "White & Black", "Cleo");
    //  System.out.println( "Name is "+ Cleo.Nickname );  //Cleo
    //  System.out.println("Gender is "+Cleo.Gender );
    //  System.out.println( "Color is "+Cleo.color );
    //  System.out.println("Age is "+Cleo.Age);
        
        System.out.println("====================================");
        Cleo.getInfo();
        
        Cat misha = new Cat('F', (byte)6, "White & Grey", "misha");
            misha.getInfo();
            misha.Sleep(15);
            misha.Eat("chicken");
            misha.Drink("milk");
            misha.Speak("meow");
            
            System.out.println("=============================");
            
          Dog pngo = new Dog ('M', (byte) 8, "Golden", "Pngo");
        
    
          pngo.getInfo();
          pngo.Speak("Ukrainian");
          pngo.Eat("Fish");
          pngo.Drink("Vodka");
          pngo.Sleep(7);
          
          System.out.println("================================");
          
          Dog Tuzik = new Dog ('M', (byte)12, "Black", "Tuzik");
          Tuzik.getInfo();
          Tuzik.Drink("Redbull");
          Tuzik.Eat("Hot dog");
          Tuzik.Sleep(10);
          Tuzik.Speak("Kyrgyz woof");
          
          System.out.println("================================");
          
          
          Dog [] dog = {pngo, Tuzik};
          
          Cat [] cat = {misha, Cleo};
          
          dog[1].getInfo();
          
          /*
          abstract class : Countries 
          Data : name, flag, langauge, population, religion, rivals, capital city
          
           constructor that can set all those data
            
           actions (abstract)  : exports(parameter), import(parameter),
           economy(), currency()...
           
           
           sub class : 
           South Korea
           USA
           Tajikistan
           New Zealand
           Russia
           Turkey
           
           
           abstract method, inheritance, abstracta
           */
		
	}

}
