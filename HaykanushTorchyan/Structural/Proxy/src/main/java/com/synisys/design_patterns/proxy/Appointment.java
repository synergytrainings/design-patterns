package com.synisys.design_patterns.proxy;

import com.synisys.design_patterns.proxy.helper.Organisation;

import java.util.Date;
import java.util.List;

/**
 * Created by haykanush.torchyan on 12/4/2014.
 */
public class Appointment extends CalendarItem{

    private Integer id;
    private String subject;
    private String location;
    private Date startDate;
    private Date endDate;
    private List<Organisation> relatedOrganisations;
    private String description;

    protected Appointment(Integer id, String subject){
        this.id = id;
        this.subject = subject;
    }

    @Override
    public void preview(){
        //
        // get Appointment data in appropriate format to preview
        //
    }

}
