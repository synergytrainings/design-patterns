package com.armen.mkrtchyan.bridge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonImplTest{

    @Before
    public void before() throws Exception {
    }

    @Test
    public void testIsMature() throws Exception {
        PersonImpl iranianFemale = new PersonImpl("Blah", "Blah", 11, true, Country.IRAN);
        Assert.assertTrue(iranianFemale.isMature());
        PersonImpl iranianMale = new PersonImpl("Blah", "Blah", 11, false, Country.IRAN);
        Assert.assertFalse(iranianMale.isMature());
        PersonImpl cubanAdult = new PersonImpl("Blah", "Blah", 17, true, Country.CUBA);
        Assert.assertTrue(cubanAdult.isMature());
        PersonImpl cubanKid = new PersonImpl("Blah", "Blah", 15, true, Country.CUBA);
        Assert.assertFalse(cubanKid.isMature());
        PersonImpl americanAdult = new PersonImpl("Blah", "Blah", 19, true, Country.USA);
        Assert.assertTrue(americanAdult.isMature());
        PersonImpl americanKid = new PersonImpl("Blah", "Blah", 18, true, Country.USA);
        Assert.assertFalse(americanKid.isMature());
    }
}