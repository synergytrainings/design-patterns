package Tests;

import Components.Composites.DivElement;
import Components.Composites.HtmlComposite;
import Components.HtmlComponent;
import Components.ImgElement;
import Components.InputElement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aram on 11/20/2014.
 */
public class ComponentTest {
    @Test
    public void testGetComposite() {
        HtmlComponent img = new ImgElement();
        
        Assert.assertEquals(img, null);
    }

    @Test
    public void testSetParent() {
        HtmlComponent input = new InputElement();
        HtmlComponent img = new ImgElement();
        HtmlComposite div = new DivElement();

        input.setParent(img);
        img.setParent(div);

        Assert.assertEquals(input.getParent(), null);
        Assert.assertEquals(img.getParent(), div);
        Assert.assertEquals(div.getChild(0), img);

        img.setParent(null);

        Assert.assertEquals(img.getParent(), null);
    }
}
