package com.synisys.design_patterns.facade;

import com.synisys.design_patterns.facade.facade.DeviceControllerFacade;
import com.synisys.design_patterns.facade.subSystem.devices.PC;
import com.synisys.design_patterns.facade.subSystem.devices.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 11/27/2014.
 */
public class OfficeDevicesManagerTest {

    // consider the office admins must shut down all
    // the PCs and printers (and so on other devices) in the office.
    // Instead of shutting down each device separately, they
    // can use a facade object and do that as a unique action
    public static void main(String... args){
        List<PC> officeComputers = getOfficeComputers();
        List<Printer> officePrinters = getOfficePrinters();

        DeviceControllerFacade deviceController = new DeviceControllerFacade(officeComputers, officePrinters);
        deviceController.shutDownAllDevices();
    }

    public static List<PC> getOfficeComputers(){
        List<PC> computerList = new ArrayList<PC>();
        // get the office's computers' list and save it into computerList
        return computerList;
    }

    public static List<Printer> getOfficePrinters(){
        List<Printer> printerList = new ArrayList<Printer>();
        // get the office's printers' list and save it into printerList
        return printerList;
    }
}
