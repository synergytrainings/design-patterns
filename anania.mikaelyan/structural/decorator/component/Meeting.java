package com.synisys.training.patterns.structural.decorator.component;

import java.util.Date;

/**
 * ConcreteComponent - defines an object to which additional responsibilities can be attached.
 * @author Anania.Mikaelyan
 * @since 11/24/2014
 */
public class Meeting extends CalendarEvent {
    private Location location;
    private int duration;

    public Meeting(Date time, String title) {
        super(time, title);
    }


    @Override
    public void display() {
        System.out.println("Meeting " + getTitle() + "  starts in " + getTime() + " will take place in " + getLocation() + " and will long " + getDuration() + " minutes" );
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    public static enum Location{
        CONFERENCE_ROOM_401,
        CONFERENCE_ROOM_601,
        CONFERENCE_ROOM_701,
        CONFERENCE_ROOM_702,
        CONFERENCE_ROOM_801
    }
}

