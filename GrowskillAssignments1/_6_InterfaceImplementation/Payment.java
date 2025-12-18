package _6_InterfaceImplementation;

public interface Payment {
	
	public abstract void makePayment();

}

class UPI implements Payment{

	@Override
	public void makePayment() {
		System.out.println("I am making UPI payments......");
	}
	
}

class CreditCard implements Payment{
	
	@Override
	public void makePayment() {
		System.out.println("I am making Creadit Card payments......");
	}
	
}


