package rough;

public class PractiseCodes {

	public static void main(String[] args) {
//		String a = "hello";
//		repeatEachCharactertwice(a);
		int a[]= {10,45,30,99,23,67,5,18,37};
				
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
	}
	
	public static void repeatEachCharactertwice(String a) {
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			System.out.print(a.charAt(i));
		}
		
		
	}
	

}
