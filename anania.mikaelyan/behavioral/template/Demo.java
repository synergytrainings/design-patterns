package com.synisys.training.patterns.behavioral.template;

import com.synisys.training.patterns.behavioral.template.domain.Interviewee;
import com.synisys.training.patterns.behavioral.template.domain.Interviewer;
import com.synisys.training.patterns.behavioral.template.domain.Level;

import java.util.*;

/**
 * @author Anania.Mikaelyan
 * @since 4/17/2015
 */
public class Demo {
    public static void main(String[] args) {
        Queue<Interviewee> interviewees = new LinkedList<>();
        interviewees.add(new Interviewee("Joshua Bloch", "732-757-2923", Level.MID, null));
        Map<Level, Set<Interviewer>> interviewersByLevel =  new HashMap<>();
        InterviewProcessing interviewProcessing = new MidInterviewProcessing();
        interviewProcessing.processInterview(interviewees, interviewersByLevel);
    }
}
