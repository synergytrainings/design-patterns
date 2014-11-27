package com.synisys.design_patterns.facade.subSystem.devices;

import com.synisys.design_patterns.facade.subSystem.devices.subentities.PrintRequest;

import java.util.List;

/**
 * Created by haykanush.torchyan on 11/27/2014.
 */
public class Printer extends Device{

    private List<PrintRequest> printRequests;

    public List<PrintRequest> getPrintRequests() {
        return printRequests;
    }

    public void setPrintRequests(List<PrintRequest> printRequests) {
        this.printRequests = printRequests;
    }
}
