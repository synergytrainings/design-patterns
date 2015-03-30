package com.synisys.training.patterns.mediator.impl;

import com.synisys.training.patterns.mediator.api.Notification;
import com.synisys.training.patterns.mediator.api.NotificationInfo;
import com.synisys.training.patterns.mediator.api.NotificationType;

public class NotificationImpl implements Notification {

	private NotificationType notificationType;
	private NotificationInfo notificationInfo;


	public NotificationImpl(NotificationType notificationType, NotificationInfo notificationInfo) {
		this.notificationType = notificationType;
		this.notificationInfo = notificationInfo;
	}


	@Override
	public NotificationType getNotificationType() {
		return notificationType;
	}

	@Override
	public NotificationInfo getNotificationInfo() {
		return notificationInfo;
	}
}
