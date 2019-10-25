package day34_Constructors;

public class ConstructorsMethods {
	
	
	 /*
    decleration of constructor:
           access-modifer  className(){
                   statements;
           }
    */
   
   public ConstructorsMethods() {
       
       System.out.println("Hello World");
       System.out.println("I am a default constructor");
       
       // return "aaa";   there is no return type in constructor
   }
   
   public ConstructorsMethods(int num) {
       
       System.out.println("Hello world");
       System.out.println("I am a constructor with an argument of int: "+num);
       
   }
   
   
   public static void main(String[] args) {
           
   //  ConstructorMethods obj = new  ConstructorMethods( "A" ); 
                       // object was not created with exisiting constructor
       
	   ConstructorsMethods  obj2 = new ConstructorsMethods(8);
       
       method1();
               
               
               
   }
   
   
   public static void method1() {
       
	   ConstructorsMethods  obj2 = new ConstructorsMethods(8);
       
   }
   
	

}
