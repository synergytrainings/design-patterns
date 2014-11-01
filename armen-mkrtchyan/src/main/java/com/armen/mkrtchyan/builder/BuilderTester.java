package com.armen.mkrtchyan.builder;

import com.armen.mkrtchyan.builder.select.SelectBuilder;
import com.armen.mkrtchyan.builder.select.SelectQuery;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 02, 2014</pre>
 */
public class BuilderTester {

    public static void main(String[] args) {
        SelectQuery selectQuery = new SelectBuilder()
                .select("FirstName", "LastName", "Age")
                .from("Users")
                .where("Age = 15")
                .orderBy("FirstName", "LastName").build();
        selectQuery.execute();
    }

}
