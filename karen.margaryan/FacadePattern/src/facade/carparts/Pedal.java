package facade.carparts;

/**
 * Car pedal block with some functionality
 * @author Karen
 *
 */
public class Pedal {
	private String name;

	public Pedal(String pedalName) {
		this.name = pedalName;
	}
	
	
	/**
	 * Presses pedal softly (a little)
	 */
	public void push() {
		System.out.println("PEDAL-BLOCK: Pedal " + name + " is pressed");
	}

	/**
	 * Presses pedal hardly (almost till the end)
	 */
	public void takeOff() {
		System.out.println("PEDAL-BLOCK: Pedal " + name + " is not pressed anymore");
	}

	
	/**
	 * Presses pedal hardly (till the end)
	 */
	public void doForsage() {
		//TODO: implement the code
	}

}
