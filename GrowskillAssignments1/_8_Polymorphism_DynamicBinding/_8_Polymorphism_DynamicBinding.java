package _8_Polymorphism_DynamicBinding;

public class _8_Polymorphism_DynamicBinding {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area();
		System.out.println("---------------------------------");
		
		Shape shape1 = new Rectangle();
		shape1.area();
		System.out.println("---------------------------------");
		
		Shape shape2 = new Circle();
		shape2.area();
	}
}

class Shape{
	
	public void area() {
		System.out.println("Area of generic shape !!!");
	}
}

class Rectangle extends Shape{
	public void area() {
		System.out.println("Area of Rectangle !!!");
	}
}

class Circle extends Shape{
	public void area() {
		System.out.println("Area of Circle !!!");
	}
}
