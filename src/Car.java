
public class Car {
	//attributes
	private String yearModel;
	private String make;
	private int speed;
	
	//methods
	//constructor
	public Car (String ym, String m) {
		yearModel = ym;
		make = m;
		speed = 0;
	}
	//setters for speed restrict it to -150 to 150
	public void setSpeed(int s) {
		if (s > -150 && s < 150) {
			speed = s;
		} else {
			System.out.println("You're going too fast!");
		}
	}
	
	//getters for everything
	public String getYearM() {
		return yearModel;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	//accelerate
	
	public void accelerate() {
		int tempS = speed;
		tempS += 5;
		setSpeed(tempS);
	}
	
	//break
	
	public void breakc() {
		int tempS = speed;
		tempS -= 5;
		setSpeed(tempS);
	}

}
