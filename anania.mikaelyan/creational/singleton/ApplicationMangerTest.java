package com.synisys.training.patterns.singleton;


import org.junit.Assert;

import org.junit.Test;

/**
 * @author : Anania.Mikaelyan
 * @since : 11/10/2014
 */
public class ApplicationMangerTest {


    @Test
    public void testApplicationManagerMethods() throws Exception {
        Assert.assertEquals("The name of this application is a great secret", ApplicationManager.getInstance().getApplicationName());
    }

    @Test
    public void testApplicationManagerEnumWayMethods() throws Exception {
        Assert.assertEquals("The name of this application is a great secret", ApplicationManagerEnumYay.INSTANCE.getApplicationName());
    }



    @Test
    public void testInstanceIsAlwaysTheSame() throws Exception {
        Assert.assertEquals("Application manager getInstance is always the same", ApplicationManager.getInstance(),ApplicationManager.getInstance());
    }
}
