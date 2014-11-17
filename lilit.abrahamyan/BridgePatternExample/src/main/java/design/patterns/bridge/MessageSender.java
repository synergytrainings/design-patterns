package design.patterns.bridge;

/**
 * Concrete implementor class for sending messages to bank's users
 * 
 * @author lilit.abrahamyan
 * 
 */
public class MessageSender implements NotificationSender {

	@Override
	public void sendNotification(Contact contact) {
		String phoneNumber = contact.getPhoneNumber();
		// send message notification to this phone number
		System.out.print("Message sent to " + phoneNumber);

	}

}
