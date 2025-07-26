package interviewQuestions;

public class NAB {

	public static void main(String[] args) {
		
		System.out.println(findEqualPairs(new int[] {1,2,2,1}));
		System.out.println(findEqualPairs(new int[] {7,7,7}));
		System.out.println(findEqualPairs(new int[] {1,2,2,3}));
		System.out.println(findEqualPairs(new int[] {1,2,2,3,3,1}));
		System.out.println("-------------------------------------------------");
		
		System.out.println(maximmByUpsideDown(696));
		System.out.println(maximmByUpsideDown(99));
		System.out.println(maximmByUpsideDown(99966));
		System.out.println(maximmByUpsideDown(666));
		System.out.println("-------------------------------------------------");
		
		System.out.println(arrayFairSplit(new int[] {0,4,-1,0,3}, new int[] {0,-2,5,0,3}));
		System.out.println(arrayFairSplit(new int[] {2,-2,-3,3}, new int[] {0,0,4,-4}));
		System.out.println(arrayFairSplit(new int[] {4,-1,0,3}, new int[] {-2,6,0,4}));
		System.out.println("-------------------------------------------------");
		
		
	}

	private static int arrayFairSplit(int[] is, int[] is2) {
		//find all 4 combinations and compare.
		
		int lengthArray = is.length;
		if(lengthArray<=1) {
			return 0;
		}
		
		int totalArray1=0;
		int totalArray2=0;
		for(int i=0; i<is.length; i++) {
			totalArray1 = totalArray1 + is[i];
			totalArray2 = totalArray2 + is2[i];
		}
		
		int array1_left = 0;
		int array2_left = 0;
		int result = 0;
		for(int j=1; j<is.length; j++) {
			array1_left = array1_left + is[j-1];
			array2_left = array2_left + is2[j-1];
			
			int array1_right = totalArray1 - array1_left;
			int array2_right = totalArray2 - array2_left;
			
			if(array1_left==array1_right && array1_left==array2_left && array1_left==array2_right) {
				result++;
			}
			
		}
		
		return result;
	}

	private static int maximmByUpsideDown(int i) {
		
		//convert integer to string 
		//iterate through string and replace first 6 with 9.
		String num = String.valueOf(i);
		char digs[] = num.toCharArray();
		
		for(int m=0; m<digs.length; m++) {
			if(digs[m]=='6') {
				digs[m]='9';
				break;
			}
		}
		
		int finalNumber = Integer.parseInt(new String(digs));
		
		return finalNumber;
	}

	private static boolean findEqualPairs(int[] is) {

		//if size is odd pairing not possible
		if(is.length%2!=0) {
			return false;
		}
		
		//sort the array
		int temp =0;
		for(int i=0; i<is.length; i++) {
			for(int j=0; j<is.length; j++) {
				if(is[i]<is[j]) {
					temp=is[i];
					is[i]=is[j];
					is[j]=temp;
				}
			}
		}
		
		//check for pairs with even index
		for(int i=0; i<is.length; i=i+2) {
			if(is[i]!=is[i+1]) {
				return false;
			}
		}
		
		return true;
	}
		
		

}
