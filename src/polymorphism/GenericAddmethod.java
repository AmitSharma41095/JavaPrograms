package polymorphism;

public class GenericAddmethod {

	public static void main(String[] args) {
		GenericAddmethod gm = new GenericAddmethod();
		gm.add(10,20);
		gm.add(10,20,30);
		gm.add(10,20,30,40);
		gm.add(10,20,30,40,50);
		gm.add(10,20,30,40,50,60);

	}
	
	public void add(int... var) {
		int sum=0;
		for(int i=0; i<var.length; i++) {
			sum = sum + var[i];
		}
		System.out.println(sum);
		
	}

}
