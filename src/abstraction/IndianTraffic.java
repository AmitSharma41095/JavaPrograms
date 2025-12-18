package abstraction;

public class IndianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		IndianTraffic c = new IndianTraffic();
		c.red();
		c.yellow();
		c.green();
		
		IndianTraffic c1 = new IndianTraffic();
		c1.walkOnZebraCross();
	}

	@Override
	public void red() {
		System.out.println("Red : Please stop!!");
		
	}

	@Override
	public void yellow() {
		System.out.println("Yellow : Please be ready to go!!");
		
	}

	@Override
	public void green() {
		System.out.println("Green : Lets gooo!!");
		
	}
	
	public void walkOnZebraCross() {
		System.out.println("Indian rule : Walk on Zebra crossing");
	}

}
