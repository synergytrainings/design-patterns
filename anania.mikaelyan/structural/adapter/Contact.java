package com.synisys.training.patterns.structural.adapter;

/**
 * Adaptee - the class that we wish to give access to the methods and functionality of the target.
 * @author Anania.Mikaelyan
 * @since 11/13/2014
 */
public class Contact {
    private final Long id;
    private final String firstName;
    private final String lastName;

    public Contact(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFullName() {
        return (firstName != null ? firstName + " " : "") + (lastName != null ? lastName : "");
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



}
