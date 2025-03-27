package practice;

public class Arrays {

	public static void main(String[] args) {


		int a[] = new int[10];
		
		for(int i=1; i<=10; i++) {
			a[i-1]=(int) ((Math.random())*1000);
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(a[i-1]);
		}
		
		
	}
	
	

}
