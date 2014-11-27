package com.synisys.training.patterns.structural.facade;

import com.synisys.training.patterns.structural.facade.client.DeForm;
import com.synisys.training.patterns.structural.facade.facade.MailNotificationService;
import com.synisys.training.patterns.structural.facade.facade.MailNotificationServiceImpl;
import com.synisys.training.patterns.structural.facade.subsystem.mailing.MailDao;
import com.synisys.training.patterns.structural.facade.subsystem.mailing.MailSender;
import com.synisys.training.patterns.structural.facade.subsystem.mailing.MailService;
import com.synisys.training.patterns.structural.facade.subsystem.notification.NotificationDao;
import com.synisys.training.patterns.structural.facade.subsystem.notification.NotificationService;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class FacadeDemo {
    DeForm deForm;
    @Before
    public void initSubSystems(){
        //init mailing subsystem
        MailDao mailDao = new MailDao();
        MailService mailService = new MailService(mailDao);
        MailSender mailSender = new MailSender(mailService);

        //init notification subsystem
        NotificationDao notificationDao = new NotificationDao();
        NotificationService notificationService = new NotificationService(notificationDao);

        //init de Facade
        MailNotificationService mailNotificationService = new MailNotificationServiceImpl(mailSender, notificationService);

        //init client
        deForm = new DeForm(mailNotificationService);
    }

    @Test
    public void testFacade(){
        deForm.save();
    }

}
