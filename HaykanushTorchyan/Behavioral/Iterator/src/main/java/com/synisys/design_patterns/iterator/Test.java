package com.synisys.design_patterns.iterator;

import com.synisys.design_patterns.iterator.utilities.StaffType;

import java.math.BigDecimal;

/**
 * Created by haykanush.torchyan on 3/13/2015.
 */
public class Test {

    public static INGOStaffList getIngoStaff(){
        INGOStaffList ingoStaffList = new INGOStaffList();
        ingoStaffList.addStaffMember(new StaffMember(StaffType.EXPATRIATE, "John Brown", "AV8743289"));
        ingoStaffList.addStaffMember(new StaffMember(StaffType.NATIONAL, "Emily Watson", "FH6758493"));
        ingoStaffList.addStaffMember(new StaffMember(StaffType.EXPATRIATE, "Brian Weight", "HK7938477"));
        ingoStaffList.addStaffMember(new StaffMember(StaffType.NATIONAL, "Sara Jones", "GH6386537"));
        ingoStaffList.addStaffMember(new StaffMember(StaffType.NATIONAL, "Michael Duglas", "HK987578"));
        ingoStaffList.addStaffMember(new StaffMember(StaffType.EXPATRIATE, "Mary Clay", "GH6754387"));
        return ingoStaffList;
    }

    public static void main(String... args){
        INGOStaffList ingoStaffList = getIngoStaff();
        INGOStaffListIterator nationalStaffIterator = ingoStaffList.iterator(StaffType.NATIONAL);
        INGOStaffListIterator expatriateStaffIterator = ingoStaffList.iterator(StaffType.EXPATRIATE);

        System.out.println("National staff is:");
        while(nationalStaffIterator.hasNext()){
            StaffMember staffMember = nationalStaffIterator.next();
            System.out.println("    " + staffMember.getName());
            staffMember.setSalary(BigDecimal.valueOf(350));
        }

        System.out.println("Expatriate staff is:");
        while(expatriateStaffIterator.hasNext()){
            StaffMember staffMember = expatriateStaffIterator.next();
            System.out.println("    " + staffMember.getName());
            staffMember.setSalary(BigDecimal.valueOf(500));
        }

    }
}
