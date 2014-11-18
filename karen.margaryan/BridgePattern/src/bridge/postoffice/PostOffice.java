package bridge.postoffice;

import bridge.transportation.Transportation;

/**
 * Post office which has different services such as communal fees payment,
 * sending mails, packages etc
 * 
 * @author Karen
 * 
 */
public class PostOffice {
	Transportation transportation = null;

	public PostOffice() {

	}

	/**
	 * Sets transportation method
	 * 
	 * @param transportation
	 *            transportation method
	 */
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}

	/**
	 * Pays communal fees such us electricity, water, gas etc
	 * 
	 * @param forAddress
	 *            apartment address
	 * @param purpose
	 *            purpose of the payment
	 * @param amount
	 *            total amount of money
	 */
	public void payCommunalFees(String forAddress, String purpose, double amount) {
		System.out.printf("Communal '%s' payment received (address=%s, amount=%f drams)\n",
						purpose, forAddress, amount);
	}

	/**
	 * Sends paper based mails
	 * 
	 * @param from
	 *            source location
	 * @param to
	 *            destination location
	 */
	public void sendMail(String from, String to) {
		transportation.transport(from, to);
	}

	/**
	 * Sends packages
	 * 
	 * @param from
	 *            source location
	 * @param to
	 *            destination location
	 */
	public void sendPackage(String from, String to) {
		transportation.transport(from, to);
	}
}
