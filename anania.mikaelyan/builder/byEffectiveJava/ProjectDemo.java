package com.synisys.training.patterns.abstractfactory.builder.byEffectiveJava;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Anania.Mikaelyan
 * @since 11/3/2014
 */
public class ProjectDemo {
    public static void main(String[] args) {
        Project project = new Project.Builder(1, "title1").notes("description").
                notes("some notes").startDate(new Date()).totalCommitment(BigDecimal.TEN).build();
        System.out.println(project);
    }
}
