package Components.Composites;

import Components.HtmlComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aram on 11/19/2014.
 */
public abstract class HtmlComposite extends HtmlComponent {
    protected List<HtmlComponent> children = new ArrayList<HtmlComponent>();

    public HtmlComposite(String tag) {
        super(tag);
    }

    public HtmlComponent getChild(int index) {
        return children.get(index);
    }

    public void Add(HtmlComponent component)
    {
        component.setParent(this);
        children.add(component);
    }

    public void Remove(HtmlComponent component)
    {
        int index = children.indexOf(component);
        if(index != -1) {
            this.getChild(index).setParent(null);
            children.remove(index);
        }
    }

    @Override
    public String GetHtmlElement() {
        StringBuilder elementBuilder = new StringBuilder("<" + tag +
                " style='" +
                "width: " + width +
                ";height: " + height +
                ";margin: " + margin +";'>");


        for(HtmlComponent component : children) {
            elementBuilder.append(component.GetHtmlElement());
        }
        elementBuilder.append("<" + tag + "/>");

        return elementBuilder.toString();
    }

    @Override
    public HtmlComposite GetComposite() {
        return this;
    }
}
