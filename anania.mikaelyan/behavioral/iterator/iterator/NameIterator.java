package com.synisys.training.patterns.behavioral.iterator.iterator;


/**
 * @author Anania.Mikaelyan
 * @since 3/13/2015
 */
public class NameIterator implements Iterator<String> {
    int index;
    private final String[] names;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}
