package com.synisys.training.patterns.behavioral.interpreter.context;

/**
 * @author Anania.Mikaelyan
 * @since 12/19/2014
 */
public class Project {
    private final String title;
    private final Organisation organisation;

    public Project(String title, Organisation organisation) {
        this.title = title;
        this.organisation = organisation;
    }

    public String getTitle() {
        return title;
    }


    public Organisation getOrganisation() {
        return organisation;
    }
}
