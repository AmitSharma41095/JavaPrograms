package rough;

public class PractiseCodes {

	public static void main(String[] args) {
		String a = "hello";
		repeatEachCharactertwice(a);

	}
	
	public static void repeatEachCharactertwice(String a) {
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			System.out.print(a.charAt(i));
		}
		
		
	}
	

}
