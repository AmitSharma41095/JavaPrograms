package miscellaneous_RahulShetty;

public class ConstructorDemo {

	//Constructor - block of code that can be executed when object of class is created.
	//name same as class name
	//no return type
	//if no constructor defined, by default the compiler will invoke default constructor
	//Types : 1. Default Constructor 2. Parameterized constructor
	
	public ConstructorDemo() {
		System.out.println("I am the constructor");
	}
	
	public ConstructorDemo(String name) {
		System.out.println("I am the parametrized constructor, Hello "+ name);
	}
	
	public void getData() {
		System.out.println("I am the getData method");
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();	//for unparameterized constructor
		cd.getData();
		ConstructorDemo cd1 = new ConstructorDemo("Amit"); //for Parameterized constructor
		cd.getData();
	}
}
