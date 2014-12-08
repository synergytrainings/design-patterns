import dishwasher.Dishwasher;
import dishwasher.ProxyDishwasher;

/**
 * Created by Karen on 12/9/2014.
 */
public class Main {
    public static void main(String ... args) {
        Dishwasher dishwasher = new ProxyDishwasher();
        dishwasher.wash();
    }
}

