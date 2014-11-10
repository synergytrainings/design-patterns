package com.synisys.training.patterns.factoryMethod.product;

/**
 * Concrete product 1
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class Image implements File {
    @Override
    public String getAvailableTypes() {
        return "PNG, JPG, GIF....";
    }
}
