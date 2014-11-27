package SupplyControllers;

/**
 * Created by Aram on 11/27/2014.
 */
public abstract class SupplyController {
    public void OpenValve() {
        TurnSupplyControllingDeviceOn();
    }

    protected abstract void TurnSupplyControllingDeviceOn();

    protected abstract void TurnSupplyControllingDeviceOff();

    public void CloseValve() {
        TurnSupplyControllingDeviceOff();
    }
}
