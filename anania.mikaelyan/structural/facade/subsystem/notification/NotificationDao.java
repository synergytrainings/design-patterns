package com.synisys.training.patterns.structural.facade.subsystem.notification;

import com.synisys.training.patterns.structural.facade.subsystem.mailing.Mail;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class NotificationDao {
    public boolean isNotificationsEnabled() {
        return true;
    }

    public boolean isNotificationOnSaveEnabled() {
        return true;
    }

    public Mail getOnSaveNotificationMail() {
        Mail mail = new Mail("O Juliet... It is me, Romeo...", " Kill yourself.","romeo@arm.synisys.com");
        mail.setCc("tatevik.khachatryan@arm.synisys.com");
        mail.setBcc("padre@arm.synisys.com");
        return mail;
    }
}
