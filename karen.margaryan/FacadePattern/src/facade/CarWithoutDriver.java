package facade;

import facade.carparts.Engine;
import facade.carparts.Pedal;
import facade.carparts.Transmission;

public class CarWithoutDriver {
	private Engine engine;
	private Transmission transmission;
	private Pedal accelirationPedal;
	private Pedal breakPedal;
	
	public CarWithoutDriver() {
		engine = new Engine();
		transmission = new Transmission();
		accelirationPedal = new Pedal("accelirator");
		breakPedal = new Pedal("break");
	}
	
	public void go() {
		engine.start();
		engine.warmUp();
		transmission.setStep(1);
		accelirationPedal.push();
	}
	
	public void park() {
		accelirationPedal.takeOff();
		breakPedal.push();
		// wait until car is stopped
		engine.turnOff();
	}
	
}
