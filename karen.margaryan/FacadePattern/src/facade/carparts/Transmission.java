package facade.carparts;

/**
 * Car transmission block
 * @author Karen
 *
 */
public class Transmission {

	/**
	 * Keeps the state of the current transmission
	 */
	private int currentStep;
	
	public Transmission() {
		currentStep = 0;
	}
	
	/**
	 * Sets new state of transmission
	 * @param newStep new state number
	 */
	public void setStep(int newStep) {
		System.out.println("TRANSMISSION-BLOCK: a new transmission state is " + newStep);
		this.currentStep = newStep;
	}
	
	/**
	 * Gets current transmission state
	 * @return
	 */
	public int getCurrentStep() {
		return currentStep;
	}

}
