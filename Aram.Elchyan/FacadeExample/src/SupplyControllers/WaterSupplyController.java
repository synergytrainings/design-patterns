package SupplyControllers;

/**
 * Created by Aram on 11/27/2014.
 */
public class WaterSupplyController extends SupplyController {
    @Override
    public void OpenValve() {
        System.out.println("Opening water supply valve.");
        super.OpenValve();
    }

    @Override
    protected void TurnSupplyControllingDeviceOn() {
        System.out.println("Regulating water supply.");
    }

    @Override
    protected void TurnSupplyControllingDeviceOff() {
        System.out.println("Stopping water supply regulation.");
    }

    @Override
    public void CloseValve() {
        System.out.println("Closing water supply valve.");
        super.CloseValve();
    }
}
