package com.synisys.design_patterns.builder.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by haykanush.torchyan on 11/2/2014.
 */
public class InternationalOrganisationProfile {

    private String name;
    private String email;
    private String workPermitId;
    private Date workPermitStartDate;
    private Date workPermitEndDate;
    private List<Contact> employees;
    private List<Project> projectList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPermitId() {
        return workPermitId;
    }

    public void setWorkPermitId(String workPermitId) {
        this.workPermitId = workPermitId;
    }

    public Date getWorkPermitStartDate() {
        return workPermitStartDate;
    }

    public void setWorkPermitStartDate(Date workPermitStartDate) {
        this.workPermitStartDate = workPermitStartDate;
    }

    public Date getWorkPermitEndDate() {
        return workPermitEndDate;
    }

    public void setWorkPermitEndDate(Date getWorkPermitEndDate) {
        this.workPermitEndDate = getWorkPermitEndDate;
    }

    public List<Contact> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Contact> employees) {
        this.employees = employees;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
