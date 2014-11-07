package com.armen.mkrtchyan.prototype.html;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class Body extends HtmlElement{

    public Body() {
        super("body");
    }

    @Override
    public Body clone() throws CloneNotSupportedException {
        return (Body) super.clone();
    }
}
