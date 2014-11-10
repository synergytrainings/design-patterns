package com.armen.mkrtchyan.singleton.rates;

import com.google.common.collect.Table;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class RateService {

    RateService() {
    }

    private final Table<String, Long, BigDecimal> rateTable = RateLoader.loadRates();

    public BigDecimal getRate(String currency, Calendar date) {
        return rateTable.get(currency, date.getTimeInMillis());
    }

    public static RateService getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public static class InstanceHolder{
        private static final RateService INSTANCE = new RateService();
    }

}
