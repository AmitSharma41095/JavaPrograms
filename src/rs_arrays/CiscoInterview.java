package rs_arrays;

public class CiscoInterview {

	public static void main(String[] args) {
		int b[][]= {{20,3,4},{5,7,8},{4,9,8}};
		System.out.println(b.length); //row
		System.out.println(b[1].length); //columns
		
		int min = b[0][0];
		int mincoloumn =0;
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print("["+i+"]["+j+"] = "+b[i][j]+ " ");
				if(b[i][j]<min) {
					min = b[i][j];
					mincoloumn=j;
				}
			}
			System.out.println();
		}
		System.out.println("Minimum value is :"+min);
		
		int max=b[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
			if(b[k][mincoloumn]>max){
				max=b[k][mincoloumn];
		}
			k++;
		}
		System.out.println("Maximum value in that column is : "+max);
		
	}
}
