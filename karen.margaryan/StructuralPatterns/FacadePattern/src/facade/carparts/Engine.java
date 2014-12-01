package facade.carparts;

/**
 * Car engine block with some functionality
 * @author Karen
 *
 */
public class Engine {

	/**
	 * Starts engine
	 */
	public void start() {
		System.out.println("ENGING-BLOCK: engine is starting");
	}
	
	/**
	 * Turns off the engine
	 */
	public void turnOff() {
		System.out.println("ENGING-BLOCK: engine is turning off");
	}


	/**
	 * Warming up engine automatically setting engine RPMs
	 */
	public void warmUp() {
		System.out.println("ENGING-BLOCK: engine is warming up");
	}

}
