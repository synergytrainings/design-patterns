package com.synisys.training.patterns.structural.decorator.component;

import java.util.Date;

/**
 * Component  - Defines the interface for objects that can have responsibilities added to them dynamically
 *
 * @author Anania.Mikaelyan
 * @since 11/24/2014
 */
public abstract class CalendarEvent {
    private final Date time;
    private final String title;

    protected CalendarEvent(Date time, String title) {
        this.time = time;
        this.title = title;
    }

    public abstract void display();

    public Date getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

}
