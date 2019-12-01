package day53_InterfaceContinue;

public class Dealership {
	public static void main(String[] args) {
		
		
		 Tesla_Model3  obj1 = new Tesla_Model3();
         
         obj1.start();
         obj1.fly();
         obj1.Charge();
         
   Jeep_Wrangler obj2 = new Jeep_Wrangler();
                 obj2.start();
                 obj2.PumpGas();
                 
                 
     ToyotaHybird obj3 = new ToyotaHybird();
                 obj3.PumpGas();
                 obj3.Charge();
                 obj3.fly();
	}

}
