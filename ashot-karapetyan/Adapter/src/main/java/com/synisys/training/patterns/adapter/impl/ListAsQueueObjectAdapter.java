package com.synisys.training.patterns.adapter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.synisys.training.patterns.adapter.api.ListAsQueueAdapter;

/**
 * Implementation of {@link ListAsQueueAdapter} using <b> object adapter</b>
 * design pattern.
 * 
 */
public class ListAsQueueObjectAdapter<E> implements ListAsQueueAdapter<E> {

	private List<E> list;

	public ListAsQueueObjectAdapter(List<E> list) {
		// convert to array list to be sure that new element is added in the end
		// of list.
		this.list = new ArrayList<>(list);
	}

	@Override
	public boolean add(E e) {
		return this.list.add(e);
	}

	@Override
	public boolean offer(E e) {
		return this.list.add(e);
	}

	@Override
	public E remove() {
		return this.list.remove(0);
	}

	@Override
	public E poll() {
		if (this.list.isEmpty()) {
			return null;
		} else {
			return remove();
		}
	}

	@Override
	public E element() {
		return this.list.get(0);
	}

	@Override
	public E peek() {
		if (this.list.isEmpty()) {
			return null;
		} else {
			return element();
		}
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return this.list.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.list.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return this.list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return this.list.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.list.retainAll(c);
	}

	@Override
	public void clear() {
		this.list.clear();
	}

}
