package com.synisys.design_patterns.builder.director;

import com.synisys.design_patterns.builder.builder.InternationalOrganisationBuilder;
import com.synisys.design_patterns.builder.domain.Contact;
import com.synisys.design_patterns.builder.domain.InternationalOrganisationProfile;
import com.synisys.design_patterns.builder.domain.Project;

import java.util.Date;
import java.util.List;

/**
 * Created by haykanush.torchyan on 11/3/2014.
 */
public class InternationalOrganisationDirector {

    public InternationalOrganisationProfile createInternationalOrganisationProfile(InternationalOrganisationBuilder builder, String name, String email, String workPermitId,
                                                                                   Date workPermiStartDate, Date workPermitEndDate, List<Contact> employees, List<Project> projects){
        if(builder==null){
            builder = new InternationalOrganisationBuilder();
        }
        builder.buildOrganisationProfile();
        builder.buildOrganisationName(name);
        builder.buildOrganisationEmail(email);
        builder.buildOrganisationWorkPermit(workPermitId);
        builder.buildOrganisationWorkPermitStartEndDates(workPermiStartDate, workPermitEndDate);
        builder.buildOrganisationEmployees(employees);
        builder.buildOrganisationProjects(projects);

        return builder.getOrganisationProfile();
    }
}
