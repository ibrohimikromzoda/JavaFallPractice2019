package day49_Recap;

public class Rectangle extends Shape {
	
	double length;
	double width;
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	protected void Area() {
		double Area = length *width;
		System.out.println("Area is "+Area);
	}
	
	@Override
	protected void Perimeter () {
		double perimeter = (length+width) * 2;
		System.out.println("Perimeter of the rectangle is  "+perimeter);
	}

	

}
