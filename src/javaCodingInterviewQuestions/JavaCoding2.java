package javaCodingInterviewQuestions;

public class JavaCoding2 {

	public static void main(String[] args) {
		//6. Sort the array in ascending order
		int arr1[] = {20,80,50,10,30,40};
		_6_ArrayInAscendingOrder(arr1);
		System.out.println("\n=============================================================");
		
		//7. Sort the array in descending order
		int arr2[] = {20,80,50,10,30,40};
		_7_ArrayInDescendingOrder(arr2);
		System.out.println("\n=============================================================");
		
		//8. Swap two numbers using temporary variable
		int a =20;
		int b = 50;
		System.out.println("Number before swap :: a = "+a+ " & b = "+b);
		String swap = _8_swaptwoNumbersWithTemporaryVariable(a,b);
		System.out.println(swap);
		System.out.println("=============================================================");
		
		//9. Swap two numbers without using temporary variable
		int a1 =20;
		int b1 = 50;
		System.out.println("Number before swap :: a1 = "+a1+ " & b1 = "+b1);
		String swap1 = _9_swaptwoNumbersWithoutTemporaryVariable(a1,b1);
		System.out.println(swap1);
		System.out.println("=============================================================");
		
		//10. Program for printing pyramid
		_10_printPattern();

	}

	private static void _6_ArrayInAscendingOrder(int[] a) {
		System.out.println("Array before sorting ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				int temp =0;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\nArray after sorting in ascending order ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void _7_ArrayInDescendingOrder(int[] a) {
		System.out.println("Array before sorting ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				int temp =0;
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\nArray after sorting in descending order ::");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static String _8_swaptwoNumbersWithTemporaryVariable(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		return "Number after swap :: a = "+a+ " & b = "+b;
	}

	private static String _9_swaptwoNumbersWithoutTemporaryVariable(int a, int b) {
		a = a - b;
		b = a + b;
		a = b - a;
		return "Number after swap :: a1 = "+a+ " & b1 = "+b;
	}
	
	private static void _10_printPattern() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
