package com.armen.mkrtchyan.observer.shop;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 */
public class Discount {

    private final double percent;
    private final ProductType productType;

    public Discount(double percent, ProductType productType) {
        this.percent = percent;
        this.productType = productType;
    }

    public double getPercent() {
        return percent;
    }

    public ProductType getProductType() {
        return productType;
    }
}
