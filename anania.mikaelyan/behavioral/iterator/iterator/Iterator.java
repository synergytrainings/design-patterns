package com.synisys.training.patterns.behavioral.iterator.iterator;

/**
 * @author Anania.Mikaelyan
 * @since 3/13/2015
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
