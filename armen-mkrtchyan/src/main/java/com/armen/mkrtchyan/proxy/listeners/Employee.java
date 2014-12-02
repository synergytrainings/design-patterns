package com.armen.mkrtchyan.proxy.listeners;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class Employee implements EmployeeSalaryChangeListener {


    @Override
    public void salaryChanged(int newSalary) {
        System.out.println("celebrate salary change.... actually it's silly to celebrate 0/10 th part of new salary -> " + 0*newSalary);
    }
}
