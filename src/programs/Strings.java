package programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) throws IOException {
		
		Strings str = new Strings();
		
//		str._1CountCharactersInString();
//		str._2CountVowelsAndConsonents();
		str._3Anagram();
		str._5Find_All_Subsets_Of_String();
		str._7RemoveWhiteSpaces();
		str._8ReplaceWhiteSpacesWithSpecialCharacter();
		str._9ReplaceUpperCaseWithLowerAndViceVersa();
		str._10Reverse_a_string();
		str._11Check_string_pallindrome_or_not();
		str._15frequency_of_each_character_in_string();
//		str._16Find_most_repeated_word_in_a_text_file(); --need to check
		str._17Count_total_number_of_words_in_text_file();
		str._18Swap2_string_variables_without_using_temp_or_third_variable();
		str._19Reverse_string_in_java_word_by_word();
		str._21PercentageOfUpper_Lower_Digits_SpecialChars();

	}
	
	public void _1CountCharactersInString() {
		System.out.println("Enter the string ( to count characters) :: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		System.out.println("Length of string :: "+s+" is "+s.length());
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _2CountVowelsAndConsonents() {
		System.out.println("Enter the string (to count vowels and consonents) :: ");
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
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _3Anagram() {
		System.out.println("**** 3. Determine if 2 strings are anagram or not. ****");
		String s1 = "BRAG";
		String s2 = "Grab";
		
		System.out.println("String 1 is :: "+s1);
		System.out.println("String 2 is :: "+s2);
		
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
		System.out.println("-------------------------------------------------------------------");
	}

	public void _4DivideStringInNEqualParts() {
		
	}
	
	public void _5Find_All_Subsets_Of_String() {
		System.out.println("**** 5. Find all subsets of a string. ****");
		
		String s = "FUNTooss";
		System.out.println("String is : "+s);
		int len = s.length();
		int temp=0;
		String arr[] = new String[len*(len+1)/2];
		
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				arr[temp]= s.substring(i, j+1);
				temp++;
			}
		}
		
		System.out.println("All subsets of the above string is : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("\n-------------------------------------------------------------------");
	}
	
	public void _7RemoveWhiteSpaces() {
		System.out.println("**** 7. Remove all white spaces in a string. ****");
		String s = "Remove white spaces"; 
		System.out.println("String is : "+s);
		
		System.out.println("String after removing white spaces :: "+s.replaceAll(" ", ""));
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _8ReplaceWhiteSpacesWithSpecialCharacter() {
		System.out.println("**** 8. Replace white spaces with special characters. ****");
		String s = "Remove white spaces with special characters"; 
		System.out.println("String is : "+s);
		
		System.out.println("String after removing white spaces :: "+s.replaceAll(" ", "@"));
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _9ReplaceUpperCaseWithLowerAndViceVersa() {
		System.out.println("**** 9. Replace lower case with upper case and vice versa. ****");
		String s = "A_mItShaaRRMa_@";
		System.out.println("Original string = "+s);
		
		StringBuffer str = new StringBuffer(s);
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				str.setCharAt(i, Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)) {
				str.setCharAt(i, Character.toUpperCase(ch));
			}else {
				str.setCharAt(i, ch);
			}
		}
		System.out.println("New string = "+str);
		System.out.println("-------------------------------------------------------------------");
	}

	public void _10Reverse_a_string() {
		System.out.println("**** 10. Reverse a string. ****");
		String s = "Amit Sharma";
		System.out.println("Original string = "+s);
		String reversed = "";
		
		for(int i=s.length()-1; i>=0 ; i--) {
			reversed = reversed + s.charAt(i);
		}
		
		System.out.println("Reversed string = "+reversed);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _11Check_string_pallindrome_or_not() {
		System.out.println("**** 11. Check if a string is pallindrome or not. ****");
		String s = "Nitin";
		s = s.toLowerCase();
		System.out.println("Original string = "+s);
		String reversed = "";
		
		for(int i=s.length()-1; i>=0 ; i--) {
			reversed = reversed + s.charAt(i);
		}
		
		System.out.println("Reversed string = "+reversed);
		
		if(s.equals(reversed)) {
			System.out.println("The above string is palindrome !!");
		}else {
			System.out.println("The above string is not a palindrome !!");
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _15frequency_of_each_character_in_string() {
		System.out.println("**** 15. Find frequency of each character in  a string. ****");
		
		String s = "picture perfect";  
		System.out.println("String is : "+s);
		char[] a = s.toCharArray();
		int fr[] = new int[a.length];
		int visited = -1;
		
		for(int i=0; i<a.length; i++) {
			int count = 1;
			if(a[i]==' ') {			//condition to handle spaces
				fr[i]=visited;
			}
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		
		System.out.println("Frequency of each characters ::");
		for(int k=0; k<fr.length; k++) {
			if(fr[k]!=visited && fr[k]!=' ') {
				System.out.println(a[k] + " | "+ fr[k]);
			}
		}
		
		
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _16Find_most_repeated_word_in_a_text_file() throws IOException {
		System.out.println("**** 16. Find most repeated word in a text file. ****");
		
		String line;
		String combinedLine = "";
		
		FileReader fs = new FileReader(System.getProperty("user.dir")+"\\resources\\testFile.txt");
		BufferedReader bf = new BufferedReader(fs);
		System.out.println("Contents of files are ::");
		
		String[] words;
		while((line = bf.readLine())!=null) {
			combinedLine = combinedLine + line;
		}
		System.out.println(combinedLine);
		words = combinedLine.toLowerCase().split("([,.\\s]+) ");
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		
		int fr[] = new int[words.length];
		int visited = -1;
		
		for(int i=0; i<words.length; i++) {
			int count = 1;
			if(words[i]==" ") {			//condition to handle spaces
				fr[i]=visited;
			}
			for(int j=i+1; j<words.length; j++) {
				if(words[i]==words[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		
		System.out.println("Frequency of each characters ::");
		for(int k=0; k<fr.length; k++) {
			if(fr[k]!=visited && fr[k]!=' ') {
				System.out.println(words[k] + " | "+ fr[k]);
			}
		}
		
		
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _17Count_total_number_of_words_in_text_file() throws IOException {
		System.out.println("**** 17. Count total number of words in a text file. ****");
		
		String line;
		int count=0;
		
		FileReader fs = new FileReader(System.getProperty("user.dir")+"\\resources\\testFile.txt");
		BufferedReader bf = new BufferedReader(fs);
		System.out.println("Contents of files are ::");
		
		while((line = bf.readLine())!=null) {
			System.out.println(line);
			String[] words = line.split(" ");
			count = count + words.length;
		}
		
		System.out.println("Total number of words = "+count);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _18Swap2_string_variables_without_using_temp_or_third_variable() {
		System.out.println("**** 18. Swap 2 string variables without using temp or third variable. ****");
		String firstName = "Amit";
		String lastName = "Sharma";
		System.out.println("String before Swap :: firstName = "+firstName+" & lastName = "+ lastName);
		int a = firstName.length();
		int b = lastName.length();
		
		firstName = firstName+lastName;
		lastName = firstName.substring(0, a);
		firstName = firstName.substring(a);
		System.out.println("String after Swap :: firstName = "+firstName+" & lastName = "+ lastName);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void _19Reverse_string_in_java_word_by_word() {
		System.out.println("**** 19. Reverse string in java word by word. ****");
		String s = "Amit Sharma is a good boy";
		
		System.out.println("String is : "+s);
		String[] split = s.split(" ");
		System.out.println("Reversed string word by word is :: ");
		for(int i=split.length-1; i>=0; i--) {
			System.out.print(split[i]+ " ");
		}
		System.out.println("\n-------------------------------------------------------------------");
	}
	
	public void _21PercentageOfUpper_Lower_Digits_SpecialChars() {
		System.out.println("**** 21 Find % of uppercase, lowercase, digits and special characters. ****");
		String s = "AmitSharma@12345@6754!@#$%^&*UiP";
		System.out.println("String is : "+s);
		int length = s.length();
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int specialCharacters = 0;
		
		for(int i=0; i<length; i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println("Character at "+i+ " index is "+ ch+ " , its a Upper case letter");
				upperCase++;
			}else if(Character.isLowerCase(ch)){
				System.out.println("Character at "+i+ " index is "+ ch+ " , its a lower case letter");
				lowerCase++;
			}else if(Character.isDigit(ch)) {
				System.out.println("Character at "+i+ " index is "+ ch+ " , its a digit letter");
				digits++;
			}else {
				System.out.println("Character at "+i+ " index is "+ ch+ " , its a special char letter");
				specialCharacters++;
			}
		}
		System.out.println("Total Upper case = "+ upperCase);
		System.out.println("Total lower case = "+ lowerCase);
		System.out.println("Total digits = "+ digits);
		System.out.println("Total special case = "+ specialCharacters);
		
		double upperPerc = (upperCase*100)/length;
		double lowerPerc = (lowerCase*100)/length;
		double digitsPerc = (digits*100)/length;
		double specialPerc = (specialCharacters*100)/length;
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("% for Upper case : "+ formatter.format(upperPerc));
		System.out.println("% for lower case : "+ formatter.format(lowerPerc));
		System.out.println("% for digits : "+ formatter.format(digitsPerc));
		System.out.println("% for special chars : "+ formatter.format(specialPerc));
		System.out.println("-------------------------------------------------------------------");
	}

}
