package A_replit;

public class question_161_Methodswithreturn_6_water_tax {

	public static void main(String[] args) {
		System.out.println(waterTax(101));

	}

	public static double waterTax(double units) {
		double bill = 0.0;

		if (units > 50) {
			if (units > 50 && units < 100) {
				bill = units * 0.90;
			}
			if (units > 100 && units < 150) {
				bill = units * 0.90 + 50;
			}
			if (units > 150) {
				bill = units * 0.90 + 100;
			}
		} else {
			bill = units * 0.60;
		}
		// end your code here
		

		return bill;
	}

}
