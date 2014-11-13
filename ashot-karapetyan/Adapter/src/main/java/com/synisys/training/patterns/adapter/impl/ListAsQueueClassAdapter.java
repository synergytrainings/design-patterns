package com.synisys.training.patterns.adapter.impl;

import java.util.ArrayList;

import com.synisys.training.patterns.adapter.api.ListAsQueueAdapter;

/**
 * Implementation of {@link ListAsQueueAdapter} using <b> class adapter</b>
 * design pattern.
 * 
 */
public class ListAsQueueClassAdapter<E> extends ArrayList<E> implements ListAsQueueAdapter<E>{

	@Override
	public boolean offer(E e) {
		return add(e);
	}

	@Override
	public E remove() {
		return remove(0);
	}

	@Override
	public E poll() {
		if(isEmpty()) {
			return null;
		}
		else {
			return remove();
		}
	}

	@Override
	public E element() {
		return get(0);
	}

	@Override
	public E peek() {
		if(isEmpty()) {
			return null;
		}
		else {
			return element();
		}
	}

}
