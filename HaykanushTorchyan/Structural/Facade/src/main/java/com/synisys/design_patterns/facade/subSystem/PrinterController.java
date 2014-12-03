package com.synisys.design_patterns.facade.subSystem;

import com.synisys.design_patterns.facade.subSystem.devices.Printer;
import com.synisys.design_patterns.facade.subSystem.devices.subentities.PrintRequest;
import com.synisys.design_patterns.facade.subSystem.devices.utilities.DeviceStates;

import java.util.List;

/**
 * Created by haykanush.torchyan on 11/27/2014.
 */
public class PrinterController {

    private List<Printer> printers;

    public PrinterController(List<Printer> printers){
        this.printers = printers;
    }

    public void shutDown(){
        for(Printer printer : printers) {
            for (PrintRequest printRequest : printer.getPrintRequests()) {
                printRequest.accomplish();
            }
            printer.setState(DeviceStates.OFF);
        }
    }
}
