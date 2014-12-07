package Components;

/**
 * Created by Aram on 11/19/2014.
 */
public class InputElement extends HtmlComponent {
    private String type;

    public InputElement() {
        super("input");
    }

    @Override
    public void setParent(HtmlComponent parent) {
        super.setParent(parent);
    }

    public String getType() {
        return type;
    }

    @Override
    public String GetHtmlElement() {
        return new StringBuilder(super.GetHtmlElement()).insert(4, " type='" + type + "'").toString();
    }
}
