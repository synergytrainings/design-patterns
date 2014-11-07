package com.armen.mkrtchyan.prototype.html;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class Div extends HtmlElement {
    public Div() {
        super("div");
    }

    @Override
    public Div clone() throws CloneNotSupportedException {
        return (Div) super.clone();
    }
}
