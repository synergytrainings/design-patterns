package com.armen.mkrtchyan.prototype.html;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public abstract class HtmlElement implements Cloneable{

    private final String tagName;
    private List<HtmlElement> childElements = new ArrayList<>();

    HtmlElement(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlElement> getChildElements() {
        return childElements;
    }

    public String getHtml() {
        StringBuilder htmlBuilder = new StringBuilder("<");
        htmlBuilder.append(tagName).append('>').append("\n");
        for (HtmlElement childElement : childElements) {
            htmlBuilder.append(childElement.getHtml()).append("\n");
        }
        htmlBuilder.append("</").append(tagName).append('>');
        return htmlBuilder.toString();
    }

    @Override
    public HtmlElement clone() throws CloneNotSupportedException {
        HtmlElement element = (HtmlElement) super.clone();
        ArrayList<HtmlElement> clonedChildren = new ArrayList<>();
        for (HtmlElement childElement : childElements) {
            clonedChildren.add(childElement.clone());
        }
        element.childElements = clonedChildren;
        return element;
    }
}
