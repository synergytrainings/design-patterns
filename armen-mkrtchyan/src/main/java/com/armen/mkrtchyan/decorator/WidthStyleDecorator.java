package com.armen.mkrtchyan.decorator;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 25, 2014</pre>
 */
public class WidthStyleDecorator extends HtmlComponentStyleDecorator {

    private final int width;
    private final String unit;

    public WidthStyleDecorator(HtmlComponent component, int width, String unit) {
        super(component);
        this.width = width;
        this.unit = unit;
    }

    @Override
    public String draw() {
        return super.draw().replaceFirst("style='", "style='width: " + width + unit + ",");
    }
}
