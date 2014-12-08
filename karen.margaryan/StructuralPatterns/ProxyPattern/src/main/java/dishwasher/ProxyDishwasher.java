package dishwasher;

/**
 * Created by Karen on 12/9/2014.
 */
public class ProxyDishwasher implements Dishwasher {
    private Dishwasher dishwasher;

    public ProxyDishwasher() {
        dishwasher = new DishwasherImpl();
    }


    @Override
    public void wash() {
        System.out.println("Fill liquid soap onto the dishes.");
        dishwasher.wash();
    }
}
