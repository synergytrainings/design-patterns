package design.patterns.bridge;

/**
 * Concrete implementor class for sending emails to bank's users
 * 
 * @author lilit.abrahamyan
 * 
 */
public class MailSender implements NotificationSender {

	@Override
	public void sendNotification(Contact contact) {
		String emailAddress = contact.getEmail();
		// send email notification to this email address

		System.out.print("Email sent to " + emailAddress);
	}

}
