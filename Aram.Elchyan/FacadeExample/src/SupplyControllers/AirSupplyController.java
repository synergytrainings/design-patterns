package SupplyControllers;

/**
 * Created by Aram on 11/27/2014.
 */
public class AirSupplyController extends SupplyController {
    @Override
    public void OpenValve() {
        System.out.println("Opening air supply valve.");
        super.OpenValve();
    }

    @Override
    protected void TurnSupplyControllingDeviceOn() {
        System.out.println("Regulating air supply.");
    }

    @Override
    protected void TurnSupplyControllingDeviceOff() {
        System.out.println("Stopping air supply regulation.");
    }

    @Override
    public void CloseValve() {
        System.out.println("Closing air supply valve.");
        super.CloseValve();
    }
}
