package com.armen.mkrtchyan.flyweight.route;

import org.junit.Assert;
import org.junit.Test;

public class FlyweightTest {

    @Test
    public void testCreate() throws Exception {
        Assert.assertSame(CrossroadFactory.create(0, 1), CrossroadFactory.create(0, 1));
    }
}