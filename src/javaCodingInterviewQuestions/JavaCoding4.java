package javaCodingInterviewQuestions;

public class JavaCoding4 {

	public static void main(String[] args) {
		//16. Reverse the string
		String s = "madam";
		_16_ReverseString(s);
		System.out.println("=============================================================");
		
		//17. Count number of occurrences of characters in String
		String val = "aaasjfajsydiiiiiaa";
		int occurances = _17_CountOccurances(val,'a');
		System.out.println("String is : "+val + " & in the string a occurs = " );
		System.out.println(occurances);
		System.out.println("=============================================================");
		
		//18. Reverse a number with alphabetic operators
		int number = 1423;
		int reversedNumber = _18_ReverseNumber(number);
		System.out.println("Number is : "+number+" & reversed is : "+reversedNumber);
		System.out.println("=============================================================");

	}

	private static int _17_CountOccurances(String val, char c) {
		int count = 0;
		for(int i=0; i<val.length();i++) {
			if(val.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

	private static void _16_ReverseString(String s) {
		System.out.println("String is : "+s);
		String reversed = "";
		for(int i=s.length()-1; i>=0; i--) {
			reversed = reversed + s.charAt(i);
//			System.out.print(s.charAt(i));
		}
		System.out.println("Reversed string is : "+reversed);
		if(s.equals(reversed)) {
			System.out.println("String is palindrome !!");
		}else {
			System.out.println("String is not palindrome !!");
		}
	}
	
	private static int _18_ReverseNumber(int num) {
		int reverse = 0;
		while(num>0) {
			int n = num % 10;
			num = num / 10;
			reverse = reverse * 10 + n;
		}
		return reverse;
	}

}
