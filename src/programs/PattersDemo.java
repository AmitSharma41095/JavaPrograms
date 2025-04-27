package programs;

public class PattersDemo {

	public static void main(String[] args) {
		
		System.out.println("Pattern 1:");
		Pattern1();
		System.out.println("Pattern 2:");
		Pattern2();
		System.out.println("Pattern 3:");
		Pattern3();
		System.out.println("Pattern 4:");
		Pattern4();
		System.out.println("Pattern 5:");
		Pattern5();
		System.out.println("Pattern 6:");
		Pattern6();
		
		
	}
	
	public static void Pattern1() {
		
		//	***
		//	**
		//	*
		for(int i=1; i<=4; i++ ) {
			for(int j=i;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Pattern2() {
		
		//	1 2 3 4 
		//	5 6 7
		//	8 9
		//  10 
		int k=1;
		for(int i=1; i<=4; i++ ) {
			for(int j=i;j<=4;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
	
	public static void Pattern3() {
		
		//	*
		//	* *
		//	* * *
		for(int i=1; i<=4; i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void Pattern4() {
		
		//	1 
		//  2 3
		//	4 5 6 
		//	7 8 9 10
		int k=1;
		for(int i=1; i<=4; i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
	
	public static void Pattern5() {
		
		//	1 
		//  1 2
		//	1 2 3 
		//	1 2 3 4
		for(int i=1; i<=4; i++ ) {
			int k=1;
			for(int j=1;j<=i;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
	
	public static void Pattern6() {
		
//		3 
//		6 9 
//		12 15 18 
//		21 24 27 30
		int k=3;
		int m=1;
		for(int i=1; i<=4; i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(k*m + " ");
				m++;
			}
			System.out.println();
		}
	}

}
