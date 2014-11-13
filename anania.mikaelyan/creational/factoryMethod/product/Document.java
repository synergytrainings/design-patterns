package com.synisys.training.patterns.factoryMethod.product;

/**
 * Concrete product 2
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public class Document implements File {
    @Override
    public String getAvailableTypes() {
        return "PDF, Word, Excel....";
    }
}
