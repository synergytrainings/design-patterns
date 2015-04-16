package com.synisys.training.patterns.behavioral.template;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 4/16/2015
 */
public  class MidInterviewProcessing extends InterviewProcessing{

    @Override
    protected List<String> getTheoreticalQuestions() {
        return Arrays.asList("Synchronization", "Advance Collections", "GC", "equals/hashCode", "Design Patterns Basics");
    }

    @Override
    protected List<String> getPracticalTasks() {
        return Arrays.asList("Implement some collection type", "tree/graph via recursion", "....");
    }
}
