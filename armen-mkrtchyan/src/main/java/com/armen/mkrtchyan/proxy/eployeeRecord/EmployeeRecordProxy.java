package com.armen.mkrtchyan.proxy.eployeeRecord;

import com.armen.mkrtchyan.proxy.listeners.EmployeeSalaryChangeListener;

import java.util.Collection;
import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class EmployeeRecordProxy implements EmployeeRecord {

    private final EmployeeRecordImpl employeeRecord;
    private final Collection<EmployeeSalaryChangeListener> changeListeners;

    EmployeeRecordProxy(String firstName, String lastName, int initialSalary, Collection<EmployeeSalaryChangeListener> changeListeners) {
        this.changeListeners = changeListeners;
        this.employeeRecord = new EmployeeRecordImpl(firstName, lastName, initialSalary);
    }


    @Override
    public void changeSalary(int salary) {
        this.employeeRecord.changeSalary(salary);
        for (EmployeeSalaryChangeListener changeListener : changeListeners) {
            changeListener.salaryChanged(salary);
        }
    }

    @Override
    public String getFirstName() {
        return employeeRecord.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeRecord.getLastName();
    }
}
