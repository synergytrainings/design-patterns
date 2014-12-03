package com.synisys.design_patterns.factory;

import com.synisys.design_patterns.product.AbstractContactDetails;

import java.util.Map;

/**
 * Created by haykanush.torchyan on 10/30/2014.
 */
public interface AbstractContactFactory {

    public AbstractContactDetails createContact(Map<String, Object> params);
}
