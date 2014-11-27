package design.patterns.facade;

/**
 * Sends email to specified user
 * 
 * @author lilit.abrahamyan
 * 
 */
public class MailSender {

	public void sendNotification(User user, String messageBody) {
		String emailAddress = user.getEmail();
		// send email notification to this email address

		System.out.print("Email sent to " + emailAddress + "with content" + messageBody);
	}

}
