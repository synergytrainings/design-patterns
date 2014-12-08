package test.com.synisys.training.designPatterns;

import static org.junit.Assert.*;
import main.com.synisys.training.designPatterns.*;
import main.com.synisys.training.designPatterns.impl.*;

public class Test {
	
	private String message, disclaimer;

	@org.junit.Before
	public void init(){
		message = "Hi, this is a decorator examile...";
		disclaimer = "\n Synergy International Systems Disclaimer";
	}
	
	@org.junit.Test
	public void test() {
		// create standard email
		Email standardEmail = new StandardEmail(message);
		assertEquals(standardEmail.getContents(), message);
		
		//decorate it with external and secure decorators
		EmailDecorator email = new SecureEmailDecorator(new ExternalEmailDecorator(standardEmail));
		assertEquals(email.getContents(), message + disclaimer);		
	}

}
