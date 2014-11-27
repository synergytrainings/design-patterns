package com.synisys.design_patterns.facade.subSystem;

import com.synisys.design_patterns.facade.subSystem.devices.PC;
import com.synisys.design_patterns.facade.subSystem.devices.subentities.Program;
import com.synisys.design_patterns.facade.subSystem.devices.utilities.DeviceStates;

import java.util.List;

/**
 * Created by haykanush.torchyan on 11/27/2014.
 */
public class PCController {

    private List<PC> computers;

    public PCController(List<PC> computers){
        this.computers = computers;
    }

    public void shutDown(){
        for(PC comp : computers) {
            for (Program program : comp.getActivePrograms()) {
                program.close();
            }
            comp.setState(DeviceStates.OFF);
        }
    }
}
