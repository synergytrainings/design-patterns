package design.patterns.observer;


public class Client implements Observer {
	
	public Client(){
	}

	public void notifyClients() {
		System.out.println("The car is available for rent");
	}
}