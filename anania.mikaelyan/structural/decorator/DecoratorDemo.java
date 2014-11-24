package com.synisys.training.patterns.structural.decorator;

import com.synisys.training.patterns.structural.decorator.component.CalendarEvent;
import com.synisys.training.patterns.structural.decorator.component.Meeting;
import com.synisys.training.patterns.structural.decorator.component.Task;
import com.synisys.training.patterns.structural.decorator.decorator.CalendarEventWithNotification;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Anania.Mikaelyan
 * @since 11/24/2014
 */
public class DecoratorDemo {
    @Test
    public void demo() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        //create task and display
        Task task = new Task(formatter.parse("25/11/2014 00:00"), "Write email for Armine Meliksetyan birthday");
        task.setPriority(Task.Priority.HIGH);
        task.display();

        //create meeting and display
        Meeting meeting = new Meeting(formatter.parse("25/11/2014 08:55"), "Design patterns training");
        meeting.setLocation(Meeting.Location.CONFERENCE_ROOM_401);
        meeting.display();

        // decorate task with notification and display
        CalendarEventWithNotification taskWithNotification = new CalendarEventWithNotification(task);
        taskWithNotification.setNotificationTime(formatter.parse("24/11/2014 11:59"));
        taskWithNotification.display();

    }
}
