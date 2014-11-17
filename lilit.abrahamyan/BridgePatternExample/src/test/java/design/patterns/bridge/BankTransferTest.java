package design.patterns.bridge;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTransferTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	
	@Test
	public void testBridgePattern(){

		
		Contact contact1 = new Contact("John", "Smith", "js@gmail.com", "0123456789");
		Contact contact2 = new Contact("Ann", "Smith", "as@gmail.com", "9876543210");
		
		SalaryTransfer transfer = new SalaryTransfer(new MailSender(), contact1);
		transfer.transfer(100000);
		
		SalaryTransfer transfer2 = new SalaryTransfer(new MessageSender(), contact2);
		transfer2.transfer(200000);
		
		Assert.assertEquals("Email sent to " + contact1.getEmail() + "Message sent to " + contact2.getPhoneNumber(), outContent.toString());
		
		
	}
}
