public class WebPageBuilderDemo {
    private static PopularProductsFactory productFactory;

    static {
        productFactory = new PopularProductsFactory();
    }

    public static void main(String[] args) {
        Product product = productFactory.GetProduct("MS Surface Pro 3 (64GB) Brand New in Box + Office + Keyboard");
        // building web page by using products properties
    }
}
