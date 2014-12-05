package com.synisys.design_patterns.proxy;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by haykanush.torchyan on 12/4/2014.
 */
public class CalendarForm {

    private List<AppointmentProxy> appointmentList;

    public CalendarForm(){
    }

    public void clickDate(Date selectedDate){
        appointmentList = new ArrayList<AppointmentProxy>();
        // load appointments for the selected date (only id, subject)
        List<ResultSetRow> rows = DAO.executeQuery("SELECT ID, Subject FROM Appointments WHERE StartDate<=" + selectedDate + " AND EndDate>=" + selectedDate);
        for(ResultSetRow row : rows){
            Integer id = row.getInt("ID");
            String subject = row.getString("Subject");
            AppointmentProxy appointmentProxy = new AppointmentProxy(id, subject);
            appointmentList.add(appointmentProxy);
        }
        showAppointmentList();
    }

    public void showAppointmentList(){
        // show appointment subjects below the calendar
    }

    public List<AppointmentProxy> getAppointmentList(){
        return appointmentList;
    }
}
