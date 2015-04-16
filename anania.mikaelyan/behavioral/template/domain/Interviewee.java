package com.synisys.training.patterns.behavioral.template.domain;

import java.io.File;

/**
 * @author Anania.Mikaelyan
 * @since 4/16/2015
 */
public class Interviewee extends Person{
    private final File intervieweeResume;
    public Interviewee(String name, String phoneNumber,  Level level, File intervieweeResume) {
        super(name, phoneNumber, level);
        this.intervieweeResume = intervieweeResume;
    }
    public File getIntervieweeResume() {
        return intervieweeResume;
    }

}
