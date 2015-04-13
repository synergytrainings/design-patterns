package com.armen.mkrtchyan.strategy.impl;

import com.armen.mkrtchyan.strategy.api.MergeStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Apr 14, 2015</pre>
 */
public class FastForward implements MergeStrategy {
    @Override
    public List<String> merge(List<String> first, List<String> second) {
        if (first.get(first.size() - 1).compareTo(second.get(0)) >= 0) {
            throw new IllegalStateException("Cannot fast forward");
        } else {
            ArrayList<String> result = new ArrayList<>(first);
            result.addAll(second);
            return result;
        }
    }
}
