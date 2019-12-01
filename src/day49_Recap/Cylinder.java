package day49_Recap;

public class Cylinder extends Shape{
	
	double radius;
	double height;
	final double PI = 3.14;
	double diameter;
	
	
	
	
	public Cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
		diameter = radius *2;
	
	}
	
	@Override
	protected void Area () {
		double Area = (2*PI*radius * radius) + (height * 2 * PI * radius);
		System.out.println("Area of the cylinder is "+Area);
	}

		@Override
	protected void Perimeter() {
		double perimeter = 2* (PI * diameter + height);
		System.out.println("perimeter of the cylinder is "+perimeter);
		
	}
	

}
