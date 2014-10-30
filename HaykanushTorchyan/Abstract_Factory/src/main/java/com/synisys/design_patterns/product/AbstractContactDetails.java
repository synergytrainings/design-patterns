package com.synisys.design_patterns.product;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public abstract class AbstractContactDetails {

    private String name;
    private String phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getContactType();

    public void printContactDetails(){
        System.out.println("Contact type:   " + getContactType());
        System.out.println("Name:           " + name);
        System.out.println("Phone number:   " + phoneNumber);
        System.out.println("Email:          " + email);
    }
}
