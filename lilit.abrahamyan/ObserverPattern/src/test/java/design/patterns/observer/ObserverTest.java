package design.patterns.observer;

public class ObserverTest {

	public static void main(String[] args) {
		
		CarRent car1 = new CarRent("A", 2014, false);
		
		Client c1 = new Client();
		Client c2 = new Client();
		
		car1.register(c1);
		car1.register(c2);
		
		car1.setAvailable(true);
	}

}
