import SupplyControllers.WaterSupplyController;

/**
 * Created by Aram on 11/27/2014.
 */
public class WaterFlawController {
    private WaterSupplyController waterSupplyController;

    public WaterFlawController() {
        waterSupplyController = new WaterSupplyController();
    }

    public void SupplyWaterToSystem() {
        waterSupplyController.OpenValve();
    }

    public void StopWaterSupplying() {
        waterSupplyController.CloseValve();
    }

    public void PumpWater() {
        System.out.println("Pumping water through the pipes system.");
    }

    public void StopPumping() {
        System.out.println("Stopping water pumping.");
    }
}
