package Tests

import Components.Composites.DivElement
import Components.Composites.HtmlComposite
import Components.Composites.SpanElement
import Components.HtmlComponent
import Components.ImgElement
import Components.InputElement
import org.junit.Assert
import org.junit.Test

/**
 * Created by Aram on 11/20/2014.
 */
class CompositeTest {
    @Test
    public void testGetComposite() {
        HtmlComposite div = new DivElement();
        HtmlComposite span = new SpanElement();

        Assert.assertEquals(div.GetComposite(), div);
        Assert.assertEquals(span.GetComposite(), span);
    }

    @Test
    public void testAdd() {
        HtmlComposite div = new DivElement();
        HtmlComponent input = new InputElement();
        HtmlComponent img = new ImgElement();

        div.Add(input);
        div.Add(img);

        Assert.assertEquals(input.getParent(), div);
        Assert.assertEquals(div.getChild(0), input);
        Assert.assertEquals(div.getChild(1), img);
    }

    @Test
    public void testRemove() {
        HtmlComposite div = new DivElement();
        HtmlComponent input = new InputElement();
        HtmlComponent img = new ImgElement();

        div.Add(input);
        div.Add(img);
        div.Remove(img);

        Assert.assertEquals(img.getParent(), null);
        Assert.assertEquals(div.getChild(1), null);
    }
}
