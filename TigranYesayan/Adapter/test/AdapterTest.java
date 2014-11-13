package com.synisys.trainings.Adapter.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.synisys.trainings.Adapter.MessageInLanguageAdapter;
import com.synisys.trainings.Adapter.MessageClass;

public class AdapterTest {

	private MessageClass messageText;

	@Before
	public void setMessage() {
		messageText = new MessageClass();
		messageText.setMessageText("Hello");
	}

	@Test
	public void testCheck()
			throws Exception {
		Assert.assertEquals("Hello in Armenian is Barev",
				(new MessageInLanguageAdapter(messageText)).getMessageArmenian(), "Barev");
		Assert.assertEquals("Hello in Russian is Privet",
				(new MessageInLanguageAdapter(messageText)).getMessageRussian(), "Privet");
	}

}
