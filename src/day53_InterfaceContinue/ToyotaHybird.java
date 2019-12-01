package day53_InterfaceContinue;

public class ToyotaHybird implements Cars, GasVehicles, ElectricVehicles{

	@Override
	public void Charge() {
		System.out.println("Charging");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Self Driving mode");
		
	}

	@Override
	public void PumpGas() {
		System.out.println("Pumping gas");
		
	}

	@Override
	public void start() {
		System.out.println("Push start button");
		
	}

	@Override
	public void fly() {
		System.out.println("Toyota is flying");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Self parking");
		
	}

}
