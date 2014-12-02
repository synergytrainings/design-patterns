package com.armen.mkrtchyan.proxy.eployeeRecord;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class EmployeeRecordImpl implements EmployeeRecord {

    private int salary;
    private final String firstName;
    private final String lastName;

    EmployeeRecordImpl(String firstName, String lastName, int initialSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = initialSalary;
    }

    @Override
    public void changeSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
