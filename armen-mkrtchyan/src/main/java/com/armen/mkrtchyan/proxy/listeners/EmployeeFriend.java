package com.armen.mkrtchyan.proxy.listeners;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class EmployeeFriend implements EmployeeSalaryChangeListener {
    @Override
    public void salaryChanged(int newSalary) {
        System.out.println("drink 1/10 th of new salary -> " + newSalary/10);
    }
}
