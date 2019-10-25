package day37_classAndObject;

public class EmployeeObject {
	
	public static void main(String[] args) {
		
		Employees employee1 = new Employees();
		
		employee1.EmployeeName = "Tim Cook";
		employee1.EmployeeID = 9930202;
		employee1.JobTitle = "CEO of Apple";
		employee1.SSN = 987654321;
		employee1.Gender = 'M';
		employee1.Salary = 135100.43;
		
		employee1.getInfo();
		
		Employees employee2 = new Employees();
		
		employee2.EmployeeName = "Sundar Pichai";
		employee2.EmployeeID = 3430202;
		employee2.JobTitle = "CEO of Google";
		employee2.SSN = 324354321;
		employee2.Gender = 'M';
		employee2.Salary = 145100.42;
		
		employee2.getInfo();
		
		Employees employee3 = new Employees();
		
		employee3.EmployeeName = "Elon Musk";
		employee3.EmployeeID = 2334402;
		employee3.JobTitle = "CEO of Tesla/Spacex";
		employee3.SSN = 324354321;
		employee3.Gender = 'M';
		employee3.Salary = 150100.52;
		
		employee3.getInfo();
		
		
			
		
		
	}

}
