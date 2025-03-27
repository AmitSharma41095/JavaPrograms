package polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {

		PolymorphismTest p = new PolymorphismTest();
		p.add(10, 20);
		p.add(10, 20, 30);

	}
	
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("sum ::" + sum);
	}
	
	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("sum ::" + sum);
	}

}
