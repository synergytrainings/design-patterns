package com.synisys.design_patterns.iterator;

import com.synisys.design_patterns.iterator.utilities.StaffType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 3/12/2015.
 */
public class INGOStaffList {

    private List<StaffMember> staffList;

    public INGOStaffList(){
        this.staffList = new ArrayList<StaffMember>();
    }

    public void addStaffMember(StaffMember staffMember){
        staffList.add(staffMember);
    }

    public void removeStaffMember(StaffMember staffMember){
        staffList.remove(staffMember);
    }

    public INGOStaffListIterator iterator(StaffType staffType){
        return new INGOStaffListIterator(this.staffList, staffType);
    }

}
