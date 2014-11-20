package Components;

import Components.Composites.HtmlComposite;

/**
 * Created by Aram on 11/19/2014.
 */
public abstract class HtmlComponent {
    protected final String tag;

    public HtmlComponent(String tag) {
        this.tag = tag;
    }

    protected HtmlComponent parent;

    protected double width;

    protected double height;

    protected double margin;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setParent(HtmlComponent parent) {
        if(this.parent != null) {
            HtmlComposite composite = this.parent.GetComposite();
            if(composite != null) {
                composite.Remove(this);
            }
            this.parent = null;
        }

        HtmlComposite newParent = parent.GetComposite();
        if(newParent != null) {
            newParent.Add(this);
            this.parent = parent;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public double getMargin() {
        return margin;
    }

    public HtmlComponent getParent() {
        return parent;
    }

    public String GetHtmlElement() {
        return "<" + tag +
                " style='" +
                "width: " + width +
                ";height: " + height +
                ";margin: " + margin +";'/>";
    }

    public HtmlComposite GetComposite() { return  null; }
}
