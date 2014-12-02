package com.armen.mkrtchyan.proxy.listeners;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class EmployeeWife implements EmployeeSalaryChangeListener {
    @Override
    public void salaryChanged(int newSalary) {
        System.out.println("take the 9/10 th of new salary -> " + newSalary*9/10);
    }
}
