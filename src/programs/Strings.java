package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		Strings str = new Strings();
		
//		str._1CountCharactersInString();
//		str._2CountVowelsAndConsonents();
//		str._3Anagram();
//		str._5RemoveWhiteSpaces();
//		str._6ReplaceWhiteSpacesWithSpecialCharacter();
//		str._8Palindrome();

	}
	
	public void _1CountCharactersInString() {
		System.out.println("Enter the string:: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		System.out.println("Length of string :: "+s+" is :: "+s.length());
	}
	
	public void _2CountVowelsAndConsonents() {
		System.out.println("Enter the string:: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int vowel=0;
		int consonent=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || 
					s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				System.out.println("Character is "+s.charAt(i));
				vowel++;
			}else {
				System.out.println("Character is "+s.charAt(i));
				consonent++;
			}
		}
		System.out.println("Total Vowel count ::"+vowel);
		System.out.println("Total Consonent count ::"+consonent);	
	}
	
	public void _3Anagram() {
		String s1 = "BRAG";
		String s2 = "Grab";
		
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(a.length==b.length) {
			if(Arrays.equals(a,b)) {
				System.out.println("String is anagram !!");
			}else {
				System.out.println("String is not anagram !!");
			}
		}else {
			System.out.println("String is not anagram !!");
		}			
	}

	public void _4DivideStringInNEqualParts() {
		
	}
	
	public void _5RemoveWhiteSpaces() {
		System.out.println("Enter the string:: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("String after removing white spaces :: "+s.replaceAll(" ", ""));
	}
	
	public void _6ReplaceWhiteSpacesWithSpecialCharacter() {
		System.out.println("Enter the string:: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("String after removing white spaces :: "+s.replaceAll(" ", "&"));
	}
	
	public void _7ReplaceUpperCaseWithLowerAndViceVersa() {
		System.out.println("Enter the string:: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	}
	
	public void _8Palindrome() {
		System.out.println("Enter the string:: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Entered string is == "+s.toLowerCase());
		
		String s1 = s.toLowerCase();
		String reversed = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			reversed= reversed +s1.charAt(i);
		}
		
		System.out.println("Reveresed string is == "+ reversed);
		
		if(s1.equals(reversed)) {
			System.out.println("Plaindrome !!");
		}else {
			System.out.println("Not Palindrome !!");
		}
		
	}

	public void _9CountDuplicateElements() {
		
	}

}
