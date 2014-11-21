package com.armen.mkrtchyan.composite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompositeTest {

    private SectionViewData modifiedViewData;
    private SectionViewData unmodifiedViewData;

    @Before
    public void setUp() throws Exception {
        modifiedViewData = new SectionViewData("1");
        modifiedViewData.addChild(new SectionViewData("2"));
        modifiedViewData.addChild(new FieldViewData(true, "3"));
        unmodifiedViewData = new SectionViewData("1");
        unmodifiedViewData.addChild(new SectionViewData("2"));
        unmodifiedViewData.addChild(new FieldViewData(false, "3"));
    }

    @Test
    public void testHasModifications() throws Exception {
        Assert.assertTrue(modifiedViewData.hasModifications());
        Assert.assertFalse(unmodifiedViewData.hasModifications());
    }
}