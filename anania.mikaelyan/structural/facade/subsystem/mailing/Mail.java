package com.synisys.training.patterns.structural.facade.subsystem.mailing;

/**
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public class Mail {
    private final String subject;
    private final String body;
    private final String to;
    private String cc;
    private String bcc;

    public Mail(String subject, String body, String to) {
        this.subject = subject;
        this.body = body;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getTo() {
        return to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getBcc() {
        return bcc;
    }
}
