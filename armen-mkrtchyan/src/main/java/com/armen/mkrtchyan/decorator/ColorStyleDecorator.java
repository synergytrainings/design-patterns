package com.armen.mkrtchyan.decorator;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 25, 2014</pre>
 */
public class ColorStyleDecorator extends HtmlComponentStyleDecorator {

    private String color;

    protected ColorStyleDecorator(HtmlComponent component, String color) {
        super(component);
        this.color = color;
    }

    @Override
    public String draw() {
        return super.draw().replaceFirst("style='", "style='background-color: " + color + ",");
    }
}
