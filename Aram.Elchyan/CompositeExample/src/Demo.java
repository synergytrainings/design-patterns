import Components.Composites.DivElement;
import Components.Composites.HtmlComposite;
import Components.Composites.SpanElement;
import Components.HtmlComponent;
import Components.ImgElement;
import Components.InputElement;

public class Demo {

    public static void main(String[] args) {
        HtmlComponent divComponent = new DivElement();

        HtmlComposite composite = divComponent.GetComposite();
        if(composite != null) {
            ImgElement img = new ImgElement();
            img.setSrc("./hghui/hjgj");
            composite.Add(img);
            composite.Add(new SpanElement());
            composite.Add(new InputElement());
        }
        System.out.println(divComponent.GetHtmlElement());
    }
}
