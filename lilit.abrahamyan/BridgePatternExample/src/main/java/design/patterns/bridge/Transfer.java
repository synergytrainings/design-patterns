package design.patterns.bridge;

/**
 * Abstraction class for bank transfers
 * 
 * @author lilit.abrahamyan
 * 
 */
public abstract class Transfer {
	/**
	 * Notification sender instance
	 */
	private NotificationSender ns;

	/**
	 * Constructor
	 * 
	 * @param ns
	 *            {@link NotificationSender} instance
	 */
	public Transfer(NotificationSender ns) {
		this.ns = ns;
	}

	/**
	 * Getter for {@link NotificationSender} instance
	 * 
	 * @return
	 */
	protected NotificationSender getNotificationSender() {
		return ns;
	}

	/**
	 * Executes money transfer and sends notification
	 */
	public abstract void transfer(double money);

}
