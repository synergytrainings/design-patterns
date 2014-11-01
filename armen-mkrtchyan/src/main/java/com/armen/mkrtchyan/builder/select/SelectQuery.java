package com.armen.mkrtchyan.builder.select;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 02, 2014</pre>
 */
public class SelectQuery {

    private final String query;

    SelectQuery(String query) {
        this.query = query;
    }

    public void execute() {
        System.out.println(query);
    }
}
