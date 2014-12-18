package com.synisys.training.patterns.behavioral.interpreter.context;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 12/18/2014
 */
public class DataContext {
    private static List<Project> data = new ArrayList<Project>(5);
    public List<Project> getAllProjects() {
        return data;
    }
    static{
        data.add(new Project("Project1", new Organisation("Org1")));
        data.add(new Project("Project2", new Organisation("Org2")));
        data.add(new Project("Project3", new Organisation("Org3")));
        data.add(new Project("Project4", new Organisation("Org4")));
        data.add(new Project("Project5", new Organisation("Org5")));
    }

}
