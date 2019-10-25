package day39_JavaReview;

public class CellPhonesObjects {
	public static void main(String[] args) {
		
		CellPhones phone1 = new CellPhones();
		System.out.println(phone1.brand); // null didnt init
		System.out.println(phone1.color); // null
		System.out.println(phone1.model); // null
		System.out.println(phone1.price); // 0.0
		System.out.println(phone1.screensize); // 0.0
		System.out.println("-------------------------");
		
		CellPhones phone2 = new CellPhones("Motorolla", 200, "gray", 6.1, "z2 play");
		
		phone2.getInfo();
		
		CellPhones phone3 = new CellPhones("Nokia", 20, "black", 3, "3330");
		phone3.getInfo();
		
		CellPhones phone4 = new CellPhones("Samsung", 700, "red", 6.1, "GT-I7500");
		phone4.getInfo();
		
		CellPhones [] phones = {phone1, phone2, phone3, phone4};
			
		//brand of phone3:
		System.out.println(phones[2].brand);
		// get info of phone3
		phones[3].getInfo();
		
		// print all phones with for each loop
		for (CellPhones each : phones ) {
			each.getInfo();
		}
	}

}
