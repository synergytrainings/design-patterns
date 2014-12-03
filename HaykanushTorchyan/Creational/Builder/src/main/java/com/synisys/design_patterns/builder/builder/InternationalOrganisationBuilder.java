package com.synisys.design_patterns.builder.builder;

import com.synisys.design_patterns.builder.domain.Contact;
import com.synisys.design_patterns.builder.domain.InternationalOrganisationProfile;
import com.synisys.design_patterns.builder.domain.Project;
import com.synisys.design_patterns.builder.exception.InvalidArgumentException;
import com.synisys.design_patterns.builder.utils.Utilities;

import java.util.Date;
import java.util.List;

/**
 * Created by haykanush.torchyan on 11/3/2014.
 */
public class InternationalOrganisationBuilder {

    private InternationalOrganisationProfile organisationProfile;

    public void buildOrganisationProfile(){
        this.organisationProfile = new InternationalOrganisationProfile();
    }

    public void buildOrganisationName(String name){
        this.organisationProfile.setName(name);
    }

    public void buildOrganisationEmail(String email) throws InvalidArgumentException{
        if(email.matches(Utilities.EMAIL_VALID_PATTERN)) {
            this.organisationProfile.setEmail(email);
        } else {
            throw new InvalidArgumentException("The email is not valid!");
        }
    }

    public void buildOrganisationWorkPermit(String workPermit){
        this.organisationProfile.setWorkPermitId(workPermit);
    }

    public void buildOrganisationWorkPermitStartEndDates(Date startDate, Date endDate) throws InvalidArgumentException{
        if(this.getHasWorkPermit()){
            if(endDate.after(startDate)) {
                this.organisationProfile.setWorkPermitStartDate(startDate);
                this.organisationProfile.setWorkPermitEndDate(endDate);
            } else {
                throw new InvalidArgumentException("End date must be after Start date!");
            }
        } else {
            throw new InvalidArgumentException("The Organisation doesn't have work permission!");
        }
    }

    public void buildOrganisationEmployees(List<Contact> employees) throws InvalidArgumentException{
        if(employees!=null || !employees.isEmpty()) {
            this.organisationProfile.setEmployees(employees);
        } else {
            throw new InvalidArgumentException("The Employees list to be assigned to the Organisation is empty!");
        }
    }

    public void buildOrganisationProjects(List<Project> projects) throws InvalidArgumentException{
        if(this.getHasWorkPermit()){
            for(Project project : projects){
                project.setHolderOrganisation(organisationProfile);
            }
            this.organisationProfile.setProjectList(projects);
        } else {
            throw new InvalidArgumentException("The Organisation can't be assigned Projects until it doesn't have work permission!");
        }
    }

    public InternationalOrganisationProfile getOrganisationProfile(){
        return organisationProfile;
    }

    public boolean getHasWorkPermit(){
        return this.organisationProfile!=null && !"".equals(this.organisationProfile.getWorkPermitId());
    }
}
