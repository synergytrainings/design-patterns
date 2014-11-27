package design.patterns.facade;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	@Test
	public void testBridgePattern(){

		
		User user = new User("John", "Smith", "js@gmail.com", "js", "js");
		
		UserRegistration userRegistration = new UserRegistration(user, new EmailGenerator(), new MailSender());
		
		String sentEmail = userRegistration.registrateUser();
		
		StringBuilder messageBody = new StringBuilder();
		messageBody.append(EmailGenerator.STR_DEAR);
		messageBody.append(user.getFirstName() + " ");
		messageBody.append(user.getLastName());
		messageBody.append(EmailGenerator.STR_BODY);
		Assert.assertEquals(sentEmail, messageBody.toString());
		
		
	}
}
