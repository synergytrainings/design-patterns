package com.synisys.training.patterns.mediator.api;


public interface Notification {
	NotificationType getNotificationType();

	NotificationInfo getNotificationInfo();
}
