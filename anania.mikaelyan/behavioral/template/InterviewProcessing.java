package com.synisys.training.patterns.behavioral.template;
import com.synisys.training.patterns.behavioral.template.domain.Interview;
import com.synisys.training.patterns.behavioral.template.domain.Interviewee;
import com.synisys.training.patterns.behavioral.template.domain.Interviewer;
import com.synisys.training.patterns.behavioral.template.domain.Level;

import java.util.*;

/**
 * @author Anania.Mikaelyan
 * @since 4/16/2015
 */
public abstract class InterviewProcessing {
    private final Interviewer SYSTEM_ARCHITECT = new Interviewer("Hayk Martirosyan", "094 531 433", Level.SENIOR);



    private Interview interview;

    public void processInterview(Queue<Interviewee> interviewees, Map<Level, Set<Interviewer>> interviewersByLevel){
        organizeInterview(interviewees, interviewersByLevel);
        processTechnicalInterview();
        precessFeedback();
    }

    protected void organizeInterview(Queue<Interviewee> interviewees, Map<Level, Set<Interviewer>> interviewersByLevel) {
        Interviewee interviewee = interviewees.poll();
        List<Interviewer> interviewers = resolveInterviewers(interviewee);
        Date interviewDate = resolveInterviewTime();
        interview = new Interview(interviewDate, interviewee, interviewers);
    }




    private void processTechnicalInterview() {
        //say hello
        goOverResume();
        goOverTheoreticalQuestions();
        goOverPracticalTasks();
        //say goodbye
    }



    private void goOverTheoreticalQuestions() {
        for(String question : getTheoreticalQuestions()){
            System.out.println(question);
        }
    }



    private void goOverPracticalTasks() {
        for(String task : getPracticalTasks()){
            System.out.println(task);
        }
    }

    protected abstract List<String> getTheoreticalQuestions();
    protected abstract List<String> getPracticalTasks();

    private void goOverResume() {
        //over resume
    }


    private void precessFeedback() {
        //implementation skipped
    }

    protected Date resolveInterviewTime() {
        //implementation skipped
        return new Date();
    }

    protected List<Interviewer> resolveInterviewers(Interviewee interviewee) {
        return Arrays.asList(SYSTEM_ARCHITECT);
    }


}
