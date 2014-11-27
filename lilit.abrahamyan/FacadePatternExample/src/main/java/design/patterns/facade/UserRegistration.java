package design.patterns.facade;

/**
 * Class(facade) responsible for registration of user
 * 
 * @author lilit.abrahamyan
 * 
 */
public class UserRegistration {

	private User user;
	private EmailGenerator emailGenerator;
	private MailSender mailSender;

	public UserRegistration(User user, EmailGenerator emialGenerator,
			MailSender mailSender) {
		this.user = user;
		this.emailGenerator = emialGenerator;
		this.mailSender = mailSender;
	}

	public String registrateUser() {
		// Register user's data (save in DB)...

		// generate and send an email to newly registered user

		String messageBody = emailGenerator.generateEmailBody(user);

		mailSender.sendNotification(user, messageBody);
		
		return messageBody;
	}

}
