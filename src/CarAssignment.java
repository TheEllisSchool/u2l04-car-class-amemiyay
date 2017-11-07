
public class CarAssignment {

	public static void main(String[] args) {
		//create car object
		Car car1 = new Car("2007 Focus", "Ford");
		
		
		//call acceleration 5 times (loop)
		for (int i = 0; i < 5; i++) {
			car1.accelerate();
			System.out.println("Current speed: " + car1.getSpeed());
		}
		
		//call break 5 times (loop)
		for (int i = 0; i < 5; i++) {
			car1.breakc();
			System.out.println("Current speed: " + car1.getSpeed());
		}
	}

}
