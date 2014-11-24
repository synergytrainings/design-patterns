package com.armen.mkrtchyan.decorator;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 25, 2014</pre>
 */
public abstract class HtmlComponentStyleDecorator implements HtmlComponent {

    private HtmlComponent component;

    protected HtmlComponentStyleDecorator(HtmlComponent component) {
        this.component = component;
    }

    @Override
    public String draw() {
        return component.draw().replaceAll(",'", "'");
    }
}
