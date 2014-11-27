package com.armen.mkrtchyan.facade.application;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 27, 2014</pre>
 */
public class User {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;


    public User(String firstName, String lastName, String email) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("email", email)
                .toString();
    }
}
