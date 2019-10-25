package day37_classAndObject;

public class Employees {
	
	/*
	 Assignment :
	 create a custom class for Employess
	  attributes : EmployeeName
	               EmployeeID
	               JobTitle
	               SSN
	               Gender
	               Salary
	               
	     actions:
	       getInfo
	                 
	 */
	String EmployeeName;
	int EmployeeID;
	String JobTitle;
	int SSN;
	char Gender;
	double Salary;
	
	public void getInfo () {
		
		System.out.println("Employee name is "+EmployeeName+", ID is "+EmployeeID+", Position "+JobTitle+", SNN "+SSN+", Gender is "+Gender+", Salary is $"+Salary);
	}
	

}
