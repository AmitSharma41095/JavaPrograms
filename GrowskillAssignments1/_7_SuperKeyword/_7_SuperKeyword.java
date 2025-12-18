package _7_SuperKeyword;

public class _7_SuperKeyword {

	public static void main(String[] args) {
		Person s = new Student();
		System.out.println("---------------------------------");
		Student s1 = new Student();
		System.out.println("---------------------------------");
		Person p1 = new Person();

	}

}

class Person{
	
	public Person() {
		System.out.println("Person Created");
	}
}

class Student extends Person{
	
	public Student(){
		super();
		System.out.println("Student Created");
	}
}
