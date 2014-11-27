package com.synisys.training.patterns.structural.facade.subsystem.mailing;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class MailService {
    private final MailDao mailDao;

    public MailService(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    public HostParams loadHostParams() {
        return mailDao.loadHostParams();
    }
}
