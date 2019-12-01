package day49_Recap;

/*
WarmUp: 
1. create a class called Shape
       Actions: Area(), perimeter(), capacity()
2. create sub classes of Shape:
                   Circle
                   rectangle
                   square
                   cylinder
   and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
Area of the circle:     3.14 * radius * radius
Area of the rectangle:  width * length
Area of the square:     side * side
Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
Perimeter of circle:    3.14 * 2 * radius
Perimeter of rectangle: (width + length) * 2
Perimeter of Square: 4 * side
volume of cylinder: 3.14 * radius * radius * height .  
*/

public class Shape {
	
	
	protected void Area() {
		System.out.println("Area of 0");
	}
	
	protected void Perimeter() {
		System.out.println("Perimeter is 0");
	}
	
	protected void Capacity() {
		System.out.println("Volume is 0");
	}
	
   
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(10,20);
				  rectangle1.Area();
				  
	    Rectangle rectangle2 = new Rectangle(30,40);
				  rectangle2.Area();
				  
				  rectangle2.Perimeter();
				  rectangle2.Capacity(); // 0
				  
				  
				  Square square1 = new Square(10);
				  square1.Area();// 100
				  square1.Perimeter(); // 40
				  square1.Capacity(); // 0
				  
				  Circle circle1 = new Circle (5);
				  circle1.Area(); // 78.5
				  circle1.perimeter(); //31.40000
				  
				  
				  Cylinder cylinder1 = new Cylinder(2,5);
					cylinder1.Area();
					cylinder1.Perimeter();
					cylinder1.Capacity();
				  
	}
	
	
	
	
	

}
