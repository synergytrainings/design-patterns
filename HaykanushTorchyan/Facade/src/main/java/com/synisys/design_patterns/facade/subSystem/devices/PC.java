package com.synisys.design_patterns.facade.subSystem.devices;

import com.synisys.design_patterns.facade.subSystem.devices.subentities.Program;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haykanush.torchyan on 11/27/2014.
 */
public class PC extends Device {

    private List<Program> activePrograms = new ArrayList<Program>();

    public List<Program> getActivePrograms() {
        return activePrograms;
    }

    public void setActivePrograms(List<Program> activePrograms) {
        this.activePrograms = activePrograms;
    }
}
