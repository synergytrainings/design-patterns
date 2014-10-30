package com.synisys.design_patterns.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public class UserContactDetails extends AbstractContactDetails {

    private static String CONTACT_TYPE = "User Contact";

    private String passportId;
    private String address;

    public UserContactDetails(String name, String email, String phoneNumber, String passportId, String address){
        this.setName(name);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.passportId = passportId;
        this.address = address;
    }

    @Override
    public void printContactDetails(){
        super.printContactDetails();
        System.out.println("Passport ID:    " + passportId);
        System.out.println("Address:        " + address + "\n");
    }

    @Override
    public String getContactType(){
        return CONTACT_TYPE;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
