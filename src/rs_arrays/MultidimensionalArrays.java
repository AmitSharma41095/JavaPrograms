package rs_arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		MultiDimensional_2D_Array();
		MultiDimensional_2D_Array_MinimumNumber();
		MultiDimensional_2D_Array_MaximumNumber();
		
	}
	
	public static void MultiDimensional_2D_Array() {
		int b[][]= {{2,3,4},{5,7,8}};
		System.out.println(b.length); //row
		System.out.println(b[1].length); //columns
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print("["+i+"]["+j+"] = "+b[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void MultiDimensional_2D_Array_MinimumNumber() {
		int b[][]= {{2,3,4},{5,7,8},{4,9,8}};
		System.out.println(b.length); //row
		System.out.println(b[1].length); //columns
		
		int min = b[0][0];
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print("["+i+"]["+j+"] = "+b[i][j]+ " ");
				if(b[i][j]<min) {
					min = b[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Minimum value is :"+min);
	}
	
	public static void MultiDimensional_2D_Array_MaximumNumber() {
		int b[][]= {{2,3,4},{5,7,8},{4,9,8}};
		System.out.println(b.length); //row
		System.out.println(b[1].length); //columns
		
		int max = b[0][0];
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print("["+i+"]["+j+"] = "+b[i][j]+ " ");
				if(b[i][j]>max) {
					max = b[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Minimum value is :"+max);
	}
}
