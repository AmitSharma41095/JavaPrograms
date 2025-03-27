package rs_super;

public class SuperChildDemo extends SuperParentDemo {
	
	String name = "Sumit";
	
	public SuperChildDemo() {
		super();			//parent class constructor
		System.out.println("I am child class constrcutor!!"); //child class constructor
	}
	
	public void getName() {
		System.out.println(name);		//from current class - Sumit
		System.out.println(super.name); //from parent class - Amit
	}
	
	public void getData() {
		super.getData(); 			//method from parent class
		System.out.println("I am the data from Child class!!"); //method from child class
	}

	public static void main(String[] args) {
		SuperChildDemo s = new SuperChildDemo();
		s.getName();
		s.getData();
	}
}
