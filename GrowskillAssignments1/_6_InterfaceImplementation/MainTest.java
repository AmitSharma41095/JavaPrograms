package _6_InterfaceImplementation;

public class MainTest {

	public static void main(String[] args) {
		Payment u = new UPI();
		u.makePayment();
		
		Payment c1 = new CreditCard();
		c1.makePayment();

	}

}
