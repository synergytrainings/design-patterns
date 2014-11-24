package com.synisys.training.patterns.structural.decorator.component;

import java.util.Date;

/**
 * ConcreteComponent - defines an object to which additional responsibilities can be attached.
 *
 * @author Anania.Mikaelyan
 * @since 11/24/2014
 */
public class Task extends CalendarEvent {

    private  Priority priority;

    public Task(Date time, String title) {
        super(time, title);
    }


    @Override
    public void display() {
        System.out.println("Tas " + getTitle() + "  starts in " + getTime() + " and has " + getPriority() + " priority ");
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public static enum Priority {HIGH, MEDIUM, LOW}
}

