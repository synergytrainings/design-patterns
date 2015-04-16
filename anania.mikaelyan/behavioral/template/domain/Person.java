package com.synisys.training.patterns.behavioral.template.domain;

/**
 * @author Anania.Mikaelyan
 * @since 4/16/2015
 */
public class Person {
    private final String name;
    private final String phoneNumber;
    private Level level;

    public Person(String name, String phoneNumber, Level level) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (phoneNumber != null ? !phoneNumber.equals(person.phoneNumber) : person.phoneNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return phoneNumber != null ? phoneNumber.hashCode() : 0;
    }
}
