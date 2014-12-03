package com.synisys.design_patterns.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public class OrganisationContactDetails extends AbstractContactDetails {

    private static String CONTACT_TYPE = "Organisation Contact";

    private String registrationId;
    private List<String> officeAddresses = new ArrayList<String>();

    public OrganisationContactDetails(String name, String email, String phoneNumber, String registrationId, List<String> officeAddresses){
        this.setName(name);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.registrationId = registrationId;
        this.officeAddresses = officeAddresses;
    }

    @Override
    public void printContactDetails(){
        super.printContactDetails();
        System.out.println("Registration ID: " + registrationId);
        System.out.println("List of offices' addresses:");
        int i = 1;
        for(String address : officeAddresses){
            System.out.println("    " + (i++) + ". " + address);
        }
        System.out.println("\n");
    }

    @Override
    public String getContactType(){
        return CONTACT_TYPE;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public List<String> getOfficeAddresses() {
        return officeAddresses;
    }

    public void setOfficeAddresses(List<String> officeAddresses) {
        this.officeAddresses = officeAddresses;
    }
}
