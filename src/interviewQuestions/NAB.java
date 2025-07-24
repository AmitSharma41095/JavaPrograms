package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NAB {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1};
//		boolean canBePaired = canBePaired(arr);
//		System.out.println(canBePaired);
		
//		boolean canBePairedUsingSets = canBePairedUsingSets(arr);
//		System.out.println(canBePairedUsingSets);
		
		 System.out.println(maximum69Number(696)); // 996
	     System.out.println(maximum69Number(99)); // 966
	     System.out.println(maximum69Number(99666)); // 999

	}
	
//	public static boolean canBePaired(int[] arr) {
//	    if ((arr.length & 1) == 1) return false;   // odd length → impossible
//
//	    Arrays.sort(arr);                          // O(n log n)
//
//	    for (int i = 0; i < arr.length; i += 2) {  // O(n)
//	        if (arr[i] != arr[i + 1]) return false;
//	    }
//	    return true;
//	}

	
	public static boolean canBePairedUsingSets(int[] arr) {
		Set<Integer> unpaired = new HashSet<>();

        for (int n : arr) {
            if (unpaired.contains(n)) {
                unpaired.remove(n);  // second time – forms a pair
            } else {
                unpaired.add(n);     // first time – wait for a pair
            }
        }

        // If no unpaired elements remain, it's pairable
        return unpaired.isEmpty();

	}
	
	public static int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {        // first (most‑significant) 6
                digits[i] = '9';           // flip it
                break;                     // only one change allowed
            }
        }
        return Integer.parseInt(new String(digits));
    }
	
	public static int maximum69NumberRegex(int num) {
	    return Integer.parseInt(
	        String.valueOf(num).replaceFirst("6", "9")  // flip the first 6 only
	    );
	}
	
}
