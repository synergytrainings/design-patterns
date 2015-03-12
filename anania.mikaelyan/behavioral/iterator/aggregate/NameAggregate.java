package com.synisys.training.patterns.behavioral.iterator.aggregate;

import com.synisys.training.patterns.behavioral.iterator.iterator.Iterator;
import com.synisys.training.patterns.behavioral.iterator.iterator.NameIterator;

/**
 * @author Anania.Mikaelyan
 * @since 3/13/2015
 */
public class NameAggregate implements Aggregate<String> {
    private String names[];

    public NameAggregate(String[] names) {
        this.names = names;
    }

    @Override
    public NameIterator getIterator() {
        return new NameIterator(names);
    }
}
