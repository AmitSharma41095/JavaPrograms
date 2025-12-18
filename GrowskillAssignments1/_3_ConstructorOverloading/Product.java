package _3_ConstructorOverloading;

public class Product {
	
	public int productId;
	public String productName;
	public int price;
	
	public Product(){
		System.out.println("Default Constructor called........");
		System.out.println("Product Created");
	}
	
	public Product(int productId, String productName, int price){
		System.out.println("Parametrized Constructor called........");
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	public void displayProduct() {
		System.out.println("Product details :: Product id = "+ productId + " , Product Name = " + productName + " , Price = " + price);
	}
	
	public static void main(String[] args) {
		Product product = new Product();
		product.displayProduct();
		
		System.out.println("------------------------------------------------------");
		Product product1 = new Product(1,"I-Pad",50000);
		product1.displayProduct();
		
		System.out.println("------------------------------------------------------");
		Product product2 = new Product(2,"Samsung",30000);
		product2.displayProduct();
	}
	

}
