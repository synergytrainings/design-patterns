package com.synisys.design_patterns.iterator;

import com.synisys.design_patterns.iterator.utilities.StaffType;

import java.util.List;

/**
 * Created by haykanush.torchyan on 3/12/2015.
 */
public class INGOStaffListIterator {

    private List<StaffMember> staffList;
    private int currentIndex;
    private StaffType staffType;

    public INGOStaffListIterator(List<StaffMember> staffList, StaffType staffType){
        this.staffList = staffList;
        this.staffType = staffType;
    }

    public boolean hasNext() {
        while (currentIndex < staffList.size()) {
            StaffMember staffMember = staffList.get(currentIndex);
            if (staffMember.getStaffType().equals(staffType)) {
                return true;
            } else
                currentIndex++;
        }
        return false;
    }

    public StaffMember next() {
        return staffList.get(currentIndex++);
    }


}
