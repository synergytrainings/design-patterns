package com.synisys.design_patterns.proxy;

import java.util.Date;

/**
 * Created by haykanush.torchyan on 12/4/2014.
 */
public class Test {

    public static void main(String... args){
        CalendarForm calendarForm = new CalendarForm();
        calendarForm.clickDate(new Date(System.currentTimeMillis()));

        // suppose the user clicks the 3-rd appointment of the selected date to see its details
        calendarForm.getAppointmentList().get(2).preview();
        // the real Appointment object is loaded on this action to display its data in subform
        // thus fully loading only those appointments which are selected by the user
    }
}
