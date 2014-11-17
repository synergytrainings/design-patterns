package com.armen.mkrtchyan.bridge;

import com.armen.mkrtchyan.bridge.maturity.MaturityChecker;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 18, 2014</pre>
 */
public class PersonImpl implements Person{

    private final String name;
    private final String email;
    private final int age;
    private final boolean isFemale;
    private MaturityChecker checker;

    public PersonImpl(String name, String email, int age, boolean isFemale, Country country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isFemale = isFemale;
        checker = country.createMaturityChecker();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean isMature() {
        return checker.isMature(age, isFemale);
    }

    @Override
    public boolean isFemale() {
        return isFemale;
    }

    @Override
    public void changeCountry(Country country) {
        checker = country.createMaturityChecker();
    }
}
