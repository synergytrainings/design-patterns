/**
 * Created by Aram on 11/27/2014.
 */
public class BoilerFacade {
    private FuelBurningController burningController;
    private WaterFlawController waterFlawController;

    public BoilerFacade() {
        burningController = new FuelBurningController();
        waterFlawController = new WaterFlawController();
    }

    public void TurnOn() {
        waterFlawController.SupplyWaterToSystem();
        System.out.println("Waiting for a while");
        waterFlawController.StopWaterSupplying();

        burningController.LoadFuelAndAir();
        burningController.StartBurning();
        waterFlawController.PumpWater();
    }

    public void TurnOff() {
        burningController.StopBurning();
        waterFlawController.StopPumping();
    }
}
