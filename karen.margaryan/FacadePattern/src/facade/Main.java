package facade;

public class Main {
	public static void main(String[] args) {
		CarWithoutDriver car = new CarWithoutDriver();
		car.go();
		System.out.println("------------------------");
		car.park();
	}
}
