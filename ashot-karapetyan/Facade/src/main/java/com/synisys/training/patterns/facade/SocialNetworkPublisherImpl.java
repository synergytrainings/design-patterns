package com.synisys.training.patterns.facade;

import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.InputStream;
import java.util.Date;


public class SocialNetworkPublisherImpl implements SocialNetworkPublisher {

	private final FacebookClient facebookClient;
	private final Twitter twitterClient;

	public SocialNetworkPublisherImpl() {
		twitterClient = new TwitterFactory().getInstance();
		facebookClient = new DefaultFacebookClient();
	}


	@Override
	public void postInFacebook(String message, InputStream imageStream, AccessToken accessToken) {
		authenticateInFacebook(accessToken);
		facebookClient.publish("me/photos", FacebookType.class,
				BinaryAttachment.with(message, imageStream),
				Parameter.with("message", message));
	}

	@Override
	public void newEventInFacebook(String title, Date start, Date end, AccessToken accessToken) {
		authenticateInFacebook(accessToken);
		Date tomorrow = new Date(start.getTime());
		Date twoDaysFromNow = new Date(end.getTime());

		facebookClient.publish("me/events", FacebookType.class,
				Parameter.with("name", title), Parameter.with("start_time", tomorrow),
				Parameter.with("end_time", twoDaysFromNow));
	}

	@Override
	public void updateTwitterStatus(String status, InputStream imageStream, AccessToken accessToken) {
		authenticateInTwitter(accessToken);
		StatusUpdate statusUpdate = new StatusUpdate(status);

		if (imageStream != null) {
			statusUpdate.setMedia(status, imageStream);
		}
		try {
			twitterClient.updateStatus(statusUpdate);
		} catch (TwitterException e) {
			throw new RuntimeException(e);
		}


	}

	/**
	 * Authenticates user in Facebook
	 * @throws AuthenticateException if access token is invalid for Facebook
	 */
	private void authenticateInFacebook(AccessToken token) {
		//Authenticate user in Facebook
	}

	/**
	 * Authenticates user in Twitter
	 * @throws AuthenticateException if access token is invalid for Twitter
	 */
	private void authenticateInTwitter(AccessToken token) {
		//Authenticate user in Twitter
	}

	public static class AuthenticateException extends RuntimeException {
		public AuthenticateException() {
			super();
		}

		public AuthenticateException(String message) {
			super(message);
		}
	}
}
