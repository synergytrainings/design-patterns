package com.synisys.trainings.proxy.test;

import static org.junit.Assert.*;


import java.lang.reflect.Field;

import org.junit.Test;

import com.synisys.trainings.proxy.api.ListBuilder;
import com.synisys.trainings.proxy.impl.ListBuilderProxy;




public class ProxyTest {
	@Test
	public void test() {
		try {
			ListBuilder listBuilderProxy = new ListBuilderProxy();
			Field privateField = ListBuilderProxy.class.getDeclaredField("listBuilder");
			privateField.setAccessible(true);
			assertNull((ListBuilder) privateField.get(listBuilderProxy));
			listBuilderProxy.draw();
			assertNotNull((ListBuilder) privateField.get(listBuilderProxy));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
