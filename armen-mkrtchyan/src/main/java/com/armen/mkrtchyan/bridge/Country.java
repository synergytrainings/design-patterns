package com.armen.mkrtchyan.bridge;

import com.armen.mkrtchyan.bridge.maturity.CubaMaturityChecker;
import com.armen.mkrtchyan.bridge.maturity.IranMaturityChecker;
import com.armen.mkrtchyan.bridge.maturity.MaturityChecker;
import com.armen.mkrtchyan.bridge.maturity.UsaMaturityChecker;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 18, 2014</pre>
 */
public enum Country {

    IRAN(14, 8) {
        @Override
        public MaturityChecker createMaturityChecker() {
            return new IranMaturityChecker();
        }
    }, CUBA(16) {
        @Override
        public MaturityChecker createMaturityChecker() {
            return new CubaMaturityChecker();
        }
    }, USA(19) {
        @Override
        public MaturityChecker createMaturityChecker() {
            return new UsaMaturityChecker();
        }
    };

    private final int maleMajorityAge;

    private final int femaleMajorityAge;

    Country(int majorityAge) {
        this.maleMajorityAge = majorityAge;
        this.femaleMajorityAge = majorityAge;
    }

    Country(int maleMajorityAge, int femaleMajorityAge) {
        this.maleMajorityAge = maleMajorityAge;
        this.femaleMajorityAge = femaleMajorityAge;
    }

    public int getMaleMajorityAge() {
        return maleMajorityAge;
    }

    public int getFemaleMajorityAge() {
        return femaleMajorityAge;
    }

    public abstract MaturityChecker createMaturityChecker();
}
