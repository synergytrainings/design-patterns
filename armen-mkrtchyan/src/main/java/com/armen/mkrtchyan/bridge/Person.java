package com.armen.mkrtchyan.bridge;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 18, 2014</pre>
 */
public interface Person {

    String getName();

    String getEmail();

    int getAge();

    boolean isMature();

    boolean isFemale();

    void changeCountry(Country country);
}
