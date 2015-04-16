package com.synisys.training.patterns.behavioral.template.domain;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 4/16/2015
 */
public class Interview {
    private Date time;
    private final Interviewee interviewee;
    private final List<Interviewer> interviewers;


    public Interview(Date time,Interviewee interviewee, List<Interviewer> interviewers) {
        this.time = time;
        this.interviewee = interviewee;
        this.interviewers = interviewers;
    }

    public void changeTime(Date time) {
        this.time = time;
    }
}
