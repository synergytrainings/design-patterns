package SupplyControllers;

import SupplyControllers.SupplyController;

/**
 * Created by Aram on 11/27/2014.
 */
public class FuelSupplyController extends SupplyController {
    @Override
    public void OpenValve() {
        System.out.println("Opening fuel supply valve.");
        super.OpenValve();
    }

    @Override
    protected void TurnSupplyControllingDeviceOn() {
        System.out.println("Regulating fuel supply.");
    }

    @Override
    protected void TurnSupplyControllingDeviceOff() {
        System.out.println("Stopping fuel supply regulation.");
    }

    @Override
    public void CloseValve() {
        System.out.println("Closing fuel supply valve.");
        super.CloseValve();
    }
}
