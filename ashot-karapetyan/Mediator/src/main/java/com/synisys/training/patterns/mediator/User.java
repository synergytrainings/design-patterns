package com.synisys.training.patterns.mediator;


import com.synisys.training.patterns.mediator.api.Notification;
import com.synisys.training.patterns.mediator.api.NotificationInfo;
import com.synisys.training.patterns.mediator.api.NotificationType;
import com.synisys.training.patterns.mediator.api.SharingType;

public class User {

	private long id;
	private String name;
	private NotificationCenter notificationCenter;

	public User(long id, String name, NotificationCenter notificationCenter) {
		this.id = id;
		this.name = name;
		this.notificationCenter = notificationCenter;
	}

	public void addPicture(String url, SharingType sharingType){
		long pictureId = savePicture(url);
		//add to time line
		//...
		notificationCenter.sharePicture(this, pictureId,sharingType);
	}

	public void tagUser(String imageUrl, long tagedUserId){
		//add to time line
		//...
		notificationCenter.tagUserOnResource(this, imageUrl, tagedUserId);
	}



	public void receiveNotification(Notification notification){
		NotificationType notificationType = notification.getNotificationType();
		NotificationInfo info = notification.getNotificationInfo();
		switch (notificationType){
			case FRIEND_REQUEST:
				//action for friend request
				break;
			case RESOURCE_SHARING:
				//action for sharing
				break;
			case TAGGING:
				//action for tagging
				break;
		}
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	private long savePicture(String url) {
		//save picture
		return 0;
	}


}
