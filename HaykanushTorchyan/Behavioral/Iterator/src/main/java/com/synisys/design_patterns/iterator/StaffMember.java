package com.synisys.design_patterns.iterator;

import com.synisys.design_patterns.iterator.utilities.StaffType;

import java.math.BigDecimal;

/**
 * Created by haykanush.torchyan on 3/12/2015.
 */
public class StaffMember {

    private StaffType staffType;
    private String name;
    private String passportID;
    private BigDecimal salary;

    public StaffMember(StaffType staffType, String name, String passportID){
        this.staffType = staffType;
        this.name = name;
        this.passportID = passportID;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
