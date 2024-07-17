package JavaPrograms;

public class Car {

	int numberOfWheels = 4;
	String Colour = "Red";

	void driving() {
		System.out.println("Car Can Drive!!");
	}

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("Calling with Object1 reference!!");
		car1.driving();
		Car car2 = new Car();
		System.out.println("Calling with Object2 reference!!");
		car2.driving();
		Car car3 = new Car();
		System.out.println("Calling with Object3 reference!!");
		car3.driving();

	}

}
