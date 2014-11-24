package com.synisys.training.patterns.structural.decorator.decorator;

import com.synisys.training.patterns.structural.decorator.component.CalendarEvent;

import java.util.Date;

/**
 * ConcreteDecorator - adds responsibilities to the component.
 *
 * @author Anania.Mikaelyan
 * @since 11/24/2014
 */
public class CalendarEventWithNotification extends CalendarEventDecorator {
    private Date notificationTime;

    public CalendarEventWithNotification(CalendarEvent calendarEvent) {
        super(calendarEvent);
    }

    public Date getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(Date notificationTime) {
        this.notificationTime = notificationTime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Calendar Event Notification will be at " + getTime());
    }
}
