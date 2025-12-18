package _2_Inheritance_MethodOverriding;

public class _2_Inheritance_MethodOverriding {

	public static void main(String[] args) {
		vehicle vehicle = new vehicle();
		vehicle.fuelType();
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.fuelType();

	}

}

class vehicle{
	public void fuelType() {
		System.out.println("Runs on fuel");
	}
}

class ElectricCar extends vehicle{
	public void fuelType() {
		System.out.println("Runs on electricity");
	}
}
