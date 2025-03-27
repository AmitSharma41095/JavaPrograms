package miscellaneous_RahulShetty;

public class StringsDemo {

	public static void main(String[] args) {
		
		//using string literal : if we have another variable String b = "hello" then new space in memory will not be created. 
		//Instead b will point to the value "hello"
		String a = "Hello";
		String b = "Hello";
		
		//using new keyword
		String s1 = new String("hello");
		
		//Immutable : the value that cannot be changed or altered.
		a.concat(" World!!");
		System.out.println(a); //Hello : since strings are immutable in java. we cannot change the value of a as b is also pointing to value of a.

		//assigning value to new variable
		String c = a.concat(" World!!") ;
		System.out.println(c); //Hello World!!
		
		//For making string mutable - 2 classes String Buffer and String Builder
		//String buffer - Thread safe or synchronized
		//String builder - Not thread safe or non synchronized (Faster than String buffer)
		
		//String buffer class
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World!!");
		System.out.println(sb); //Hello World!!
		//1. Insert some characters between strings
		sb.insert(2, "She");
		System.out.println(sb); //HeShello World!!
		//2. Replace characters (StartIndex (Inclusive), EndIndex (Exclusive), Value)
		sb.replace(5, 7, "aa");
		System.out.println(sb); //HeSheaao World!!
		//3. Delete the character at index
		sb.deleteCharAt(7);
		System.out.println(sb); //HeSheaa World!!
		//4. revrese the string
		sb.reverse();
		System.out.println(sb); //!!dlroW aaehSeH
		
		
		//string builder - same methods as string buffer
		
		
		//string comparison
		//.equals (compares the content)
		// == (compares the reference)
		
		String a1 = "Amit";
		String b1 = "Amit";
		String c1 = new String("Amit");
		String d1 = new String("Amit");
		
		System.out.println(a1.equals(b1)); //true
		System.out.println(a1.equals(c1)); //true
		
		System.out.println(a1==b1); //true
		System.out.println(a1==c1); //false
		System.out.println(c1==d1); //false
		
		
		
		
		

	}

}
