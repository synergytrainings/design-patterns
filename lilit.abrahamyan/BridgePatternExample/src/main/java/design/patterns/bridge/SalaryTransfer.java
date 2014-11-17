package design.patterns.bridge;

/**
 * Refined abstraction, class for implementing salary transfers for bank user's
 * 
 * @author lilit.abrahamyan
 * 
 */
public class SalaryTransfer extends Transfer {

	private Contact contact;

	/**
	 * Constructor
	 * 
	 * @param ns
	 *            {@link NotificationSender} instance
	 * @param contact
	 *            user's contact information
	 */
	public SalaryTransfer(NotificationSender ns, Contact contact) {
		super(ns);
		this.contact = contact;
	}

	@Override
	public void transfer(double money) {
		// execute bank transfer and sends notification
		getNotificationSender().sendNotification(contact);

	}

}
