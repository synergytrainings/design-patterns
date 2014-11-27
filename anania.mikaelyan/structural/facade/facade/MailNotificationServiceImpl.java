package com.synisys.training.patterns.structural.facade.facade;

import com.synisys.training.patterns.structural.composite.Entity;
import com.synisys.training.patterns.structural.facade.subsystem.mailing.MailSender;
import com.synisys.training.patterns.structural.facade.subsystem.notification.NotificationService;

/**
 * Facade ? The class for clients to use.
 * It knows about the subsystems it uses and their respective responsibilities.
 * Normally all client requests will be delegated to the appropriate subsystems.
 *
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class MailNotificationServiceImpl implements MailNotificationService{
    private final MailSender mailSender;
    private final NotificationService notificationService;

    public MailNotificationServiceImpl(MailSender mailSender, NotificationService notificationService) {
        this.mailSender = mailSender;
        this.notificationService = notificationService;
    }

    public boolean sendMailNotificationOnEntitySave(Entity entity){
        if(notificationService.isNotificationsEnabled() &&
           notificationService.isNotificationOnSaveEnabled()){
            return  mailSender.send(notificationService.getOnSaveNotificationMail());
        }
        return false;
    }
}
