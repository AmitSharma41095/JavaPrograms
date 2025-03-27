package practice;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		ArrayAssignment aA = new ArrayAssignment();
		int[] arrays = aA.addArrays();
		
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i] + "  ");
		}
		
		
	}

	
	public int[] addArrays() {
		int a[]= {1,2,3,4,5};
		int b[]= {11,12,13,14,15};
		int c[] = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			c[i]= a[i] + b[i];
		}
		
		
		return c;
	}
}
