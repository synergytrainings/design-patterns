package Components;

/**
 * Created by Aram on 11/19/2014.
 */
public class ImgElement extends HtmlComponent {
    private String src;

    public ImgElement() {
        super("img");
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    @Override
    public String GetHtmlElement() {
        return new StringBuilder(super.GetHtmlElement()).insert(4, " src='" + src + "'").toString();
    }
}
