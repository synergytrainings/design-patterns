package com.armen.mkrtchyan.strategy.impl;

import com.armen.mkrtchyan.strategy.api.MergeStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Apr 14, 2015</pre>
 */
public class Intersect implements MergeStrategy {
    @Override
    public List<String> merge(List<String> first, List<String> second) {
        HashSet<String> hashSet = new HashSet<>(first);
        hashSet.addAll(second);
        ArrayList<String> strings = new ArrayList<>(hashSet);
        Collections.sort(strings);
        return strings;
    }
}
