package com.armen.mkrtchyan.chainofresponsibilities.api;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public abstract class AbstractConverter implements Converter {

    private final Converter nextConverter;

    protected AbstractConverter(Converter nextConverter) {
        this.nextConverter = nextConverter;
    }

    @Override
    public final void convert(ConvertibleValueHolder holder) {
        if (canConvert(holder)) {
            handleConvert(holder);
        } else {
            if (nextConverter != null) {
                nextConverter.convert(holder);
            }
        }
    }

    protected abstract boolean canConvert(ConvertibleValueHolder holder);

    protected abstract void handleConvert(ConvertibleValueHolder holder);
}
