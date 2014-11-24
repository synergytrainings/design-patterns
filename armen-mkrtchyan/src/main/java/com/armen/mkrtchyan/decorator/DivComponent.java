package com.armen.mkrtchyan.decorator;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 25, 2014</pre>
 */
public class DivComponent implements HtmlComponent {

    @Override
    public String draw() {
        return "<div style=''></div>";
    }
}
