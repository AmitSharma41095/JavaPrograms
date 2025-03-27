package miscellaneous_RahulShetty;

public class VariablesDemo {
	
	//instance variables - since these variables are instance dependent (based on values at object creation)
	String name;
	String city;
	int age;
	
	//Country : common value that is shared across all the objects.
	static String country = "India"; //static variable - saves memory of calling everytime
	//static variables are also called class variables.
	
	public VariablesDemo(String nm,String ct,int ag) {
		//local variables - since scope lies only within this block
		//we are assigning local variables values to instance variables.
		this.name= nm;
		this.city= ct;
		this.age= ag;
	}
	
	public void getDetails() {
		System.out.println("name : "+name+" ,city : "+city+" ,age : "+age+" ,Country : "+country );
	}

	public static void main(String[] args) {
		VariablesDemo v = new VariablesDemo("Amit","Delhi",29);
		VariablesDemo v1 = new VariablesDemo("Sumit","Patna",39);
		v.getDetails();		//name : Amit ,city : Delhi ,age : 29 ,Country : India
		v1.getDetails();	//name : Sumit ,city : Patna ,age : 39 ,Country : India

	}

}
