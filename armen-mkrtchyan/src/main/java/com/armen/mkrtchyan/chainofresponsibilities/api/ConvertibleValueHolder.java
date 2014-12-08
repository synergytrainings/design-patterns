package com.armen.mkrtchyan.chainofresponsibilities.api;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class ConvertibleValueHolder {

    private final String convertibleValue;
    private Object convertedValue;

    public ConvertibleValueHolder(String convertibleValue) {
        this.convertibleValue = convertibleValue;
    }

    public String getConvertibleValue() {
        return convertibleValue;
    }

    public Object getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(Object convertedValue) {
        this.convertedValue = convertedValue;
    }
}
