package com.synisys.training.patterns.adapter;

import com.synisys.training.patterns.adapter.impl.ListAsQueueClassAdapter;
import com.synisys.training.patterns.adapter.impl.ListAsQueueObjectAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

public class TestAdapter {

	@Test
	public void testObjectAdapter() {
		List<Integer> list = new ArrayList(){{
			add(1);
			add(2);
			add(3);
		}};
		
		Queue<Integer> adaptedQueue = new ListAsQueueObjectAdapter<>(list);
		Assert.assertEquals(list.get(0), adaptedQueue.peek());
		Assert.assertEquals(3, adaptedQueue.size());
	}
	
	@Test
	public void testClassAdapter() {
		Queue<Integer> adaptedQueue = new ListAsQueueClassAdapter<>();
		adaptedQueue.add(1);
		adaptedQueue.add(2);
		adaptedQueue.add(3);
		Assert.assertEquals(Integer.valueOf(1), adaptedQueue.peek());
		Assert.assertEquals(3, adaptedQueue.size()); 
		
	}
}
