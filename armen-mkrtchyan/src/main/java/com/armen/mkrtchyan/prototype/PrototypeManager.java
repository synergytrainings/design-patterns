package com.armen.mkrtchyan.prototype;

import com.armen.mkrtchyan.prototype.html.Body;
import com.armen.mkrtchyan.prototype.html.Div;
import com.armen.mkrtchyan.prototype.html.HtmlElement;
import com.armen.mkrtchyan.prototype.html.Span;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class PrototypeManager {

    private static HashMap<String, HtmlElement> registry = new HashMap<>();

    static {
        registry.put("span", new Span());
        Div defaultDiv = new Div();
        defaultDiv.getChildElements().add(registry.get("span"));
        registry.put("div", defaultDiv);
        Body defaultBody = new Body();
        defaultBody.getChildElements().add(defaultDiv);
        defaultBody.getChildElements().add(registry.get("span"));
        registry.put("body", defaultBody);
    }

    public static <T extends HtmlElement> T get(String name) throws CloneNotSupportedException {
            return (T) registry.get(name).clone();
    }

    public static <T extends HtmlElement> T edit(String name) {
        return (T) registry.get(name);
    }

    public static Collection<HtmlElement> browse() {
        return registry.values();
    }
}
