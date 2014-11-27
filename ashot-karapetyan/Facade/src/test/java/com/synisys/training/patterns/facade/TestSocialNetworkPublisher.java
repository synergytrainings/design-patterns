package com.synisys.training.patterns.facade;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;


public class TestSocialNetworkPublisher {

	SocialNetworkPublisher networkPublisher;

	@Before
	public void setUp() {
		networkPublisher = new SocialNetworkPublisherImpl();
	}

	@Test
	public void testPosts() {
		networkPublisher.postInFacebook("Hi everyone!", getTestImageStream(), getAccessToken());
	}

	@Test
	public void testEvent() {
		Date start = new Date();
		Date end = new Date(start.getTime() + 24 * 60 * 60 * 1000);
		networkPublisher.newEventInFacebook("Great Event", start, end, getAccessToken());

	}


	@Test
	public void testTwitterStatus() {
		networkPublisher.updateTwitterStatus("My new status!", null, getAccessToken());
	}


	private AccessToken getAccessToken() {
		//return dummy token
		return null;
	}

	private InputStream getTestImageStream() {
		// return dummy stream
		return null;
	}
}
