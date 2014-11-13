package com.synisys.training.patterns.structural.adapter;

/**
 * Right implementation of target interface
 *
 * @author Anania.Mikaelyan
 * @since 11/13/2014
 */
public class ClassifierImpl implements Classifier {
    private final Long id;
    private final String name;

    public ClassifierImpl(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
