package com.synisys.training.patterns.facade;


import java.io.InputStream;
import java.util.Date;

/**
 * Interface for posting in social networks.
 */
public interface SocialNetworkPublisher {

	void postInFacebook(String message, InputStream imageStream, AccessToken accessToken);

	void newEventInFacebook(String title, Date start, Date end, AccessToken accessToken);

	void updateTwitterStatus(String status,  InputStream imageStream, AccessToken accessToken);

}
