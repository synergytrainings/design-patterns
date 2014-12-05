package com.synisys.design_patterns.proxy.helper;

/**
 * Created by haykanush.torchyan on 12/4/2014.
 */
public class Organisation {

    private String name;
    private String workPermitID;
    private String registrationNumber;

    public Organisation(String name, String workPermitID, String registrationNumber){
        this.name = name;
        this.workPermitID = workPermitID;
        this.registrationNumber = registrationNumber;
    }
}
