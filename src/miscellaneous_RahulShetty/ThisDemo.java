package miscellaneous_RahulShetty;

public class ThisDemo {
	
	int a = 5; //class level variable
			
	public void getData() {
		int a = 10;
		
		System.out.println(a); //output = 10 as method variable overrides class level variable
		//this refers to current object - object scope lies in class level
		System.out.println(this.a);
		//Interview question : sum up the local and global variable
		int sum = a+this.a;
		System.out.println("Sum :: "+sum);
	}

	public static void main(String[] args) {
		ThisDemo t = new ThisDemo();
		t.getData();
	}
}
