package com.synisys;

import java.util.ArrayList;
import java.util.Enumeration;

public class MyArrayList<T> extends ArrayList<T> {
	private static final long serialVersionUID = 1L;
	
	private Enumeration<T> enumerator; 
	
	
    public MyArrayList() {
    }

    public Enumeration<T> enumerator() {
    	 return new EnumeratorAdapter<T>(this.iterator());

    }

    public boolean hasMoreElements() {
    	return this.enumerator.hasMoreElements();
    }

    public T nextElement() {
    	return this.enumerator.nextElement();
    }

    

    

}