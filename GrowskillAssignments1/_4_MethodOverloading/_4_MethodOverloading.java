package _4_MethodOverloading;

public class _4_MethodOverloading {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		_4_MethodOverloading addMethod = new _4_MethodOverloading();
		
		addMethod.add(10, 20);
		addMethod.add(20.0, 30.0);

	}

}
