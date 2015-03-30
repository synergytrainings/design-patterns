package com.synisys.training.patterns.mediator;

import com.synisys.training.patterns.mediator.api.Notification;
import com.synisys.training.patterns.mediator.api.NotificationType;
import com.synisys.training.patterns.mediator.api.SharingType;
import com.synisys.training.patterns.mediator.impl.NotificationImpl;
import com.synisys.training.patterns.mediator.impl.NotificationInfoImpl;

import java.util.List;


public class NotificationCenter {


	public void sharePicture(User user, long pictureId, SharingType sharingType) {
		if (sharingType == SharingType.FRIENDS) {
			Notification notification = new NotificationImpl(NotificationType.RESOURCE_SHARING,
					new NotificationInfoImpl(String.format("User %s share picture with you!", user.getName())));
			for (User friend : getAllFriends(user)) {
				friend.receiveNotification(notification);
			}
		}
	}

	public void tagUserOnResource(User user, String imageUrl, long tagedUserId) {
		User taggedUser = getUserById(tagedUserId);
		Notification notification = new NotificationImpl(NotificationType.RESOURCE_SHARING,
				new NotificationInfoImpl(String.format("User %s tag you !", user.getName())));
		taggedUser.receiveNotification(notification);
	}

	private List<User> getAllFriends(User user) {
		//load all friends
		throw new UnsupportedOperationException("Not implemented yet");
	}

	private User getUserById(long id) {
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
