package com.synisys.design_patterns.builder.domain;

import java.util.Date;

/**
 * Created by haykanush.torchyan on 11/3/2014.
 */
public class Project {

    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private InternationalOrganisationProfile holderOrganisation;
    private String location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public InternationalOrganisationProfile getHolderOrganisation() {
        return holderOrganisation;
    }

    public void setHolderOrganisation(InternationalOrganisationProfile holderOrganisation) {
        this.holderOrganisation = holderOrganisation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
