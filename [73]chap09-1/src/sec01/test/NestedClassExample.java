package sec01.test;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		Car.Engine engin = new Car.Engine();
	}

}
