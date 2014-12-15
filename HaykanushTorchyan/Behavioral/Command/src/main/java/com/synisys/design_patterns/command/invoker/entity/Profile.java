package com.synisys.design_patterns.command.invoker.entity;

import java.util.Date;

/**
 * Created by haykanush.torchyan on 12/14/2014.
 */
public class Profile extends Entity{

    private String organisationName;
    private String registartionNumber;
    private Date registrationDate;

    public Profile(String organisationName, String registartionNumber, Date registrationDate, Integer idd){
        super(idd);
        this.organisationName = organisationName;
        this.registartionNumber = registartionNumber;
        this.registrationDate = registrationDate;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public void setRegistartionNumber(String registartionNumber) {
        this.registartionNumber = registartionNumber;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getOrganisationName() {

        return organisationName;
    }

    public String getRegistartionNumber() {
        return registartionNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
