import Components.DivElement;
import Components.HtmlComposite;
import Components.SpanElement;
import Components.HtmlComponent;
import Components.ImgElement;
import Components.InputElement;

import java.util.function.Function;

public class Demo {

    public static void main(String[] args) {
        HtmlComponent divComponent = new DivElement();
        divComponent.setEventHandler("click", (Void v)-> {
            System.out.println("Click event handled in div");
            return v;
        });

        HtmlComposite divComposite = divComponent.GetComposite();
        if(divComposite != null) {
            ImgElement img = new ImgElement();
            img.setEventHandler("click", (Void v) -> {
                System.out.println("Click event handled in img");
                return v;
            });
            img.setEventHandler("hover", (Void v) -> {
                System.out.println("Hover event handled in img");
                return v;
            });
            img.setSrc("./hghui/hjgj");
            divComposite.Add(img);
            divComposite.Add(new SpanElement());
            divComposite.Add(new InputElement());
            img.HandleEvent("hover");
            img.HandleEvent("click");
        }
        divComponent.HandleEvent("click");
        System.out.println(divComponent.GetHtmlElement());
    }
}
