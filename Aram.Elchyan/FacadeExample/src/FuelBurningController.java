import SupplyControllers.AirSupplyController;
import SupplyControllers.FuelSupplyController;

/**
 * Created by Aram on 11/27/2014.
 */
public class FuelBurningController {
    private FuelSupplyController fuelSupplyController;

    private AirSupplyController airSupplyController;

    public FuelBurningController() {
        fuelSupplyController = new FuelSupplyController();
        airSupplyController = new AirSupplyController();
    }

    public void LoadFuelAndAir() {
        fuelSupplyController.OpenValve();
        airSupplyController.OpenValve();
    }

    public void StartBurning() {
        System.out.println("Burning the fuel.");
    }

    public void StopBurning() {
        fuelSupplyController.CloseValve();
        airSupplyController.CloseValve();
    }
}
