package day53_InterfaceContinue;

public class Jeep_Wrangler implements Cars, GasVehicles{

	
	public void PumpGas() {
		System.out.println("Pumping Gas");		
	}


	public void start() {
	  System.out.println("Call Mechanic");
	  System.out.println("Oil change");
	  System.out.println("Jump Start");
		
	}


	
	public void SelfParking() {
		
		
	}
	

}
