package com.synisys.design_patterns.facade.subSystem.devices;

import com.synisys.design_patterns.facade.subSystem.devices.utilities.DeviceStates;

/**
 * Created by haykanush.torchyan on 11/27/2014.
 */
public class Device {

    private DeviceStates state;

    public DeviceStates getState() {
        return state;
    }

    public void setState(DeviceStates state) {
        this.state = state;
    }

}
