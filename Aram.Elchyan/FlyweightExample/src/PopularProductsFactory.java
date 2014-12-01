import java.util.HashMap;
import java.util.Map;

/**
 * Created by aram.elchyan on 12/1/2014.
 */
public class PopularProductsFactory {
    private Map<String, Product> products;

    public PopularProductsFactory() {
        products = new HashMap();
    }

    public Product GetProduct(String id) {
        Product product = products.get(id);
        if(product == null) {
            // requesting product from DB
            Product p = new Product("title", "description", 1000, new Image());
            // requesting product from DB

            this.products.put(id, product);
        }

        return product;
    }
}
