package com.synisys.training.patterns.structural.facade.subsystem.mailing;

import com.synisys.training.patterns.structural.bridge.domain.MainEntity;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class MailSender {
    private HostParams hostParams;

    public MailSender(MailService mailService) {
        hostParams = mailService.loadHostParams();
    }

    public boolean send(Mail mail) {
       System.out.println("Sending mail by host params..." + mail);
       return false;
    }

}
