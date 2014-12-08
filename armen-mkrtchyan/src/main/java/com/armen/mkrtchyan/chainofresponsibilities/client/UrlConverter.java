package com.armen.mkrtchyan.chainofresponsibilities.client;

import com.armen.mkrtchyan.chainofresponsibilities.api.AbstractConverter;
import com.armen.mkrtchyan.chainofresponsibilities.api.Converter;
import com.armen.mkrtchyan.chainofresponsibilities.api.ConvertibleValueHolder;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class UrlConverter extends AbstractConverter {

    private static final Pattern URL_PATTERN = Pattern.compile("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");

    protected UrlConverter(Converter nextConverter) {
        super(nextConverter);
    }

    @Override
    protected boolean canConvert(ConvertibleValueHolder holder) {
        return URL_PATTERN.matcher(holder.getConvertibleValue()).matches();
    }

    @Override
    protected void handleConvert(ConvertibleValueHolder holder) {
        try {
            holder.setConvertedValue(new URL(holder.getConvertibleValue()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
