package com.armen.mkrtchyan.singleton.rates;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class RateLoader {

    private static final String SERVICE_BASE = "http://openexchangerates.org/api/historical/";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final String APP_ID = "app_id=4bb0b85ebade4ce0b8ef3e1a5499b60b";


    public static Table<String, Long, BigDecimal> loadRates() {
        Table<String, Long, BigDecimal> rateTable = HashBasedTable.create();
        Calendar date = new GregorianCalendar(2008, 0, 1);
        Calendar currentDate = GregorianCalendar.getInstance();
        while (date.before(currentDate)) {
            try {
                URL url = new URL(SERVICE_BASE + DATE_FORMAT.format(date.getTime()) + ".json?" + APP_ID);
                loadFromJson((InputStream) url.openConnection().getContent(), date.getTimeInMillis(), rateTable);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            date.add(Calendar.MONTH, 6);
        }
        return rateTable;
    }

    private static void loadFromJson(InputStream json, Long date, Table<String, Long, BigDecimal> rateTable) {
        JsonParser parser = new JsonParser();
        JsonObject element = parser.parse(new InputStreamReader(json)).getAsJsonObject().get("rates").getAsJsonObject();
        for (Map.Entry<String, JsonElement> jsonEntry : element.entrySet()) {
            rateTable.put(jsonEntry.getKey(), date, jsonEntry.getValue().getAsBigDecimal());
        }
    }

}
