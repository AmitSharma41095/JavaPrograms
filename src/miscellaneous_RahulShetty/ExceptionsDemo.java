package miscellaneous_RahulShetty;

public class ExceptionsDemo {
	
	//if we suspect some scripts to throw exception,
	//we can use Exception handling mechanism using try catch block
	//one try can have multiple catches

	public static void main(String[] args) {

		try {
			int a= 5/0; //arithmetic exception
			//array index out of bound exception
		}catch(ArithmeticException e1) {
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("I am executed every time irrespective of exception as well.");
		}
	}
}
