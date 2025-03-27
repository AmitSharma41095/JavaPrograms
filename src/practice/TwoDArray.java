package practice;

public class TwoDArray {

	public static void main(String[] args) {
		
		int a[][] = new int[2][3];
		System.out.println(a[0].length);
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = (int) ((Math.random())*1000);
				System.out.print(a[i][j]+"    ");
			}
			System.out.println();
		}

	}

}
