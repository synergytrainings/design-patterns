package com.synisys.training.patterns.behavioral.iterator.aggregate;

import com.synisys.training.patterns.behavioral.iterator.iterator.Iterator;

/**
 * @author Anania.Mikaelyan
 * @since 3/13/2015
 */
public interface Aggregate<T> {
    public Iterator<T> getIterator();
}
