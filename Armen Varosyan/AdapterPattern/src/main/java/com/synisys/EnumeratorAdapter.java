package com.synisys;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdapter<T> implements Enumeration<T> {

    private Iterator<T> adaptee;

    public EnumeratorAdapter(Iterator<T> it) {
    	this.adaptee = it;
    }

    public boolean hasMoreElements() {
    	return adaptee.hasNext();
    }

    public T nextElement() {
    	return adaptee.next();
    }

}