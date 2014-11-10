package com.armen.mkrtchyan.prototype.html;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class Span extends HtmlElement{
    public Span() {
        super("span");
    }

    @Override
    public Span clone() throws CloneNotSupportedException {
        return (Span) super.clone();
    }
}
