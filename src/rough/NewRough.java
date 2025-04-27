package rough;

public class NewRough {

	public static void main(String[] args) {
	
	int a[]= {1,2,3,4,1,2,5,6,4,3,4}; //{1,2,3,4,-1,-1,5,6,-1,-1,-1};
	int fr[] = new int[a.length];
	int visited = -1;
	
	for(int i=0; i<a.length; i++) {
		int count = 1;
		for(int j=i+1; j<a.length; j++ ) {
			if(a[i]==a[j]) {
				count++;
				fr[j]=visited;
			}
		}
		if(fr[i]!=visited) {
			fr[i] = count;
		}
	}
	
	System.out.println("Frequency of each number is : ");
	for(int k=0; k<fr.length; k++) {
		if(fr[k]!=visited) {
			System.out.println(a[k]+ " | "+ fr[k]);
		}
	}
	
	System.out.println("Maximum occuring character");
	int max =0;
	int maxPos = 0;
	for(int m=0; m<fr.length; m++) {
		if(fr[m]>max) {
			max = fr[m];
			maxPos = m;
		}
	}
	System.out.println("Number "+ a[maxPos] + " repeating maximum "+ max+ " times");
	
	
	
	
	}

}
