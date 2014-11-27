package com.synisys.training.patterns.structural.facade.subsystem.notification;

import com.synisys.training.patterns.structural.facade.facade.MailNotificationService;
import com.synisys.training.patterns.structural.facade.subsystem.mailing.Mail;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class NotificationService {
    private final NotificationDao notificationDao;

    public NotificationService(NotificationDao notificationDao) {
        this.notificationDao = notificationDao;
    }

    public boolean isNotificationsEnabled() {
        return notificationDao.isNotificationsEnabled();
    }

    public boolean isNotificationOnSaveEnabled() {
        return notificationDao.isNotificationOnSaveEnabled();
    }

    public Mail getOnSaveNotificationMail() {
        return notificationDao.getOnSaveNotificationMail();
    }
}
