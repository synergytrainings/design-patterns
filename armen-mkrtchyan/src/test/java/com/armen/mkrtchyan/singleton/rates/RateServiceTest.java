package com.armen.mkrtchyan.singleton.rates;

import org.junit.*;

import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * RateService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Nov 9, 2014</pre>
 */
public class RateServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetRate() throws Exception {
        Assume.assumeNotNull(RateService.getInstance().getRate(Currency.getInstance(Locale.GERMANY).getCurrencyCode(),
                new GregorianCalendar(2010, 6, 1)));
    }

    @Test
    public void testGetInstance() throws Exception {
        Assert.assertTrue("instances if singleton are not same", RateService.getInstance() == RateService.getInstance());
    }


} 
