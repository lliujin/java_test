public class Test {
	public static void main(String args[]) {
		VehicleFactory factory = new CarFactory();
		Moveable car = factory.create();
		car.run();
	}
}