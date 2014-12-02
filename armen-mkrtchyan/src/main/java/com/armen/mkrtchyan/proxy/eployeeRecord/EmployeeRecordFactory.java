package com.armen.mkrtchyan.proxy.eployeeRecord;

import com.armen.mkrtchyan.proxy.listeners.EmployeeSalaryChangeListener;

import java.util.Collection;
import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class EmployeeRecordFactory {

    public static EmployeeRecord createEmployeeRecord(String firstName, String lastName, int initialSalary, Collection<EmployeeSalaryChangeListener> changeListeners) {
        return new EmployeeRecordProxy(firstName, lastName, initialSalary, changeListeners);
    }

    public static EmployeeRecord createEmployeeRecord(String firstName, String lastName, int initialSalary) {
        return new EmployeeRecordImpl(firstName, lastName, initialSalary);
    }

}
