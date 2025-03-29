package rough;

public class PractiseCodes {

	public static void main(String[] args) {
//		String a = "hello";
//		repeatEachCharactertwice(a);
		
		int num = 1234;
		int count =0;
		int reverse = 0;
		
		while(num!=0) {
			int n = num% 10;
			reverse = reverse * 10 + n;
			num = num/10;
		}
		System.out.println(reverse);

	}
	
	public static void repeatEachCharactertwice(String a) {
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			System.out.print(a.charAt(i));
		}
		
		
	}
	

}
