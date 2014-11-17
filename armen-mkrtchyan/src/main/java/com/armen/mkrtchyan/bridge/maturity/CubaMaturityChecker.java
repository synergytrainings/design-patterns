package com.armen.mkrtchyan.bridge.maturity;

import com.armen.mkrtchyan.bridge.Country;

import java.util.Calendar;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 18, 2014</pre>
 */
public class CubaMaturityChecker implements MaturityChecker {

    @Override
    public boolean isMature(int age, boolean isFemale) {
        return Country.CUBA.getMaleMajorityAge() <= age;
    }
}
