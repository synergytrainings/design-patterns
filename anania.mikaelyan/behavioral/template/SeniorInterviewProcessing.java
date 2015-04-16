package com.synisys.training.patterns.behavioral.template;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 4/16/2015
 */
public  class SeniorInterviewProcessing extends InterviewProcessing{

    @Override
    protected List<String> getTheoreticalQuestions() {
        return Arrays.asList("N-tier Architecture concepts", "Scalability", "Advance concurrency", "Advance patters/anti patterns");
    }

    @Override
    protected List<String> getPracticalTasks() {
        return Arrays.asList("Program printintg himself :)");
    }
}
