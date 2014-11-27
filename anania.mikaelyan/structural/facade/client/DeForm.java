package com.synisys.training.patterns.structural.facade.client;

import com.synisys.training.patterns.structural.composite.Entity;
import com.synisys.training.patterns.structural.facade.facade.MailNotificationService;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class DeForm {
    private MailNotificationService mailNotificationService;
    private Entity entity;

    public DeForm(MailNotificationService mailNotificationService) {
        this.mailNotificationService = mailNotificationService;
    }

    public void save(){
        //saves entity data
        mailNotificationService.sendMailNotificationOnEntitySave(entity);
        //other codes skipped
    }
}
