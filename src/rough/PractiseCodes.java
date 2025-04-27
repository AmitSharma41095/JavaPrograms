package rough;

import java.util.Arrays;

public class PractiseCodes {

	public static void main(String[] args) {
//		String a = "hello";
//		repeatEachCharactertwice(a);
		int a[] = {1,4,0,2,0,7,2,0,3,1,0};
        int b[] = {1,4,0,2,0,7,2,0,3,1,0};

        System.out.println(Arrays.toString(a));

       int n = a.length;
       int writeIndex = n-1; //last index

        for(int i=n-1; i>=0; i--){
            if(a[i]!=0){
                a[writeIndex--]=a[i];
            }
        }

        while(writeIndex>=0){
            a[writeIndex--] =0;
        }

        System.out.println(Arrays.toString(a));

       int writeIndex1 = 0;
       for(int i=0; i<a.length; i++){
           if(b[i]!=0){
               b[writeIndex1++] = b[i];
           }
       }

       while(writeIndex1 < b.length){
           b[writeIndex1++] = 0;
       }
        System.out.println(Arrays.toString(b));
    }
		
	
	public static void repeatEachCharactertwice(String a) {
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
			System.out.print(a.charAt(i));
		}
		
		
	}
	

}
