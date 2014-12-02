package com.armen.mkrtchyan.proxy;

import com.armen.mkrtchyan.proxy.eployeeRecord.EmployeeRecord;
import com.armen.mkrtchyan.proxy.eployeeRecord.EmployeeRecordFactory;
import com.armen.mkrtchyan.proxy.listeners.Employee;
import com.armen.mkrtchyan.proxy.listeners.EmployeeFriend;
import com.armen.mkrtchyan.proxy.listeners.EmployeeWife;
import com.google.common.collect.Lists;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 02, 2014</pre>
 */
public class EmployeeRecordClient {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = EmployeeRecordFactory.createEmployeeRecord("Armen", "Mkrtchyan", 100, Lists.newArrayList(
                new EmployeeFriend(),
                new EmployeeWife(),
                new Employee()
        ));
        employeeRecord.changeSalary(150);

    }

}
