package com.synisys.training.patterns.structural.adapter;

/**
 * Adapter  - adapts the interface of Adaptee(Contact) to the Target(Classifier) interface.
 * @author Anania.Mikaelyan
 * @since 11/13/2014
 */
public class ContactClassifier implements Classifier {
    private final Contact contact;

    public ContactClassifier(Contact contact) {
        this.contact = contact;
    }

    @Override
    public Long getId() {
        return contact.getId();
    }

    @Override
    public String getName() {
        return contact.getFullName();
    }
}
