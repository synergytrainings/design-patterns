package com.synisys.design_patterns.proxy;

import sun.jdbc.odbc.JdbcOdbcConnection;

import java.sql.Connection;
import java.util.Date;

/**
 * Created by haykanush.torchyan on 12/4/2014.
 */
public class AppointmentProxy extends CalendarItem {

    private Appointment appointment;
    private Integer id;
    private String subject;

    public AppointmentProxy(Integer id, String subject){
        this.id = id;
        this.subject = subject;
    }

    @Override
    public void preview(){
        if(appointment==null){
            appointment = new Appointment(id, subject);
            // load the rest appointment data from db;
        }
        appointment.preview();
    }

}
