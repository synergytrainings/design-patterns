package com.synisys.training.patterns.structural.decorator.decorator;

import com.synisys.training.patterns.structural.decorator.component.CalendarEvent;

/**
 * Decorator - maintains a reference to a Component object and defines an interface that conforms to Component's interface.
 * @author Anania.Mikaelyan
 * @since 11/24/2014
 */
public abstract class CalendarEventDecorator extends CalendarEvent{
    private final CalendarEvent calendarEvent;

    public CalendarEventDecorator(CalendarEvent calendarEvent) {
        super(calendarEvent.getTime(), calendarEvent.getTitle());
        this.calendarEvent = calendarEvent;
    }


    @Override
    public void display() {
        calendarEvent.display();
    }
}
