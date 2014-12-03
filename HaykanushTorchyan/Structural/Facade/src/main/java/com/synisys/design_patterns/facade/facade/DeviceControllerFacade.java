package com.synisys.design_patterns.facade.facade;

import com.synisys.design_patterns.facade.subSystem.PCController;
import com.synisys.design_patterns.facade.subSystem.PrinterController;
import com.synisys.design_patterns.facade.subSystem.devices.PC;
import com.synisys.design_patterns.facade.subSystem.devices.Printer;

import java.util.List;

/**
 * Created by haykanush.torchyan on 11/28/2014.
 */
public class DeviceControllerFacade {

    private List<PC> computers;
    private List<Printer> printers;

    public DeviceControllerFacade(List<PC> computers, List<Printer> printers){
        this.computers = computers;
        this.printers = printers;
    }

    public void shutDownAllDevices(){
        PCController pcController = new PCController(computers);
        pcController.shutDown();

        PrinterController printerController = new PrinterController(printers);
        printerController.shutDown();
    }
}
