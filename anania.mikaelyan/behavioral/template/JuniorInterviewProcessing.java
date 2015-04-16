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
public  class JuniorInterviewProcessing extends InterviewProcessing{

    @Override
    protected List<String> getTheoreticalQuestions() {
        return Arrays.asList("OOP-inc/inh/pol", "Class vs Interface", "static, final, abstract", "Primitives", "Collection basics");
    }

    @Override
    protected List<String> getPracticalTasks() {
        return Arrays.asList("a <-> b", "factorial via recursion", "....");
    }
}
