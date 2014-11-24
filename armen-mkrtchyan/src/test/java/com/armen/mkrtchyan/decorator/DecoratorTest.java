package com.armen.mkrtchyan.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDraw() throws Exception {
        Assert.assertEquals(new WidthStyleDecorator(
                new ColorStyleDecorator(
                        new DivComponent(),
                        "yellow"),
                100,
                "px").draw(), "<div style='width: 100px,background-color: yellow'></div>");
    }
}