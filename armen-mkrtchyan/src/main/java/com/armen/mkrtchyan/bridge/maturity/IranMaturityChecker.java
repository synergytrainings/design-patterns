package com.armen.mkrtchyan.bridge.maturity;

import com.armen.mkrtchyan.bridge.Country;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 18, 2014</pre>
 */
public class IranMaturityChecker implements MaturityChecker {

    @Override
    public boolean isMature(int age, boolean isFemale) {
        return isFemale ? Country.IRAN.getFemaleMajorityAge() <= age : Country.IRAN.getMaleMajorityAge() <= age;
    }
}
