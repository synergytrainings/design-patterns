package com.synisys.training.patterns.structural.adapter;

/**
 * Target  - is the class for which we wish to implement the adapter
 * Only this class will deal with client class.
 *
 * @author Anania.Mikaelyan
 * @since 11/13/2014
 */
public interface Classifier {
    Long getId();
    String getName();
}
