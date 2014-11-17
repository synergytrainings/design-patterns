package com.armen.mkrtchyan.bridge.maturity;

import java.util.Calendar;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 18, 2014</pre>
 */
public interface MaturityChecker {

    boolean isMature(int age, boolean isFemale);

}
